/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsSpinnersFromChatGPT
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-09
    Purpose:	The purpose of this program is to demonstrate spinners and dynamic binding in JavaFX.
                Also, this program was generated initially by ChatGPT but then modified until it works
                (sort of...)  We will be discussing a lot about what works (and doesn't) with these
                machine-learning algorithms!

                The prompt would need to be significantly modified to implement naming convention 
                standards.  Also, some of the code generated simply was incorrect and had to be either
                modified or removed and replaced with correct functionality.  

                We will be going over this in more detail in the next class. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-09	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EW_GraphicsSpinnersFromChatGPT extends Application {

    Color color = Color.rgb(0, 0, 0); // Initial color
    Spinner<Integer> redSpinner = createSpinner(0, 255);
    Spinner<Integer> greenSpinner = createSpinner(0, 255);
    Spinner<Integer> blueSpinner = createSpinner(0, 255);
    Spinner<Integer> radiusSpinner = createRandomRadiusSpinner(10, 150);
    Circle circle = new Circle(100); // Initial radius
    Label redSpinnerLabel = new Label("Red Component: ");
    Label greenSpinnerLabel = new Label("Green Component: ");
    Label blueSpinnerLabel = new Label("Blue Component: ");
    Label radiusSpinnerLabel = new Label("Radius: ");

    @Override
    public void start(Stage primaryStage) {

        circle.setStroke(Color.BLACK);
        circle.setFill(color);

        VBox vbox = new VBox(5); // Set spacing between elements
        vbox.getChildren().addAll(
                redSpinnerLabel, redSpinner, greenSpinnerLabel, greenSpinner, 
                blueSpinnerLabel, blueSpinner, radiusSpinnerLabel, radiusSpinner, circle);
        radiusSpinner.getValueFactory().setValue(100);
        StackPane root = new StackPane(vbox);

        vbox.setAlignment(Pos.CENTER);
        vbox.setBorder(Border.stroke(Color.DARKRED));
        vbox.setMinWidth(180);
        Scene scene = new Scene(root, 330, 550);
        redSpinner.getEditor().textProperty().addListener((obs, oldValue, newValue) -> handleColorChanges());
        greenSpinner.getEditor().textProperty().addListener((obs, oldValue, newValue) -> handleColorChanges());
        blueSpinner.getEditor().textProperty().addListener((obs, oldValue, newValue) -> handleColorChanges());
        
        circle.radiusProperty().bind(radiusSpinner.valueProperty());

        primaryStage.setTitle("Spinner Circle Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void handleColorChanges(){
        // Handler for color chagnes
        color = new Color(redSpinner.getValue()/255.0f,
                greenSpinner.getValue()/255.0f,
                blueSpinner.getValue()/255.0f,1f);
        circle.setFill(color);
    }

    private Spinner<Integer> createSpinner(int min, int max) {
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(min, max,150);
        Spinner<Integer> spinner = new Spinner<Integer>(valueFactory);
        spinner.setEditable(true);
        return spinner;
    }

    private Spinner<Integer> createRandomRadiusSpinner(int min, int max) {
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(min, max);
        Spinner<Integer> spinner = new Spinner<Integer>(valueFactory);
        spinner.setEditable(true);
        return spinner;
    }

    public static void main(String[] args) {
        launch(args);
    }
}