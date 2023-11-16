/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week13_GUI_Program_1_SpinnerForFontSize
    Author:		AJ
    Language:	Java
    Date:		2023-11-14
    Purpose:	The purpose of this program is to design a JavaFX application that displays a Text object
                and a spinner control that controls the font size of the text.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-14	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules    
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Creating the class
public class AJ_Week13_GUI_Program_1_SpinnerForFontSize extends Application{
    
    // Creating the start method
    @Override
    public void start(Stage stgApp) throws Exception {
        
        // Creating a Text node txtCharacter
        Text txtCharacter = new Text("Java is better than C++");

        // Setting the font for Text node
        txtCharacter.setFont(Font.font("Comic Sans MS",28));
        
        // Creating the Spinner object "spinnerFontSize"
        Spinner<Integer> spinnerFontSize = new Spinner<>(1, 50, 28);   // Min: 1, Max: 50, Initial: 28

        // Enabling the option for editing the spinner object
        spinnerFontSize.setEditable(true);

        // Adding a listener to update the font size when the spinner value changes
        spinnerFontSize.valueProperty().addListener((intObservable, intOldValue, intNewValue) -> {

            // Setting the font size to the newValue
            txtCharacter.setFont(new Font(intNewValue.doubleValue()));
        });
        
        // Creating a VBox object "vboxContainer"
        VBox vboxContainer = new VBox(10);

        // Adding text node "txtCharacter" and spinner object "spinnerFontSize" to "vboxContainer"
        vboxContainer.getChildren().addAll(txtCharacter,spinnerFontSize);

        // Setting the Alignment for "vboxContainer"
        vboxContainer.setAlignment(Pos.CENTER);

        // Setting the Style for "vboxContainer"
        vboxContainer.setStyle("-fx-background-color: GHOSTWHITE");
        
        // Setting the Minimum size for "vboxContainer"
        vboxContainer.setMinSize(300, 200);
        
        // Creating the scene 
        Scene scene = new Scene(vboxContainer,700,500);

        // Setting the scene
        stgApp.setScene(scene);

        // Setting the title
        stgApp.setTitle("Spinners for Font Size");
        stgApp.show();

    }

    
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }
    
}
