/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week13_GUI_Program_1_SpinnerForFontSize
    Author:		AJ
    Language:	Java
    Date:		2023-11-14
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-14	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week13_GUI_Program_1_SpinnerForFontSize extends Application{

    @Override
    public void start(Stage stgApp) throws Exception {

        Text txtCharacter = new Text("Java is better than C++");
        txtCharacter.setFont(Font.font("Comic Sans MS",28));

        

        Spinner<Integer> SpinnerFontSize = new Spinner<>(1, 50, 28); // Min: 1, Max: 50, Initial: 28
        SpinnerFontSize.setEditable(true);

        // Add a listener to update the font size when the spinner value changes
        SpinnerFontSize.valueProperty().addListener((observable, oldValue, newValue) -> {
            txtCharacter.setFont(new Font(newValue.doubleValue()));
        });

        VBox VboxContainer = new VBox(10);
        VboxContainer.getChildren().addAll(txtCharacter,SpinnerFontSize);
        VboxContainer.setAlignment(Pos.CENTER);
        VboxContainer.setStyle("-fx-background-color: GHOSTWHITE");

        VboxContainer.setMinSize(300, 200);

        Scene scene = new Scene(VboxContainer,700,500);
        stgApp.setScene(scene);
        stgApp.setTitle("Spinners for Font Size");
        stgApp.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
