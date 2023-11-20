import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TwoScenesExample extends Application {

    
    private Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       
        primaryStage.setTitle("Two Scenes Example");

        // Scene 1
        Button scene1Button = new Button("Go to Scene 2");
        StackPane layout1 = new StackPane();
        layout1.setStyle("-fx-background-color: lightblue;");
        layout1.getChildren().add(scene1Button);
        scene1 = new Scene(layout1, 500, 400);

        // Scene 2
        Button scene2Button = new Button("Go to Scene 1");
        StackPane layout2 = new StackPane();
        layout2.setStyle("-fx-background-color: lightgreen;");
        layout2.getChildren().add(scene2Button);
        scene2 = new Scene(layout2, 500, 400);

        // Set the initial scene
        primaryStage.setScene(scene1);

        // Button actions to switch between scenes
        scene1Button.setOnAction(e -> primaryStage.setScene(scene2));
        scene2Button.setOnAction(e -> primaryStage.setScene(scene1));

        primaryStage.show();
    }

}
