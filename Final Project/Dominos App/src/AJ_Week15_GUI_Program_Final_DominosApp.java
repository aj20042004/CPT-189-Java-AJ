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

// Need to work on the remove button, displaying the items in the place order scene, build your own scene -> add to cart

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class AJ_Week15_GUI_Program_Final_DominosApp extends Application {

    private int intpepCnt;
    private int intBflCknCnt;
    private int intWisCheeseCnt;
    private int intFrchFrsCnt;
    private int intChsyBrdCnt;
    private int intDrnksCnt;
    private double dblValues;
    private double dblTotalCost = 0.0;
    private double dblPlainPizzaCost = 10.50;
    private double dblPepperoniPizza = 12.50;
    private double dblBuffaloChickenPizza = 15.50;
    private double dblWisconsin6CheesePizza = 20.10;
    private double dblFrenchFries = 5.50;
    private double dblStuffedCheesyBread = 7.50;
    private double dblDrinks = 2.99;
    private HashMap<String, Double> hshMapCheckOut = new HashMap<>();
    private HashMap<Integer, String> hashMapTrackThings = new HashMap<>();
    private int intItemsCount = 0;
    private String strAddItems = "";
    private int intPepperoniPizzaCount = 0;
    private int intBuffaloChickenPizzaCount = 0;
    private int intWisconsin6CheesePizzaCount = 0;
    private int intFrenchFriesCount = 0;
    private int intStuffedChessyBreadCount = 0;
    private int intDrinksCount = 0;
    private double dblDefaultCost = 0.0;
    private double dblEachToppingsCst = 1.50;
    private Text txtMessageForAddToYourCart = new Text("");
    private Text txtCurrentPrice = new Text("Your Current Total Price: $" + String.format("%.2f", dblPlainPizzaCost));
    private Text txtNumberOfItems = new Text("You have\n" + intItemsCount + " items in your cart");
    private Text txtYourCart = new Text("Your Cart: ");
    private Text txtYourFinalPrice = new Text("Total Price: " + dblTotalCost);
    private Text txtYourPrice = new Text("Your\nPrice: $" + String.format("%.2f", dblTotalCost));
    private Text txtMessage = new Text();
    private Text txtMessage_1 = new Text();
    private Text txtMessage_2 = new Text();
    private Button btnPlaceOrder = new Button("Place order");
    private TextField txtFieldNameInput = new TextField();
    private TextField txtFieldAddressInput = new TextField();
    private TextField txtFieldPhoneNumber = new TextField();
    private ArrayList<String> arrListToppings = new ArrayList<>();

    @Override
    public void start(Stage stgApp) throws Exception {

        // Main Screen
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
        imageViewBuildYourOwnPizza.setLayoutX(45);
        imageViewBuildYourOwnPizza.setLayoutY(160);
        imageViewBuildYourOwnPizza.setFitWidth(120);
        imageViewBuildYourOwnPizza.setFitHeight(120);

        Text txtBuildYourOwn = new Text("Plain\nPizza: $10.50");
        txtBuildYourOwn.setLayoutX(48);
        txtBuildYourOwn.setLayoutY(116);
        txtBuildYourOwn.setFont(Font.font("Geometric Sans-Serif", 17));

        Image imgPepperoniPizza = new Image("pepperoni.jpg");
        ImageView imageViewPepperoniPizza = new ImageView(imgPepperoniPizza);
        imageViewPepperoniPizza.setLayoutX(245);
        imageViewPepperoniPizza.setLayoutY(160);
        imageViewPepperoniPizza.setFitWidth(120);
        imageViewPepperoniPizza.setFitHeight(120);

        Text txtPepperoni = new Text("Pepperoni\nPizza: $12.50");
        txtPepperoni.setLayoutX(248);
        txtPepperoni.setLayoutY(116);
        txtPepperoni.setFont(Font.font("Geometric Sans-Serif", 17));

        Image imgBuffaloChickenPizza = new Image("Buffalo Chicken.jpg");
        ImageView imageViewBuffaloChicken = new ImageView(imgBuffaloChickenPizza);
        imageViewBuffaloChicken.setLayoutX(445);
        imageViewBuffaloChicken.setLayoutY(160);
        imageViewBuffaloChicken.setFitWidth(120);
        imageViewBuffaloChicken.setFitHeight(120);

        Text txtBuffaloChicken = new Text("Buffalo\nChicken Pizza: $15.50");
        txtBuffaloChicken.setLayoutX(428);
        txtBuffaloChicken.setLayoutY(116);
        txtBuffaloChicken.setFont(Font.font("Geometric Sans-Serif", 17));

        Image imgWisconsin6Cheese = new Image("Wisconsin 6 Cheese.jpg");
        ImageView imageViewWisconsin6Cheese = new ImageView(imgWisconsin6Cheese);
        imageViewWisconsin6Cheese.setLayoutX(645);
        imageViewWisconsin6Cheese.setLayoutY(160);
        imageViewWisconsin6Cheese.setFitWidth(120);
        imageViewWisconsin6Cheese.setFitHeight(120);

        Text txtWisconsin6Chesse = new Text("Wisconsin 6\nCheese Pizza: $20.10");
        txtWisconsin6Chesse.setLayoutX(628);
        txtWisconsin6Chesse.setLayoutY(116);
        txtWisconsin6Chesse.setFont(Font.font("Geometric Sans-Serif", 17));

        Image imgFrenchFries = new Image("frenchFries.jpg");
        ImageView imageViewFrenchFries = new ImageView(imgFrenchFries);
        imageViewFrenchFries.setLayoutX(45);
        imageViewFrenchFries.setLayoutY(410);
        imageViewFrenchFries.setFitWidth(120);
        imageViewFrenchFries.setFitHeight(120);

        Text txtFrenchFries = new Text("French\nFries: $5.50");
        txtFrenchFries.setLayoutX(50);
        txtFrenchFries.setLayoutY(370);
        txtFrenchFries.setFont(Font.font("Geometric Sans-Serif", 17));

        Image imgStuffedCheesyBread = new Image("StuffedCheesyBread.jpg");
        ImageView imageViewStuffedCheesyBread = new ImageView(imgStuffedCheesyBread);
        imageViewStuffedCheesyBread.setLayoutX(245);
        imageViewStuffedCheesyBread.setLayoutY(410);
        imageViewStuffedCheesyBread.setFitWidth(120);
        imageViewStuffedCheesyBread.setFitHeight(120);

        Text txtStuffedCheesyBread = new Text("Stuffed cheesy\nbread: $7.50");
        txtStuffedCheesyBread.setLayoutX(250);
        txtStuffedCheesyBread.setLayoutY(370);
        txtStuffedCheesyBread.setFont(Font.font("Geometric Sans-Serif", 17));

        txtNumberOfItems.setLayoutX(615);
        txtNumberOfItems.setLayoutY(35);
        txtNumberOfItems.setFont(Font.font("Geometric Sans-Serif", 20));
        txtNumberOfItems.setFill(Color.WHITESMOKE);

        Image imgDrinks = new Image("drinks.jpg");
        ImageView imageViewDrinks = new ImageView(imgDrinks);
        imageViewDrinks.setLayoutX(445);
        imageViewDrinks.setLayoutY(410);
        imageViewDrinks.setFitWidth(120);
        imageViewDrinks.setFitHeight(120);

        Text txtDrinks = new Text("Drinks: $2.99");
        txtDrinks.setLayoutX(450);
        txtDrinks.setLayoutY(387);
        txtDrinks.setFont(Font.font("Geometric Sans-Serif", 17));

        Text txtDominos = new Text("Dominos");
        txtDominos.setLayoutX(100);
        txtDominos.setLayoutY(55);
        txtDominos.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos.setFill(Color.WHITESMOKE);

        txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));
        txtYourPrice.setLayoutX(625);
        txtYourPrice.setLayoutY(450);
        txtYourPrice.setFont(Font.font("Geometric Sans-Serif", 25));

        Button btnBuildYourOwnPizza = new Button("Build your own");
        btnBuildYourOwnPizza.setLayoutX(49);
        btnBuildYourOwnPizza.setLayoutY(300);
        btnBuildYourOwnPizza.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartForPepperoni = new Button("Add to your Cart");
        btnAddToYourCartForPepperoni.setLayoutX(242);
        btnAddToYourCartForPepperoni.setLayoutY(300);
        btnAddToYourCartForPepperoni.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartForBuffaloChicken = new Button("Add to your Cart");
        btnAddToYourCartForBuffaloChicken.setLayoutX(445);
        btnAddToYourCartForBuffaloChicken.setLayoutY(300);
        btnAddToYourCartForBuffaloChicken.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartForWisconsin6Cheese = new Button("Add to your Cart");
        btnAddToYourCartForWisconsin6Cheese.setLayoutX(644);
        btnAddToYourCartForWisconsin6Cheese.setLayoutY(300);
        btnAddToYourCartForWisconsin6Cheese.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartFrenchFries = new Button("Add to your Cart");
        btnAddToYourCartFrenchFries.setLayoutX(43);
        btnAddToYourCartFrenchFries.setLayoutY(550);
        btnAddToYourCartFrenchFries.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartStuffedCheesyBread = new Button("Add to your Cart");
        btnAddToYourCartStuffedCheesyBread.setLayoutX(244);
        btnAddToYourCartStuffedCheesyBread.setLayoutY(550);
        btnAddToYourCartStuffedCheesyBread.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnAddToYourCartDrinks = new Button("Add to your Cart");
        btnAddToYourCartDrinks.setLayoutX(445);
        btnAddToYourCartDrinks.setLayoutY(550);
        btnAddToYourCartDrinks.setFont(Font.font("Geometric Sans-Serif", 14));

        Button btnCheckout = new Button("checkout");
        btnCheckout.setLayoutX(640);
        btnCheckout.setLayoutY(510);
        btnCheckout.setPrefSize(93, 42);
        btnCheckout.setFont(Font.font("Geometric Sans-Serif", 17));

        paneMain.getChildren().add(rectangleBackground);
        paneMain.getChildren().add(rectangleDominosHeader);
        paneMain.getChildren().add(imageViewDominosLogo);
        paneMain.getChildren().addAll(txtDominos, txtBuildYourOwn, txtFrenchFries, txtYourPrice,
                txtBuffaloChicken, txtPepperoni, txtWisconsin6Chesse, txtDrinks, txtStuffedCheesyBread,
                txtNumberOfItems);
        paneMain.getChildren().addAll(btnBuildYourOwnPizza, btnAddToYourCartFrenchFries, btnAddToYourCartForPepperoni,
                btnAddToYourCartDrinks, btnAddToYourCartStuffedCheesyBread,
                btnAddToYourCartForBuffaloChicken, btnAddToYourCartForWisconsin6Cheese);
        paneMain.getChildren().add(btnCheckout);
        paneMain.getChildren().addAll(imageViewBuildYourOwnPizza, imageViewPepperoniPizza,
                imageViewBuffaloChicken, imageViewWisconsin6Cheese, imageViewFrenchFries, imageViewStuffedCheesyBread,
                imageViewDrinks);

        // -------------------------------------------------------------------------------------------------

        // Build your own pizza screen
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
        cbChicken.setOnAction(e -> updateCost(txtCurrentPrice, cbChicken.isSelected(), "Chicken"));
        cbPepperoni.setOnAction(e -> updateCost(txtCurrentPrice, cbPepperoni.isSelected(), "Pepperoni"));
        cbOlives.setOnAction(e -> updateCost(txtCurrentPrice, cbOlives.isSelected(), "Olives"));
        cbGreenPeppers.setOnAction(e -> updateCost(txtCurrentPrice, cbGreenPeppers.isSelected(), "Green Peppers"));
        cbMushrooms.setOnAction(e -> updateCost(txtCurrentPrice, cbMushrooms.isSelected(), "Mushrooms"));

        paneBuildYourPizza.getChildren().add(rectangleBackground_2);
        paneBuildYourPizza.getChildren().addAll(btnBack, btnAddToYourCart, btnViewYourCart);
        paneBuildYourPizza.getChildren().add(imageViewBuildYourOwnPizza_1);
        paneBuildYourPizza.getChildren().addAll(txtOriginalPizzaLabel, txtEachToppings, txtCurrentPrice,
                txtMessageForAddToYourCart);
        paneBuildYourPizza.getChildren().addAll(cbPepperoni, cbChicken, cbGreenPeppers, cbMushrooms, cbOlives);

        // ---------------------------------------------------------------------------------------------------------------------------

        // Checkout screen
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

        txtYourCart.setLayoutX(142);
        txtYourCart.setLayoutY(205);
        txtYourCart.setFont(Font.font("Geometric Sans-Serif", 35));

        txtYourFinalPrice.setLayoutX(560);
        txtYourFinalPrice.setLayoutY(52);
        txtYourFinalPrice.setFont(Font.font("Geometric Sans-Serif", 27));
        txtYourFinalPrice.setFill(Color.WHITESMOKE);

        paneCheckout.getChildren().add(rectangleBackground_1);
        paneCheckout.getChildren().add(rectangleDominosHeader_1);
        paneCheckout.getChildren().add(imageViewDominosLogo_1);
        paneCheckout.getChildren().addAll(btnBack_1);

        // -------------------------------------------------------------------------------------------------------------------------

        // Place order screen
        Pane panePlaceOrder = new Pane();
        Scene scenePlaceOrder = new Scene(panePlaceOrder, 800, 600);

        Rectangle rectangleDominosHeader_3 = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground_3 = new Rectangle(1000, 700, Color.ALICEBLUE);

        Text txtDominos_2 = new Text("Dominos");
        txtDominos_2.setLayoutX(100);
        txtDominos_2.setLayoutY(55);
        txtDominos_2.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos_2.setFill(Color.WHITESMOKE);

        Text txtOrderConfirmed = new Text(
                "Your pizza order has been successfully placed !\nEnjoy the delicious flavors on their way to you !!\nEstimated Wait time: 5:00 Minutes");
        txtOrderConfirmed.setLayoutX(65);
        txtOrderConfirmed.setLayoutY(150);
        txtOrderConfirmed.setFont(Font.font("Geometric Sans-Serif", 22));

        Button btnReturnToMainMenu = new Button("Return to Main Menu");
        btnReturnToMainMenu.setLayoutX(130);
        btnReturnToMainMenu.setLayoutY(260);
        btnReturnToMainMenu.setFont(Font.font("Geometric Sans-Serif", 15));
        btnReturnToMainMenu.setPrefSize(180, 55);

        Image imgDominosLogo_3 = new Image("dominos.jpg");
        ImageView imageViewDominosLogo_3 = new ImageView(imgDominosLogo_3);
        imageViewDominosLogo_3.setLayoutX(0);
        imageViewDominosLogo_3.setLayoutY(0);

        panePlaceOrder.getChildren().addAll(rectangleBackground_3, rectangleDominosHeader_3, txtDominos_2,
                imageViewDominosLogo_3);
        panePlaceOrder.getChildren().addAll(txtOrderConfirmed, btnReturnToMainMenu);

        // ----------------------------------------------------------------------------------------------------------------------------------

        // All the setOnActions
        btnBuildYourOwnPizza.setOnAction(e -> stgApp.setScene(sceneBuildYourOwnPizza));

        btnAddToYourCartForPepperoni.setOnAction(e -> {

            AddCounter();
            intpepCnt = PepperoniPizzaCounter();
            hshMapCheckOut.put("Pepperoni Pizza", dblPepperoniPizza);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Pepperoni Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });
        btnAddToYourCartForBuffaloChicken.setOnAction(e -> {

            AddCounter();
            intBflCknCnt = BuffaloChickenPizzaCounter();
            hshMapCheckOut.put("Buffalo Chicken Pizza", dblBuffaloChickenPizza);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Buffalo Chicken Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });
        btnAddToYourCartForWisconsin6Cheese.setOnAction(e -> {

            AddCounter();
            intWisCheeseCnt = Wisconsin6CheesePizzaCounter();
            hshMapCheckOut.put("Wisconsin 6 Cheese Pizza", dblWisconsin6CheesePizza);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Wisconsin 6 Cheese Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartFrenchFries.setOnAction(e -> {
            AddCounter();
            intFrchFrsCnt = FrenchFriesCounter();
            hshMapCheckOut.put("French Fries", dblFrenchFries);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "French Fries") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartStuffedCheesyBread.setOnAction(e -> {
            AddCounter();
            intChsyBrdCnt = StuffedCheesyBreadCounter();
            hshMapCheckOut.put("Stuffed chessy bread", dblStuffedCheesyBread);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Stuffed chessy bread") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartDrinks.setOnAction(e -> {
            AddCounter();
            intDrnksCnt = DrinksCounter();
            hshMapCheckOut.put("Drinks", dblDrinks);

            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Drinks") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnCheckout.setOnAction(e -> {

            stgApp.setScene(sceneCheckout);

            int intPosition = 250;
            // Iterate through hashMap // Work on duplicated

            paneCheckout.getChildren().removeIf(node -> node instanceof Text);

            // Need to Fix the Bug here
            for (String strKey : hshMapCheckOut.keySet()) {

                Text txtDominosReturn = DominosText();
                Text txtLabel = new Text();
                if (strKey.equals("Pepperoni Pizza")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intpepCnt + ") Items");

                }

                else if (strKey.equals("Buffalo Chicken Pizza")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intBflCknCnt + ") Items");

                }

                else if (strKey.equals("Wisconsin 6 Cheese Pizza")) {

                    txtLabel.setText(
                            strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intWisCheeseCnt + ") Items");

                }

                else if (strKey.equals("French Fries")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intFrchFrsCnt + ") Items");

                }

                else if (strKey.equals("Stuffed chessy bread")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intChsyBrdCnt + ") Items");

                }

                else if (strKey.equals("Drinks")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intDrnksCnt + ") Items");

                }

                txtLabel.setFont(Font.font("Geometric Sans-Serif", 21));
                txtLabel.setLayoutX(60);
                txtLabel.setLayoutY(intPosition);
                paneCheckout.getChildren().add(txtLabel);
                paneCheckout.getChildren().add(txtDominosReturn);
                intPosition += 38;
            }

            Text txtDominos_1 = DominosText();
            paneCheckout.getChildren().addAll(txtYourCart, txtDominos_1, txtYourFinalPrice);

            Text txtCustomerName = new Text("Name:");
            txtCustomerName.setLayoutX(560);
            txtCustomerName.setLayoutY(130);
            txtCustomerName.setFont(Font.font("Geometric Sans-Serif", 21));

            Text txtCustomerAddress = new Text("Address:");
            txtCustomerAddress.setLayoutX(560);
            txtCustomerAddress.setLayoutY(246);
            txtCustomerAddress.setFont(Font.font("Geometric Sans-Serif", 21));

            Text txtCustomerPhoneNumber = new Text("Phone Number:");
            txtCustomerPhoneNumber.setLayoutX(560);
            txtCustomerPhoneNumber.setLayoutY(407);
            txtCustomerPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 21));

            txtYourFinalPrice.setText("Total Price: $" + dblTotalCost);

            paneCheckout.getChildren().addAll(txtCustomerName, txtCustomerAddress, txtCustomerPhoneNumber);

            txtFieldNameInput.setMinWidth(50);
            txtFieldNameInput.setPrefHeight(50);
            txtFieldNameInput.setLayoutX(560);
            txtFieldNameInput.setLayoutY(150);
            txtFieldNameInput.setFont(Font.font("Geometric Sans-Serif", 13));

            txtFieldAddressInput.setMinWidth(50);
            txtFieldAddressInput.setPrefHeight(90);
            txtFieldAddressInput.setLayoutX(560);
            txtFieldAddressInput.setLayoutY(266);
            txtFieldAddressInput.setFont(Font.font("Geometric Sans-Serif", 13));

            txtFieldPhoneNumber.setMinWidth(50);
            txtFieldPhoneNumber.setPrefHeight(40);
            txtFieldPhoneNumber.setLayoutX(560);
            txtFieldPhoneNumber.setLayoutY(427);
            txtFieldPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 13));

            btnPlaceOrder.setLayoutX(580);
            btnPlaceOrder.setLayoutY(503);
            btnPlaceOrder.setFont(Font.font("Geometric Sans-Serif", 14));
            btnPlaceOrder.setPrefSize(97, 50);

            paneCheckout.getChildren().addAll(txtFieldAddressInput, txtFieldNameInput, txtFieldPhoneNumber,
                    btnPlaceOrder);

        });

        btnBack.setOnAction(e -> stgApp.setScene(sceneMain));
        btnAddToYourCart.setOnAction(e -> {

            Message();
            AddCounter();
            dblTotalCost += dblPlainPizzaCost;
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));


            if ((arrListToppings.size() != 0)) {

                for (int t = 0; t < arrListToppings.size(); t++) {
                    strAddItems += arrListToppings.get(t) + " ";
                }
                hshMapCheckOut.put(strAddItems, dblPlainPizzaCost);
                
            }

            hashMapTrackThings.put(0, strAddItems);

            cbChicken.setSelected(false);
            cbPepperoni.setSelected(false);
            cbOlives.setSelected(false);
            cbGreenPeppers.setSelected(false);
            cbMushrooms.setSelected(false);

        });

        btnViewYourCart.setOnAction(e -> {

            stgApp.setScene(sceneCheckout);
            Text txtDominos_3 = DominosText();
            paneCheckout.getChildren().add(txtDominos_3);
            
            System.out.println();
            int intPosition = 250;
            // Iterate through hashMap // Work on duplicated

            paneCheckout.getChildren().removeIf(node -> node instanceof Text);

            // Need to Fix the Bug here
            for (String strKey : hshMapCheckOut.keySet()) {

                Text txtDominosReturn = DominosText();
                Text txtLabel = new Text();
                if (strKey.equals("Pepperoni Pizza")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intpepCnt + ") Items");

                }

                else if (strKey.equals("Buffalo Chicken Pizza")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intBflCknCnt + ") Items");

                }

                else if (strKey.equals("Wisconsin 6 Cheese Pizza")) {

                    txtLabel.setText(
                            strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intWisCheeseCnt + ") Items");

                }

                else if (strKey.equals("French Fries")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intFrchFrsCnt + ") Items");

                }

                else if (strKey.equals("Stuffed chessy bread")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intChsyBrdCnt + ") Items");

                }

                else if (strKey.equals("Drinks")) {

                    txtLabel.setText(strKey + ": $" + hshMapCheckOut.get(strKey) + "   (" + intDrnksCnt + ") Items");

                }
                
                
                else if (strKey.equals(hashMapTrackThings.get(0))) {
                    txtLabel.setText("Plain Pizza ( with " + arrListToppings.size() + " toppings): $"
                            + hshMapCheckOut.get(strKey));
                }

                txtLabel.setFont(Font.font("Geometric Sans-Serif", 21));
                txtLabel.setLayoutX(60);
                txtLabel.setLayoutY(intPosition);
                paneCheckout.getChildren().add(txtLabel);
                paneCheckout.getChildren().add(txtDominosReturn);
                intPosition += 38;
            }

            Text txtDominos_1 = DominosText();
            paneCheckout.getChildren().addAll(txtYourCart, txtDominos_1, txtYourFinalPrice);

            Text txtCustomerName = new Text("Name:");
            txtCustomerName.setLayoutX(560);
            txtCustomerName.setLayoutY(130);
            txtCustomerName.setFont(Font.font("Geometric Sans-Serif", 21));

            Text txtCustomerAddress = new Text("Address:");
            txtCustomerAddress.setLayoutX(560);
            txtCustomerAddress.setLayoutY(246);
            txtCustomerAddress.setFont(Font.font("Geometric Sans-Serif", 21));

            Text txtCustomerPhoneNumber = new Text("Phone Number:");
            txtCustomerPhoneNumber.setLayoutX(560);
            txtCustomerPhoneNumber.setLayoutY(407);
            txtCustomerPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 21));

            txtYourFinalPrice.setText("Total Price: $" + dblTotalCost);

            paneCheckout.getChildren().addAll(txtCustomerName, txtCustomerAddress, txtCustomerPhoneNumber);

            txtFieldNameInput.setMinWidth(50);
            txtFieldNameInput.setPrefHeight(50);
            txtFieldNameInput.setLayoutX(560);
            txtFieldNameInput.setLayoutY(150);
            txtFieldNameInput.setFont(Font.font("Geometric Sans-Serif", 13));

            txtFieldAddressInput.setMinWidth(50);
            txtFieldAddressInput.setPrefHeight(90);
            txtFieldAddressInput.setLayoutX(560);
            txtFieldAddressInput.setLayoutY(266);
            txtFieldAddressInput.setFont(Font.font("Geometric Sans-Serif", 13));

            txtFieldPhoneNumber.setMinWidth(50);
            txtFieldPhoneNumber.setPrefHeight(40);
            txtFieldPhoneNumber.setLayoutX(560);
            txtFieldPhoneNumber.setLayoutY(427);
            txtFieldPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 13));

            btnPlaceOrder.setLayoutX(580);
            btnPlaceOrder.setLayoutY(503);
            btnPlaceOrder.setFont(Font.font("Geometric Sans-Serif", 14));
            btnPlaceOrder.setPrefSize(97, 50);

            paneCheckout.getChildren().addAll(txtFieldAddressInput, txtFieldNameInput, txtFieldPhoneNumber,
                    btnPlaceOrder);

        });
        btnBack_1.setOnAction(e -> stgApp.setScene(sceneMain));
        btnPlaceOrder.setOnAction(e -> {

            if ((txtFieldNameInput.getText().length() != 0) &&
                    (txtFieldAddressInput.getText().length() != 0) &&
                    (txtFieldPhoneNumber.getText().length() != 0)) {
                stgApp.setScene(scenePlaceOrder);

                String strNameInput = txtFieldNameInput.getText();

                txtMessage.setText(strNameInput);
                txtMessage.setFont(Font.font("Geometric Sans-Serif", 18));
                txtMessage.setLayoutX(110);
                txtMessage.setLayoutY(400);
                panePlaceOrder.getChildren().add(txtMessage);

                String strAddressInput = txtFieldAddressInput.getText();

                txtMessage_1.setText(strAddressInput);
                txtMessage_1.setFont(Font.font("Geometric Sans-Serif", 18));
                txtMessage_1.setLayoutX(125);
                txtMessage_1.setLayoutY(435);
                panePlaceOrder.getChildren().add(txtMessage_1);

                String strPhoneNumberInput = txtFieldPhoneNumber.getText();

                txtMessage_2.setText(strPhoneNumberInput);
                txtMessage_2.setFont(Font.font("Geometric Sans-Serif", 18));
                txtMessage_2.setLayoutX(183);
                txtMessage_2.setLayoutY(470);
                panePlaceOrder.getChildren().add(txtMessage_2);

                Text txtCustomerName_1 = new Text("Name:");
                txtCustomerName_1.setLayoutX(50);
                txtCustomerName_1.setLayoutY(400);
                txtCustomerName_1.setFont(Font.font("Geometric Sans-Serif", 18));

                Text txtCustomerAddress_1 = new Text("Address:");
                txtCustomerAddress_1.setLayoutX(50);
                txtCustomerAddress_1.setLayoutY(435);
                txtCustomerAddress_1.setFont(Font.font("Geometric Sans-Serif", 18));

                Text txtCustomerPhoneNumber_1 = new Text("Phone Number:");
                txtCustomerPhoneNumber_1.setLayoutX(50);
                txtCustomerPhoneNumber_1.setLayoutY(470);
                txtCustomerPhoneNumber_1.setFont(Font.font("Geometric Sans-Serif", 18));

                panePlaceOrder.getChildren().addAll(txtCustomerName_1, txtCustomerAddress_1, txtCustomerPhoneNumber_1);

            }

        });

        btnReturnToMainMenu.setOnAction(e -> {
            stgApp.setScene(sceneMain);
        });

        stgApp.setScene(sceneMain);
        stgApp.setTitle("Dominos App");
        stgApp.show();

    }

    private void updateCost(Text txtCurrentPrice, boolean blnIsSelected, String strToppingsName) {

        // Adding the each topping cost when check box is clicked
        if (blnIsSelected) {

            dblPlainPizzaCost += dblEachToppingsCst;
            arrListToppings.add(strToppingsName);
        }

        // Subtracting the each topping cost when decides to remove the topping.
        else {
            dblPlainPizzaCost -= dblEachToppingsCst;
            arrListToppings.remove(strToppingsName);
        }

        // Setting the new updated total
        txtCurrentPrice.setText("Your Current Total Price: $" + String.format("%.2f", dblPlainPizzaCost));
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

    private void AddCounter() {

        intItemsCount += 1;
        txtNumberOfItems.setText("You have\n" + intItemsCount + " items in your cart");

    }

    private int PepperoniPizzaCounter() {

        intPepperoniPizzaCount += 1;
        return intPepperoniPizzaCount;

    }

    private int BuffaloChickenPizzaCounter() {

        intBuffaloChickenPizzaCount += 1;
        return intBuffaloChickenPizzaCount;

    }

    private int Wisconsin6CheesePizzaCounter() {

        intWisconsin6CheesePizzaCount += 1;
        return intWisconsin6CheesePizzaCount;

    }

    private int FrenchFriesCounter() {

        intFrenchFriesCount += 1;
        return intFrenchFriesCount;

    }

    private int StuffedCheesyBreadCounter() {

        intStuffedChessyBreadCount += 1;
        return intStuffedChessyBreadCount;

    }

    private int DrinksCounter() {

        intDrinksCount += 1;
        return intDrinksCount;

    }

    private Text DominosText() {
        Text txtDominos_1 = new Text("Dominos");
        txtDominos_1.setLayoutX(100);
        txtDominos_1.setLayoutY(55);
        txtDominos_1.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos_1.setFill(Color.WHITESMOKE);
        return txtDominos_1;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
