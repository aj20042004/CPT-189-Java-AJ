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

// Importing the modules
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
    
    // Private variables
    private double dblPizzaCost = 10.50;
    private double dblEachToppingsCst = 1.50;

    // Start Method
    @Override 
    public void start(Stage stgMyStage) {
        
        // Creating a VBox
        VBox vboxParentContainer = new VBox(20);
        
        // Creating a Text Node to display the Original Plain Pizza cost
        Text txtOriginalPizzaLabel = new Text("Plain Pizza: $10.50");
        txtOriginalPizzaLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));
        vboxParentContainer.getChildren().add(txtOriginalPizzaLabel);
        
        // Creating a Text Node to display the Each Toppings cost
        Text txtEachToppings = new Text("Each Topping: $1.50" );
        txtEachToppings.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));
        vboxParentContainer.getChildren().add(txtEachToppings);
        
        // Creating a Text Node to display the Current Total Price
        Text txtCurrentPrice = new Text("Your Current Total Price: $" + String.format("%.2f",dblPizzaCost));
        txtCurrentPrice.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 24));
        vboxParentContainer.getChildren().add(txtCurrentPrice);
        
        // Creating the Check Boxes for toppings: Onion, Corn, Tomato, Olives and Chicken.
        CheckBox cbOnion = new CheckBox("Onion");
        CheckBox cbCorn = new CheckBox("Corn");
        CheckBox cbTomato = new CheckBox("Tomato");
        CheckBox cbOlives = new CheckBox("Olives");
        CheckBox cbChicken = new CheckBox("Chicken");
        
        // Increasing the font-size of the Check box label.
        increaseCheckBoxFont(cbChicken);
        increaseCheckBoxFont(cbCorn);
        increaseCheckBoxFont(cbOlives);
        increaseCheckBoxFont(cbOnion);
        increaseCheckBoxFont(cbTomato);

        // Updating the current total price when user clicks the check boxes
        cbChicken.setOnAction(e -> updateCost(txtCurrentPrice, cbChicken.isSelected()));
        cbCorn.setOnAction(e -> updateCost(txtCurrentPrice, cbCorn.isSelected()));
        cbOlives.setOnAction(e -> updateCost(txtCurrentPrice, cbOlives.isSelected()));
        cbOnion.setOnAction(e -> updateCost(txtCurrentPrice, cbOnion.isSelected()));
        cbTomato.setOnAction(e -> updateCost(txtCurrentPrice, cbTomato.isSelected()));
        
        // Creating and adding elements to the Hbox
        HBox hboxToppingsBox = new HBox(10, cbChicken,cbCorn,cbOlives,cbOnion,cbTomato);

        // Aligning the hbox to the center
        hboxToppingsBox.setAlignment(Pos.CENTER);
        
        // Adding the hbox to the vboxParentContainer
        vboxParentContainer.getChildren().addAll(hboxToppingsBox);
        vboxParentContainer.setAlignment(Pos.CENTER);
        
        // Creating and adding elements to the scene. 
        Scene scnMyScene = new Scene(vboxParentContainer, 600, 500);
        stgMyStage.setScene(scnMyScene);

        // Setting the title for the application
        stgMyStage.setTitle("Pizza Toppings");
        stgMyStage.show();

    }

    // Private updateCost method for updating the current total price when user clicks the check box
    private void updateCost(Text txtCurrentPrice, boolean blnIsSelected) {
        
        // Adding the each topping cost when check box is clicked
        if(blnIsSelected){

            dblPizzaCost += dblEachToppingsCst;
        }
        
        // Subtracting the each topping cost when decides to remove the topping.
        else{
            dblPizzaCost -= dblEachToppingsCst;
        }
        
        // Setting the new updated total
        txtCurrentPrice.setText("Your Current Total Price: $" + String.format("%.2f",dblPizzaCost));
    }

    // Private method for increasing the font size of CheckBox labels
    private void increaseCheckBoxFont(CheckBox checkBox) { 
        checkBox.setStyle("-fx-font-size: 16;");
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }
    
}
