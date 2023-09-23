import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class RandomNumberApp extends Application {

    private Text randomNumberText;

    @Override
    public void start(Stage primaryStage) {
        // Create a Text node to display the random number
        randomNumberText = new Text("Click the button to generate a random number");
        
        // Create a Button
        Button generateButton = new Button("Generate Random Number");
        generateButton.setOnAction(e -> generateRandomNumber());

        // Create a VBox layout to stack the elements vertically
        VBox root = new VBox(10); // 10 is the spacing between elements
        root.getChildren().addAll(randomNumberText, generateButton);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Random Number Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        randomNumberText.setText("Generated Random Number: " + randomNumber);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
