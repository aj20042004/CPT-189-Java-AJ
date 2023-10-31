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
        Text googleLogo = new Text("GooGle");
        googleLogo.setFont(Font.font("Arial", 36));

        // Create TextField with CSS style and increased height
        TextField textField = new TextField();
        textField.setPromptText("Enter text here");
        textField.setStyle("-fx-background-radius: 15; -fx-border-radius: 15; -fx-border-color: #ccc; -fx-background-color: #f4f4f4;");
        textField.setPrefHeight(40); // Increase the height

        // Create ColorPicker
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.BLACK);

        // Create Button
        Button button = new Button("Change Text Color");
        button.setMinWidth(150); // Increase button size

        // Set up event handling (same as previous code)

        // Create VBox to hold the elements
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(googleLogo, textField, colorPicker, button);

        // Create Scene
        Scene scene = new Scene(vbox);

        // Set the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Color Changer");
        primaryStage.show();
    }
}
