import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GoogleLogoApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create Google-like logo using Text

        Button btnBuildYourOwnPizza = new Button("Build your own");
        btnBuildYourOwnPizza.setLayoutX(49);
        btnBuildYourOwnPizza.setLayoutY(300);
        btnBuildYourOwnPizza.setFont(Font.font("Geometric Sans-Serif", 14));

    

        // Set the stage

        primaryStage.setTitle("Text Color Changer");
        primaryStage.show();
    }
}
