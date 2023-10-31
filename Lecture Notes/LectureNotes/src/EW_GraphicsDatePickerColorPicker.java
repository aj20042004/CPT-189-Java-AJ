/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsDatePickerColorPicker
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to demonstrate using JavaFX to create and use both
                a DatePicker and a ColorPicker.  Also demonstrates some date handling routines.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EW_GraphicsDatePickerColorPicker extends Application {

    private Text txtMessage;
    private DatePicker dpDatePicker;
    private ColorPicker cpColorPicker;

    /*
     * This programs displays a date and color picker. The user will
     * pick a day and the color and then display the day of the week
     * for the date picked in the color they selected.
     */
    public void start(Stage stgMyStage) {
        dpDatePicker = new DatePicker(LocalDate.now()); // get a new DatePicker using the system date
        dpDatePicker.setOnAction(this::processDateChoice);

        cpColorPicker = new ColorPicker(Color.BLACK);
        cpColorPicker.setOnAction(this::processColorChoice);

        txtMessage = new Text("HAPPY " + LocalDate.now().getDayOfWeek()); // use date functions
        txtMessage.setFont(Font.font("Comic Sans MS", FontWeight.BOLD,
                FontPosture.REGULAR, 24));

        HBox hbxThePickers = new HBox(dpDatePicker, cpColorPicker);
        hbxThePickers.setSpacing(15);
        hbxThePickers.setAlignment(Pos.CENTER);

        VBox vbxWholeCanvas = new VBox();
        vbxWholeCanvas.setStyle("-fx-background-color: blanchedalmond");
        vbxWholeCanvas.setSpacing(20);
        vbxWholeCanvas.setAlignment(Pos.CENTER);
        vbxWholeCanvas.getChildren().addAll(hbxThePickers, txtMessage);

        Scene scnMyScene = new Scene(vbxWholeCanvas, 400, 150);

        stgMyStage.setTitle("Color and Date Picker Example");
        stgMyStage.setScene(scnMyScene);
        stgMyStage.show();
    }

    /*
     * Get the value of the date picker and update the message with the day of the
     * week
     */
    public void processDateChoice(ActionEvent event) {
        LocalDate date = dpDatePicker.getValue();
        txtMessage.setText("HAPPY " + date.getDayOfWeek());
    }

    /*
     * Get the color from the color picker and use it to update the color ofthe
     * message
     */
    public void processColorChoice(ActionEvent event) {
        txtMessage.setFill(cpColorPicker.getValue());
    }

    public static void main(String[] args) {
        launch(args);
    }

}