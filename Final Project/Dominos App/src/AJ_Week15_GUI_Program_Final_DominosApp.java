/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week15_GUI_Program_Final_ECommerce
    Author:		AJ
    Language:	Java
    Date:		2023-11-17
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-17	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class AJ_Week15_GUI_Program_Final_DominosApp extends Application {

    private double dblPizzaCost = 10.50;
    private double dblEachToppingsCst = 1.50;
    private Text txtMessageForAddToYourCart = new Text("");
    private Text txtCurrentPrice = new Text("Your Current Total Price: $" + String.format("%.2f", dblPizzaCost));

    @Override
    public void start(Stage stgApp) throws Exception {

        Pane paneMain = new Pane();
        Scene sceneMain = new Scene(paneMain, 800, 600);

        Rectangle rectangleDominosHeader = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground = new Rectangle(1000, 700, Color.ALICEBLUE);

        Image imgDominosLogo = new Image("dominos.jpg");
        ImageView imageViewDominosLogo = new ImageView(imgDominosLogo);
        imageViewDominosLogo.setLayoutX(0);
        imageViewDominosLogo.setLayoutY(0);

        Image imgBuildYourOwnPizza = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza = new ImageView(imgBuildYourOwnPizza);
        imageViewBuildYourOwnPizza.setLayoutX(40);
        imageViewBuildYourOwnPizza.setLayoutY(120);
        imageViewBuildYourOwnPizza.setFitWidth(120);
        imageViewBuildYourOwnPizza.setFitHeight(120);

        Text txtDominos = new Text("Dominos");
        txtDominos.setLayoutX(100);
        txtDominos.setLayoutY(55);
        txtDominos.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos.setFill(Color.WHITESMOKE);

        Button btnBuildYourOwnPizza = new Button("Build your own");
        btnBuildYourOwnPizza.setLayoutX(50);
        btnBuildYourOwnPizza.setLayoutY(260);
        btnBuildYourOwnPizza.setFont(Font.font("Geometric Sans-Serif", 13));

        Button btnCheckout = new Button("checkout");
        btnCheckout.setLayoutX(670);
        btnCheckout.setLayoutY(530);
        btnCheckout.setPrefSize(93, 35);
        btnCheckout.setFont(Font.font("Geometric Sans-Serif", 15));

        paneMain.getChildren().add(rectangleBackground);
        paneMain.getChildren().add(rectangleDominosHeader);
        paneMain.getChildren().add(imageViewDominosLogo);
        paneMain.getChildren().add(txtDominos);
        paneMain.getChildren().add(btnBuildYourOwnPizza);
        paneMain.getChildren().add(btnCheckout);
        paneMain.getChildren().add(imageViewBuildYourOwnPizza);

        // -------------------------------------------------------------------------------------------------

        Pane paneBuildYourPizza = new Pane();
        Scene sceneBuildYourOwnPizza = new Scene(paneBuildYourPizza, 800, 600);

        Rectangle rectangleBackground_2 = new Rectangle(1000, 700, Color.ALICEBLUE);

        Image imgBuildYourOwnPizza_1 = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza_1 = new ImageView(imgBuildYourOwnPizza_1);
        imageViewBuildYourOwnPizza_1.setLayoutX(105);
        imageViewBuildYourOwnPizza_1.setLayoutY(165);
        imageViewBuildYourOwnPizza_1.setFitWidth(250);
        imageViewBuildYourOwnPizza_1.setFitHeight(250);

        Button btnBack = new Button("BACK");
        btnBack.setLayoutX(20);
        btnBack.setLayoutY(20);
        btnBack.setFont(Font.font("Geometric Sans-Serif", 15));

        Button btnAddToYourCart = new Button("Add to your Cart");
        btnAddToYourCart.setLayoutX(470);
        btnAddToYourCart.setLayoutY(460);
        btnAddToYourCart.setPrefSize(150, 35);
        btnAddToYourCart.setFont(Font.font("Geometric Sans-Serif", 15));

        Button btnViewYourCart = new Button("View the Cart");
        btnViewYourCart.setLayoutX(660);
        btnViewYourCart.setLayoutY(15);
        btnViewYourCart.setPrefSize(120, 40);
        btnViewYourCart.setFont(Font.font("Geometric Sans-Serif", 15));

        Text txtOriginalPizzaLabel = new Text("Plain Pizza: $10.50");
        txtOriginalPizzaLabel.setFont(Font.font("Geometric Sans-Serif", 22));
        txtOriginalPizzaLabel.setLayoutX(370);
        txtOriginalPizzaLabel.setLayoutY(90);

        Text txtEachToppings = new Text("Each Topping: $1.50");
        txtEachToppings.setFont(Font.font("Geometric Sans-Serif", 22));
        txtEachToppings.setLayoutX(365);
        txtEachToppings.setLayoutY(125);

        txtCurrentPrice.setFont(Font.font("Geometric Sans-Serif", 22));
        txtCurrentPrice.setLayoutX(140);
        txtCurrentPrice.setLayoutY(485);

        CheckBox cbPepperoni = new CheckBox("Pepperoni");
        cbPepperoni.setLayoutX(420);
        cbPepperoni.setLayoutY(315);
        cbPepperoni.setFont(Font.font("Geometric Sans-Serif", 24));

        CheckBox cbGreenPeppers = new CheckBox("Green Peppers");
        cbGreenPeppers.setLayoutX(420);
        cbGreenPeppers.setLayoutY(165);
        cbGreenPeppers.setFont(Font.font("Geometric Sans-Serif", 24));

        CheckBox cbMushrooms = new CheckBox("Mushrooms");
        cbMushrooms.setLayoutX(420);
        cbMushrooms.setLayoutY(215);
        cbMushrooms.setFont(Font.font("Geometric Sans-Serif", 24));

        CheckBox cbOlives = new CheckBox("Olives");
        cbOlives.setLayoutX(420);
        cbOlives.setLayoutY(265);
        cbOlives.setFont(Font.font("Geometric Sans-Serif", 24));

        CheckBox cbChicken = new CheckBox("Chicken");
        cbChicken.setLayoutX(420);
        cbChicken.setLayoutY(365);
        cbChicken.setFont(Font.font("Geometric Sans-Serif", 24));

        increaseCheckBoxFont(cbChicken);
        increaseCheckBoxFont(cbGreenPeppers);
        increaseCheckBoxFont(cbOlives);
        increaseCheckBoxFont(cbPepperoni);
        increaseCheckBoxFont(cbMushrooms);

        // Updating the current total price when user clicks the check boxes
        cbChicken.setOnAction(e -> updateCost(txtCurrentPrice, cbChicken.isSelected()));
        cbPepperoni.setOnAction(e -> updateCost(txtCurrentPrice, cbPepperoni.isSelected()));
        cbOlives.setOnAction(e -> updateCost(txtCurrentPrice, cbOlives.isSelected()));
        cbGreenPeppers.setOnAction(e -> updateCost(txtCurrentPrice, cbGreenPeppers.isSelected()));
        cbMushrooms.setOnAction(e -> updateCost(txtCurrentPrice, cbMushrooms.isSelected()));

        paneBuildYourPizza.getChildren().add(rectangleBackground_2);
        paneBuildYourPizza.getChildren().addAll(btnBack, btnAddToYourCart, btnViewYourCart);
        paneBuildYourPizza.getChildren().add(imageViewBuildYourOwnPizza_1);
        paneBuildYourPizza.getChildren().addAll(txtOriginalPizzaLabel, txtEachToppings, txtCurrentPrice,
                txtMessageForAddToYourCart);
        paneBuildYourPizza.getChildren().addAll(cbPepperoni, cbChicken, cbGreenPeppers, cbMushrooms, cbOlives);

        // ---------------------------------------------------------------------------------------------------------------------------

        Pane paneCheckout = new Pane();
        Scene sceneCheckout = new Scene(paneCheckout, 800, 600);

        Rectangle rectangleDominosHeader_1 = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground_1 = new Rectangle(1000, 700, Color.ALICEBLUE);

        Image imgDominosLogo_1 = new Image("dominos.jpg");
        ImageView imageViewDominosLogo_1 = new ImageView(imgDominosLogo_1);
        imageViewDominosLogo_1.setLayoutX(0);
        imageViewDominosLogo_1.setLayoutY(0);

        Button btnBack_1 = new Button("BACK");
        btnBack_1.setLayoutX(27);
        btnBack_1.setLayoutY(110);
        btnBack_1.setFont(Font.font("Geometric Sans-Serif", 15));

        Text txtDominos_1 = new Text("Dominos");
        txtDominos_1.setLayoutX(100);
        txtDominos_1.setLayoutY(55);
        txtDominos_1.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos_1.setFill(Color.WHITESMOKE);

        paneCheckout.getChildren().add(rectangleBackground_1);
        paneCheckout.getChildren().add(rectangleDominosHeader_1);
        paneCheckout.getChildren().add(imageViewDominosLogo_1);
        paneCheckout.getChildren().add(btnBack_1);
        paneCheckout.getChildren().add(txtDominos_1);

        // -------------------------------------------------------------------------------------------------------------------------

        
        btnBuildYourOwnPizza.setOnAction(e -> stgApp.setScene(sceneBuildYourOwnPizza));
        btnCheckout.setOnAction(e -> stgApp.setScene(sceneCheckout));
        
        btnBack.setOnAction(e -> stgApp.setScene(sceneMain));
        btnAddToYourCart.setOnAction(e -> Message());
        btnViewYourCart.setOnAction(e -> stgApp.setScene(sceneCheckout));
        
        btnBack_1.setOnAction(e -> stgApp.setScene(sceneMain));
        
        stgApp.setScene(sceneMain);
        stgApp.setTitle("Dominos App");
        stgApp.show();

    }

    private void updateCost(Text txtCurrentPrice, boolean blnIsSelected) {

        // Adding the each topping cost when check box is clicked
        if (blnIsSelected) {

            dblPizzaCost += dblEachToppingsCst;
        }

        // Subtracting the each topping cost when decides to remove the topping.
        else {
            dblPizzaCost -= dblEachToppingsCst;
        }

        // Setting the new updated total
        txtCurrentPrice.setText("Your Current Total Price: $" + String.format("%.2f", dblPizzaCost));
    }

    // Private method for increasing the font size of CheckBox labels
    private void increaseCheckBoxFont(CheckBox checkBox) {
        checkBox.setStyle("-fx-font-size: 16;");
    }

    private void Message() {

        txtMessageForAddToYourCart.setText("Your Item successfully added to the cart !");
        txtMessageForAddToYourCart.setFont(Font.font("Geometric Sans-Serif", 25));
        txtMessageForAddToYourCart.setLayoutX(140);
        txtMessageForAddToYourCart.setLayoutY(540);

        int intDurationInSeconds = 6;

        // Create a Timeline to hide the message after the specified duration
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(intDurationInSeconds), new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent event) {
                        // Hide the message after the specified duration
                        txtMessageForAddToYourCart.setText("");
                    }
                }));

        // Start the Timeline
        timeline.play();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
