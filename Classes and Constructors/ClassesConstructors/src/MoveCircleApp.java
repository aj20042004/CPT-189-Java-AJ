import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class MoveCircleApp extends Application {

    private Circle circle;
    private Pane pane;

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        circle = new Circle(50, Color.BLUE);

        // Create a pane to hold the circle
        pane = new Pane(circle);

        // Create a button
        Button moveButton = new Button("Move Circle");
        moveButton.setOnAction(e -> moveCircle());

        // Create a layout
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(moveButton);
        BorderPane.setMargin(moveButton, new Insets(10));

        // Create a scene
        Scene scene = new Scene(borderPane, 400, 400);

        // Set up the stage
        primaryStage.setTitle("Move Circle App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveCircle() {
        // Get the dimensions of the pane
        double paneWidth = pane.getWidth();
        double paneHeight = pane.getHeight();

        // Generate random coordinates within the pane
        Random random = new Random();
        double newX = random.nextDouble() * (paneWidth - 2 * circle.getRadius()) + circle.getRadius();
        double newY = random.nextDouble() * (paneHeight - 2 * circle.getRadius()) + circle.getRadius();

        // Set the new coordinates for the circle
        circle.setCenterX(newX);
        circle.setCenterY(newY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
