import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackedShapesApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create shapes
        Rectangle rectangle = new Rectangle(100, 100);
        rectangle.setFill(Color.rgb(255, 0, 0, 0.5)); // Semi-transparent red
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        Circle circle = new Circle(80);
        circle.setFill(Color.rgb(255, 165, 0, 0.5)); // Semi-transparent orange
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Ellipse ellipse = new Ellipse(70, 50);
        ellipse.setFill(Color.rgb(0, 0, 255, 0.5)); // Semi-transparent blue
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
                0.0, 0.0,
                100.0, 0.0,
                50.0, 100.0
        );
        polygon.setFill(Color.rgb(255, 255, 0, 0.5)); // Semi-transparent yellow
        polygon.setStroke(Color.BLACK);
        polygon.setStrokeWidth(2);

        Arc arc = new Arc(100, 100, 50, 50, 45, 180); // Create an Arc
        arc.setFill(Color.rgb(128, 0, 128, 0.5)); // Semi-transparent purple
        arc.setStroke(Color.BLACK);
        arc.setStrokeWidth(2);

        // Create a VBox to stack the shapes vertically
        VBox shapeVBox = new VBox(); // Spacing between shapes
        shapeVBox.setAlignment(Pos.CENTER); // Align to center
        
        shapeVBox.getChildren().addAll(arc, polygon, ellipse, circle, rectangle);

        // Create a Text object
        Text text = new Text("Your Name");
        text.setFont(Font.font("Arial", 20));
        text.setFill(Color.BLACK);

        // Create a StackPane for the text
        StackPane textStackPane = new StackPane();
        textStackPane.getChildren().add(text);

        // Create an HBox to center the VBox horizontally
        HBox centerHBox = new HBox();
        centerHBox.setAlignment(Pos.CENTER);
        centerHBox.getChildren().addAll(shapeVBox);

        // Create a BorderPane to organize layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(textStackPane); // Place text at the top
        borderPane.setCenter(centerHBox); // Place shapes at the center

        // Set up the scene and stage
        Scene scene = new Scene(borderPane, 900, 700);
        primaryStage.setTitle("Stacked Shapes with Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
