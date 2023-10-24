/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsListViewAndSplitPane
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to create a JavaFX SplitPane that has a listview on the
                left side with a list of fruits and the right side shows a description when each fruit
                is picked.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class EW_GraphicsListViewAndSplitPane extends Application {

    private ListView<String> lvFruitNames;
    private TextFlow txtFruitDescContainer;
    private Text txtFruitDescription;
    private String[] strFruits = {"Apple", "Orange", "Banana", "Grapes", "Watermellon"};
    private String[] strDescriptions = {
            "A round fruit with a red, green, or yellow skin and a white flesh.",
            "A round fruit with a tough, shiny, orange skin and a juicy, sweet, orange-colored flesh.",
            "A long, curved fruit with a yellow or green skin and a soft, sweet flesh.",
            "A small, juicy fruit with a thin skin and a sweet or sour taste.",
            "A large, juicy fruit with a green rind and a red or pink flesh."
        };

    @Override
    public void start(Stage stgMyStage) {
        txtFruitDescription = new Text("Fruit Descriptions Will Show Here!");
        txtFruitDescription.setFont(new Font("Comic Sans MS", 40));
        txtFruitDescContainer = new TextFlow(txtFruitDescription);
        StackPane stkpShowDescription = new StackPane(txtFruitDescContainer);
        stkpShowDescription.setMinWidth(300);
        ObservableList listFruitNames = FXCollections.observableArrayList();
        listFruitNames.addAll(strFruits); 
        lvFruitNames = new ListView<>(listFruitNames);
        lvFruitNames.setMinWidth(100);
        lvFruitNames.setStyle("-fx-font-size: 1.5em ;");
//        lvFruitNames.getSelectionModel().select(0);
        lvFruitNames.getSelectionModel().selectedItemProperty().addListener(    // syntax to assign a local method
            this::processFruitSelected);
        SplitPane spltWholeArea = new SplitPane(lvFruitNames, stkpShowDescription);
        spltWholeArea.setDividerPositions(.25);         // set divder at 1/4 of the width
        Scene scnMyScene = new Scene(spltWholeArea,500,400);
        stgMyStage.setTitle("Listview, Splitpane Example");
        stgMyStage.setScene(scnMyScene);
        stgMyStage.show();
    }
    public void processFruitSelected(ObservableValue<? extends String> val,
           String oldValue, String newValue) {
        int intFruitIndex = lvFruitNames.getSelectionModel().getSelectedIndex();
        txtFruitDescription.setText(strDescriptions[intFruitIndex] );
        switch(lvFruitNames.getSelectionModel().getSelectedItem()){
            case "Apple":
                txtFruitDescContainer.setStyle("-fx-background-color: Red");
                break;
            case "Orange":
                txtFruitDescContainer.setStyle("-fx-background-color: Orange");
                break;
            case "Banana":
                txtFruitDescContainer.setStyle("-fx-background-color: Yellow");
                break;
            case "Grapes":
                txtFruitDescContainer.setStyle("-fx-background-color: Purple");
                break;
            case "Watermellon":
                txtFruitDescContainer.setStyle("-fx-background-color: Pink");
                break;
        }
   }
   public static void main(String[] args) {
        launch(args);
   }
}