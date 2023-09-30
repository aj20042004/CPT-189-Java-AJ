/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_GUI_Program_1_pizzaToppings
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to design a JavaFX application that allows the user to pick
                a set of pizza toppings using a set of check boxes. We are going to assume that, each 
                toppings cost $1.50 and a plain pizza cost $10.50. We are displaying the cost of pizza
                and update the value as the user change selections.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week06_GUI_Program_1_pizzaToppings extends Application {

    private double dblPizzaCost = 10.50;
    private double dblEachToppingsCst = 1.50;

    
    @Override 
    public void start(Stage stgMyStage) {


        VBox vboxParentContainer = new VBox(20);

        Text txtOriginalPizzaLabel = new Text("Plain Pizza: $10.50");
        txtOriginalPizzaLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));
        vboxParentContainer.getChildren().add(txtOriginalPizzaLabel);

        Text txtEachToppings = new Text("Each Topping: $1.50" );
        txtEachToppings.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));
        vboxParentContainer.getChildren().add(txtEachToppings);

        Text txtCurrentPrice = new Text("Your Current Total Price: $" + String.format("%.2f",dblPizzaCost));
        txtCurrentPrice.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 24));
        vboxParentContainer.getChildren().add(txtCurrentPrice);

        CheckBox cbOnion = new CheckBox("Onion");
        CheckBox cbCorn = new CheckBox("Corn");
        CheckBox cbTomato = new CheckBox("Tomato");
        CheckBox cbOlives = new CheckBox("Olives");
        CheckBox cbChicken = new CheckBox("Chicken");

        increaseCheckBoxFont(cbChicken);
        increaseCheckBoxFont(cbCorn);
        increaseCheckBoxFont(cbOlives);
        increaseCheckBoxFont(cbOnion);
        increaseCheckBoxFont(cbTomato);


        cbChicken.setOnAction(e -> updateCost(txtCurrentPrice, cbChicken.isSelected()));
        cbCorn.setOnAction(e -> updateCost(txtCurrentPrice, cbCorn.isSelected()));
        cbOlives.setOnAction(e -> updateCost(txtCurrentPrice, cbOlives.isSelected()));
        cbOnion.setOnAction(e -> updateCost(txtCurrentPrice, cbOnion.isSelected()));
        cbTomato.setOnAction(e -> updateCost(txtCurrentPrice, cbTomato.isSelected()));
        
        HBox hboxToppingsBox = new HBox(10, cbChicken,cbCorn,cbOlives,cbOnion,cbTomato);
        hboxToppingsBox.setAlignment(Pos.CENTER);

        vboxParentContainer.getChildren().addAll(hboxToppingsBox);
        vboxParentContainer.setAlignment(Pos.CENTER);

        Scene scnMyScene = new Scene(vboxParentContainer, 600, 500);
        stgMyStage.setScene(scnMyScene);
        stgMyStage.setTitle("Pizza Toppings");
        stgMyStage.show();

    }


    private void updateCost(Text txtCurrentPrice, boolean blnIsSelected) {

        if(blnIsSelected){

            dblPizzaCost += dblEachToppingsCst;
        }

        else{
            dblPizzaCost -= dblEachToppingsCst;
        }

        txtCurrentPrice.setText("Your Current Total Price: $" + String.format("%.2f",dblPizzaCost));
    }


    private void increaseCheckBoxFont(CheckBox checkBox) { 
        checkBox.setStyle("-fx-font-size: 16;");
    }


    public static void main(String[] args) {
        launch(args);
    }



    
}
