/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_GUI_Program_1_CountMouseClicks
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week12_GUI_Program_1_CountMouseClicks extends Application {

    private int intCounter = 0;
    private Text txtResetTheCounter = new Text();
    private Text txtInstructions = new Text();

    public void start(Stage stgApp) {

        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));

        Button btnReset = new Button("Reset the Counter");
        btnReset.setMinHeight(40);
        btnReset.setMinWidth(100);

        btnReset.setOnAction(e -> resetCounter());

        BorderPane borderPane = new BorderPane();

        borderPane.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        borderPane.setTop(txtInstructions);
        BorderPane.setAlignment(txtInstructions, Pos.CENTER);

        borderPane.setCenter(btnReset);
        BorderPane.setAlignment(btnReset, Pos.CENTER);
        BorderPane.setMargin(btnReset, new Insets(15));

        borderPane.setBottom(txtResetTheCounter);
        BorderPane.setAlignment(txtResetTheCounter, Pos.CENTER);
        BorderPane.setMargin(btnReset, new Insets(15));

        Scene scnMyScene = new Scene(borderPane, 800, 700);
        scnMyScene.setOnMouseClicked(this::processMousePress);
        stgApp.setScene(scnMyScene);
        stgApp.setTitle("Counter");
        stgApp.show();

    }

    public void processMousePress(MouseEvent event) {
        txtResetTheCounter.setText("");
        intCounter += 1;
        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));
    }

    private void resetCounter() {
        intCounter = 0;
        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));
        txtResetTheCounter.setText("Your Counter has been reset ! ");
        txtResetTheCounter.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 25));

    }

    public static void main(String[] args) {
        launch(args);
    }

}
