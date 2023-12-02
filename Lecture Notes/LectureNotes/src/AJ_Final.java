/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week15_GUI_Program_Final_ECommerce
    Author:		AJ
    Language:	Java
    Date:		2023-11-17
    Purpose:	The purpose of this program is to create a dominos pizza ordering system. It includes 
                different types of pizza's including build your own pizza feature.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-17	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
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

// Creating the class
public class AJ_Final extends Application {

    // Creating and initializing private variables
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
    private double dblEachToppingsCst = 1.50;
    private int intItemsCount = 0;
    private int intPepperoniPizzaCount = 0;
    private int intBuffaloChickenPizzaCount = 0;
    private int intWisconsin6CheesePizzaCount = 0;
    private int intFrenchFriesCount = 0;
    private int intStuffedcheesyBreadCount = 0;
    private int intDrinksCount = 0;
    private String strAddItems = "";
    private Text txtMessageForAddToYourCart = new Text("");
    private Text txtCustomerName = new Text("Name:");
    private Text txtCustomerAddress = new Text("Address:");
    private Text txtCustomerPhoneNumber = new Text("Phone Number:");
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
    private HashMap<String, Double> hshMapCheckOut = new HashMap<>();
    private HashMap<Integer, String> hashMapTrackThings = new HashMap<>();
    private Text txtSeparator = new Text("---------------------------------------------");
    private Text txtPlaceOrderFinalPrice = new Text("Total Price: $" + String.format("%.2f", dblTotalCost));

    // Start method
    @Override
    public void start(Stage stgApp) throws Exception {

        // Creating the main pane and scene
        Pane paneMain = new Pane();
        Scene sceneMain = new Scene(paneMain, 800, 600);
        txtCustomerName.setId("txtCustomerName");
        txtCustomerAddress.setId("txtCustomerAddress");
        txtCustomerPhoneNumber.setId("txtCustomerPhoneNumber");
        txtFieldAddressInput.setId("txtFieldAddressInput");
        txtFieldNameInput.setId("txtFieldNameInput");
        txtFieldPhoneNumber.setId("txtFieldPhoneNumber");
        btnPlaceOrder.setId("btnPlaceOrder");

        /*
         * Creating the rectangle objects rectangleDominosHeader and rectangleBackground
         * for setting
         * the background and header color theme
         */
        Rectangle rectangleDominosHeader = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground = new Rectangle(1000, 700, Color.ALICEBLUE);

        // Creating the dominos logo image
        Image imgDominosLogo = new Image("dominos.jpg");
        ImageView imageViewDominosLogo = new ImageView(imgDominosLogo);
        imageViewDominosLogo.setLayoutX(0);
        imageViewDominosLogo.setLayoutY(0);

        // Creating the Build your own pizza image
        Image imgBuildYourOwnPizza = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza = new ImageView(imgBuildYourOwnPizza);
        imageViewBuildYourOwnPizza.setLayoutX(45);
        imageViewBuildYourOwnPizza.setLayoutY(160);
        imageViewBuildYourOwnPizza.setFitWidth(120);
        imageViewBuildYourOwnPizza.setFitHeight(120);

        // Creating the pepperoni pizza image
        Image imgPepperoniPizza = new Image("pepperoni.jpg");
        ImageView imageViewPepperoniPizza = new ImageView(imgPepperoniPizza);
        imageViewPepperoniPizza.setLayoutX(245);
        imageViewPepperoniPizza.setLayoutY(160);
        imageViewPepperoniPizza.setFitWidth(120);
        imageViewPepperoniPizza.setFitHeight(120);

        // Creating the Buffalo chicken pizza image
        Image imgBuffaloChickenPizza = new Image("Buffalo Chicken.jpg");
        ImageView imageViewBuffaloChicken = new ImageView(imgBuffaloChickenPizza);
        imageViewBuffaloChicken.setLayoutX(445);
        imageViewBuffaloChicken.setLayoutY(160);
        imageViewBuffaloChicken.setFitWidth(120);
        imageViewBuffaloChicken.setFitHeight(120);

        // Creating the Wisconsin 6 Cheese pizza image
        Image imgWisconsin6Cheese = new Image("Wisconsin 6 Cheese.jpg");
        ImageView imageViewWisconsin6Cheese = new ImageView(imgWisconsin6Cheese);
        imageViewWisconsin6Cheese.setLayoutX(645);
        imageViewWisconsin6Cheese.setLayoutY(160);
        imageViewWisconsin6Cheese.setFitWidth(120);
        imageViewWisconsin6Cheese.setFitHeight(120);

        // Creating the French Fries image
        Image imgFrenchFries = new Image("frenchFries.jpg");
        ImageView imageViewFrenchFries = new ImageView(imgFrenchFries);
        imageViewFrenchFries.setLayoutX(45);
        imageViewFrenchFries.setLayoutY(410);
        imageViewFrenchFries.setFitWidth(120);
        imageViewFrenchFries.setFitHeight(120);

        // Creating the Stuffed cheesy bread image
        Image imgStuffedCheesyBread = new Image("StuffedCheesyBread.jpg");
        ImageView imageViewStuffedCheesyBread = new ImageView(imgStuffedCheesyBread);
        imageViewStuffedCheesyBread.setLayoutX(245);
        imageViewStuffedCheesyBread.setLayoutY(410);
        imageViewStuffedCheesyBread.setFitWidth(120);
        imageViewStuffedCheesyBread.setFitHeight(120);

        // Creating the drinks image
        Image imgDrinks = new Image("drinks.jpg");
        ImageView imageViewDrinks = new ImageView(imgDrinks);
        imageViewDrinks.setLayoutX(445);
        imageViewDrinks.setLayoutY(410);
        imageViewDrinks.setFitWidth(120);
        imageViewDrinks.setFitHeight(120);

        // Creating a Text node for Build your own pizza
        Text txtBuildYourOwn = new Text("Plain\nPizza: $10.50");
        txtBuildYourOwn.setLayoutX(48);
        txtBuildYourOwn.setLayoutY(116);
        txtBuildYourOwn.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for Pepperoni pizza
        Text txtPepperoni = new Text("Pepperoni\nPizza: $12.50");
        txtPepperoni.setLayoutX(248);
        txtPepperoni.setLayoutY(116);
        txtPepperoni.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for Buffalo chicken pizza
        Text txtBuffaloChicken = new Text("Buffalo\nChicken Pizza: $15.50");
        txtBuffaloChicken.setLayoutX(428);
        txtBuffaloChicken.setLayoutY(116);
        txtBuffaloChicken.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for Wisconsin 6 cheese pizza
        Text txtWisconsin6Chesse = new Text("Wisconsin 6\nCheese Pizza: $20.10");
        txtWisconsin6Chesse.setLayoutX(628);
        txtWisconsin6Chesse.setLayoutY(116);
        txtWisconsin6Chesse.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for French fries
        Text txtFrenchFries = new Text("French\nFries: $5.50");
        txtFrenchFries.setLayoutX(50);
        txtFrenchFries.setLayoutY(370);
        txtFrenchFries.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for Stuffed cheesy bread
        Text txtStuffedCheesyBread = new Text("Stuffed cheesy\nbread: $7.50");
        txtStuffedCheesyBread.setLayoutX(250);
        txtStuffedCheesyBread.setLayoutY(370);
        txtStuffedCheesyBread.setFont(Font.font("Geometric Sans-Serif", 17));

        // Setting the Alignment and font style for Text node "txtNumberOfItems"
        txtNumberOfItems.setLayoutX(615);
        txtNumberOfItems.setLayoutY(35);
        txtNumberOfItems.setFont(Font.font("Geometric Sans-Serif", 20));
        txtNumberOfItems.setFill(Color.WHITESMOKE);

        // Creating a Text node for Drinks
        Text txtDrinks = new Text("Drinks: $2.99");
        txtDrinks.setLayoutX(450);
        txtDrinks.setLayoutY(387);
        txtDrinks.setFont(Font.font("Geometric Sans-Serif", 17));

        // Creating a Text node for Title "Dominos"
        Text txtDominos = new Text("Dominos");
        txtDominos.setLayoutX(100);
        txtDominos.setLayoutY(55);
        txtDominos.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos.setFill(Color.WHITESMOKE);

        // Setting "Your Price" to 0
        txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));
        txtYourPrice.setLayoutX(625);
        txtYourPrice.setLayoutY(450);
        txtYourPrice.setFont(Font.font("Geometric Sans-Serif", 25));

        // Creating a Button and setting the alignment for Build your own pizza
        Button btnBuildYourOwnPizza = new Button("Build your own");
        btnBuildYourOwnPizza.setLayoutX(49);
        btnBuildYourOwnPizza.setLayoutY(300);
        btnBuildYourOwnPizza.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for Pepperoni pizza "Add to your
        // cart"
        Button btnAddToYourCartForPepperoni = new Button("Add to your Cart");
        btnAddToYourCartForPepperoni.setLayoutX(242);
        btnAddToYourCartForPepperoni.setLayoutY(300);
        btnAddToYourCartForPepperoni.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for Buffalo Chicken pizza "Add to
        // your cart"
        Button btnAddToYourCartForBuffaloChicken = new Button("Add to your Cart");
        btnAddToYourCartForBuffaloChicken.setLayoutX(445);
        btnAddToYourCartForBuffaloChicken.setLayoutY(300);
        btnAddToYourCartForBuffaloChicken.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for Wisconsin 6 cheese pizza "Add
        // to your cart"
        Button btnAddToYourCartForWisconsin6Cheese = new Button("Add to your Cart");
        btnAddToYourCartForWisconsin6Cheese.setLayoutX(644);
        btnAddToYourCartForWisconsin6Cheese.setLayoutY(300);
        btnAddToYourCartForWisconsin6Cheese.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for French Fries "Add to your
        // cart"
        Button btnAddToYourCartFrenchFries = new Button("Add to your Cart");
        btnAddToYourCartFrenchFries.setLayoutX(43);
        btnAddToYourCartFrenchFries.setLayoutY(550);
        btnAddToYourCartFrenchFries.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for Stuffed cheesy bread "Add to
        // your cart"
        Button btnAddToYourCartStuffedCheesyBread = new Button("Add to your Cart");
        btnAddToYourCartStuffedCheesyBread.setLayoutX(244);
        btnAddToYourCartStuffedCheesyBread.setLayoutY(550);
        btnAddToYourCartStuffedCheesyBread.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for Drinks "Add to your cart"
        Button btnAddToYourCartDrinks = new Button("Add to your Cart");
        btnAddToYourCartDrinks.setLayoutX(445);
        btnAddToYourCartDrinks.setLayoutY(550);
        btnAddToYourCartDrinks.setFont(Font.font("Geometric Sans-Serif", 14));

        // Creating a Button and setting the alignment for "checkout"
        Button btnCheckout = new Button("checkout");
        btnCheckout.setLayoutX(640);
        btnCheckout.setLayoutY(510);
        btnCheckout.setPrefSize(93, 42);
        btnCheckout.setFont(Font.font("Geometric Sans-Serif", 17));

        // Adding all the objects to the main pane
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

        // Creating Build your own pizza pane and scene
        Pane paneBuildYourPizza = new Pane();
        Scene sceneBuildYourOwnPizza = new Scene(paneBuildYourPizza, 800, 600);

        // Creating the rectangle objects rectangleBackground_2 for setting the
        // background color theme
        Rectangle rectangleBackground_2 = new Rectangle(1000, 700, Color.ALICEBLUE);

        // Creating the second Build your own pizza image for build your own pizza scene
        Image imgBuildYourOwnPizza_1 = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza_1 = new ImageView(imgBuildYourOwnPizza_1);
        imageViewBuildYourOwnPizza_1.setLayoutX(105);
        imageViewBuildYourOwnPizza_1.setLayoutY(165);
        imageViewBuildYourOwnPizza_1.setFitWidth(250);
        imageViewBuildYourOwnPizza_1.setFitHeight(250);

        // Creating a Button for "BACK"
        Button btnBack = new Button("BACK");
        btnBack.setLayoutX(20);
        btnBack.setLayoutY(20);
        btnBack.setFont(Font.font("Geometric Sans-Serif", 15));

        // Creating the "Add to your cart" button for build your own pizza scene
        Button btnAddToYourCart = new Button("Add to your Cart");
        btnAddToYourCart.setLayoutX(470);
        btnAddToYourCart.setLayoutY(460);
        btnAddToYourCart.setPrefSize(150, 35);
        btnAddToYourCart.setFont(Font.font("Geometric Sans-Serif", 15));

        // Creating the "View the Cart" button for build your own pizza scene
        Button btnViewYourCart = new Button("View the Cart");
        btnViewYourCart.setLayoutX(660);
        btnViewYourCart.setLayoutY(15);
        btnViewYourCart.setPrefSize(120, 40);
        btnViewYourCart.setFont(Font.font("Geometric Sans-Serif", 15));

        // Creating a Text node for "Plain Pizza: $10.50" for build your own pizza scene
        Text txtOriginalPizzaLabel = new Text("Plain Pizza: $10.50");
        txtOriginalPizzaLabel.setFont(Font.font("Geometric Sans-Serif", 22));
        txtOriginalPizzaLabel.setLayoutX(370);
        txtOriginalPizzaLabel.setLayoutY(90);

        // Creating a Text node for "Each Topping: $1.50" for build your own pizza scene
        Text txtEachToppings = new Text("Each Topping: $1.50");
        txtEachToppings.setFont(Font.font("Geometric Sans-Serif", 22));
        txtEachToppings.setLayoutX(365);
        txtEachToppings.setLayoutY(125);

        // Setting the font and alignment for the text node "txtCurrentPrice" for build
        // yourn own pizza scene
        txtCurrentPrice.setFont(Font.font("Geometric Sans-Serif", 22));
        txtCurrentPrice.setLayoutX(140);
        txtCurrentPrice.setLayoutY(485);

        // Creating a checkbox for pepperoni topping
        CheckBox cbPepperoni = new CheckBox("Pepperoni");
        cbPepperoni.setLayoutX(420);
        cbPepperoni.setLayoutY(315);
        cbPepperoni.setFont(Font.font("Geometric Sans-Serif", 24));

        // Creating a checkbox for Green peppers topping
        CheckBox cbGreenPeppers = new CheckBox("Green Peppers");
        cbGreenPeppers.setLayoutX(420);
        cbGreenPeppers.setLayoutY(165);
        cbGreenPeppers.setFont(Font.font("Geometric Sans-Serif", 24));

        // Creating a checkbox for Mushroom topping
        CheckBox cbMushrooms = new CheckBox("Mushrooms");
        cbMushrooms.setLayoutX(420);
        cbMushrooms.setLayoutY(215);
        cbMushrooms.setFont(Font.font("Geometric Sans-Serif", 24));

        // Creating a checkbox for olive topping
        CheckBox cbOlives = new CheckBox("Olives");
        cbOlives.setLayoutX(420);
        cbOlives.setLayoutY(265);
        cbOlives.setFont(Font.font("Geometric Sans-Serif", 24));

        // Creating a checkbox for chicken topping
        CheckBox cbChicken = new CheckBox("Chicken");
        cbChicken.setLayoutX(420);
        cbChicken.setLayoutY(365);
        cbChicken.setFont(Font.font("Geometric Sans-Serif", 24));

        // Using the method increaseCheckBoxFont() to increase the size of the checkbox
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

        // Adding all the objects to the build yourn own pizza pane
        paneBuildYourPizza.getChildren().add(rectangleBackground_2);
        paneBuildYourPizza.getChildren().addAll(btnBack, btnAddToYourCart, btnViewYourCart);
        paneBuildYourPizza.getChildren().add(imageViewBuildYourOwnPizza_1);
        paneBuildYourPizza.getChildren().addAll(txtOriginalPizzaLabel, txtEachToppings, txtCurrentPrice,
                txtMessageForAddToYourCart);
        paneBuildYourPizza.getChildren().addAll(cbPepperoni, cbChicken, cbGreenPeppers, cbMushrooms, cbOlives);

        // ---------------------------------------------------------------------------------------------------------------------------

        // Checkout screen

        // Creating pane and scene for Checkout
        Pane paneCheckout = new Pane();
        Scene sceneCheckout = new Scene(paneCheckout, 800, 600);

        // Creating the rectangle objects rectangleDominosHeader_1 and
        // rectangleBackground_1 for setting the background and header color theme
        Rectangle rectangleDominosHeader_1 = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground_1 = new Rectangle(1000, 700, Color.ALICEBLUE);

        // Creating the image dominos for logo
        Image imgDominosLogo_1 = new Image("dominos.jpg");
        ImageView imageViewDominosLogo_1 = new ImageView(imgDominosLogo_1);
        imageViewDominosLogo_1.setLayoutX(0);
        imageViewDominosLogo_1.setLayoutY(0);

        // Creating the "BACK" button for checkout scene
        Button btnBack_1 = new Button("BACK");
        btnBack_1.setLayoutX(27);
        btnBack_1.setLayoutY(110);
        btnBack_1.setFont(Font.font("Geometric Sans-Serif", 15));

        // updating the alignment for the text node "txtYourCart" for the checkout scene
        txtYourCart.setLayoutX(142);
        txtYourCart.setLayoutY(205);
        txtYourCart.setFont(Font.font("Geometric Sans-Serif", 35));

        // updating the alignment for the text node "txtYourFinalPrice" for the checkout
        // scene
        txtYourFinalPrice.setLayoutX(560);
        txtYourFinalPrice.setLayoutY(52);
        txtYourFinalPrice.setFont(Font.font("Geometric Sans-Serif", 27));
        txtYourFinalPrice.setFill(Color.WHITESMOKE);

        // Adding all the objects to the checkout pane
        paneCheckout.getChildren().add(rectangleBackground_1);
        paneCheckout.getChildren().add(rectangleDominosHeader_1);
        paneCheckout.getChildren().add(imageViewDominosLogo_1);
        paneCheckout.getChildren().addAll(btnBack_1);

        // -------------------------------------------------------------------------------------------------------------------------

        // Place order screen

        // Creating the pane and scene for place order
        Pane panePlaceOrder = new Pane();
        Scene scenePlaceOrder = new Scene(panePlaceOrder, 800, 600);

        // Creating the rectangle objects rectangleDominosHeader_3 and
        // rectangleBackground_3 for setting the background and header color theme
        Rectangle rectangleDominosHeader_3 = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground_3 = new Rectangle(1000, 700, Color.ALICEBLUE);

        // Creating a Text node "Dominos" for the scene Place order
        Text txtDominos_2 = new Text("Dominos");
        txtDominos_2.setLayoutX(100);
        txtDominos_2.setLayoutY(55);
        txtDominos_2.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos_2.setFill(Color.WHITESMOKE);

        // Creating the text node "txtOrderConfirmed" to display the order confirmation
        // message in the place order scene
        Text txtOrderConfirmed = new Text(
                "Your pizza order has been successfully placed !\nEnjoy the delicious flavors on their way to you !!\nEstimated Wait time: 5:00 Minutes");
        txtOrderConfirmed.setLayoutX(65);
        txtOrderConfirmed.setLayoutY(150);
        txtOrderConfirmed.setFont(Font.font("Geometric Sans-Serif", 22));

        // Creating a Text node "txtReceipt" for the place order scene
        Text txtReceipt = new Text("Receipt:");
        txtReceipt.setLayoutX(540);
        txtReceipt.setLayoutY(260);
        txtReceipt.setFont(Font.font("Geometric Sans-Serif", 22));

        // Creating a Button "btnReturnToMainMenu" for Returning to main menu
        Button btnReturnToMainMenu = new Button("Return to Main Menu");
        btnReturnToMainMenu.setLayoutX(130);
        btnReturnToMainMenu.setLayoutY(260);
        btnReturnToMainMenu.setFont(Font.font("Geometric Sans-Serif", 15));
        btnReturnToMainMenu.setPrefSize(180, 55);

        // Creating the image for "Dominos logo in the place order scene"
        Image imgDominosLogo_3 = new Image("dominos.jpg");
        ImageView imageViewDominosLogo_3 = new ImageView(imgDominosLogo_3);
        imageViewDominosLogo_3.setLayoutX(0);
        imageViewDominosLogo_3.setLayoutY(0);

        // Adding all the objects to the place order pane
        panePlaceOrder.getChildren().addAll(rectangleBackground_3, rectangleDominosHeader_3, txtDominos_2,
                imageViewDominosLogo_3);
        panePlaceOrder.getChildren().addAll(txtOrderConfirmed, btnReturnToMainMenu, txtReceipt);

        // ----------------------------------------------------------------------------------------------------------------------------------

        // All the setOnActions

        // Setting the button "Build your own pizza" on action
        btnBuildYourOwnPizza.setOnAction(e -> stgApp.setScene(sceneBuildYourOwnPizza));

        // Setting the button "btnAddToYourCartForPepperoni" on action
        btnAddToYourCartForPepperoni.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method PepperoniPizzaCounter() to count the number of pepperoni
            // pizza
            intpepCnt = PepperoniPizzaCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("Pepperoni Pizza", dblPepperoniPizza);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Pepperoni Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        // Setting the button "btnAddToYourCartForBuffaloChicken" on action
        btnAddToYourCartForBuffaloChicken.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method BuffaloChickenPizzaCounter() to count the number of Buffalo
            // Chicken pizza
            intBflCknCnt = BuffaloChickenPizzaCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("Buffalo Chicken Pizza", dblBuffaloChickenPizza);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Buffalo Chicken Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });
        btnAddToYourCartForWisconsin6Cheese.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method Wisconsin6CheesePizzaCounter() to count the number of
            // Wisconsin 6 cheese pizza
            intWisCheeseCnt = Wisconsin6CheesePizzaCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("Wisconsin 6 Cheese Pizza", dblWisconsin6CheesePizza);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Wisconsin 6 Cheese Pizza") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartFrenchFries.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method FrenchFriesCounter() to count the number of french fries
            intFrchFrsCnt = FrenchFriesCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("French Fries", dblFrenchFries);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "French Fries") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartStuffedCheesyBread.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method StuffedCheesyBreadCounter() to count the number of Stuffed
            // cheesy bread
            intChsyBrdCnt = StuffedCheesyBreadCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("Stuffed cheesy bread", dblStuffedCheesyBread);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Stuffed cheesy bread") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        btnAddToYourCartDrinks.setOnAction(e -> {

            // Using the method AddCounter() to count the total number of items
            AddCounter();

            // Using the method DrinksCounter() to count the number of drinks
            intDrnksCnt = DrinksCounter();

            // Adding the item name and price to hashMap
            hshMapCheckOut.put("Drinks", dblDrinks);

            // Iterating through hashMap to add the price of an item to the total cost
            for (String strKey : hshMapCheckOut.keySet()) {

                if (strKey == "Drinks") {
                    dblValues = hshMapCheckOut.get(strKey);
                    dblTotalCost += dblValues;
                }

            }

            // Updating the price
            txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));

        });

        // Setting the button "btnCheckout" on action
        btnCheckout.setOnAction(e -> {

            // Setting the scene to "Checkout" when button "btnCheckout" is clicked
            stgApp.setScene(sceneCheckout);

            // Creating a "intPosition" variable
            int intPosition = 250;

            // Removing all the previous Text nodes
            paneCheckout.getChildren().removeIf(node -> node instanceof Text);
            paneCheckout.getChildren().addAll(txtCustomerName, txtCustomerAddress, txtCustomerPhoneNumber);

            // Iterating through the hashMap to displaying all the elements in the cart
            for (String strKey : hshMapCheckOut.keySet()) {

                // Using the method DominosText() to create Text "Dominos"
                Text txtDominosReturn = DominosText();

                // Creating a Text node for displaying the elements from hashMap
                Text txtLabel = new Text();

                // If the key equals to "Pepperoni Pizza", we're updating the text node
                // "txtLabel"
                if (strKey.equals("Pepperoni Pizza")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intpepCnt + ") Items");

                }

                // If the key equals to "Buffalo Chicken Pizza", we're updating the text node
                // "txtLabel"
                else if (strKey.equals("Buffalo Chicken Pizza")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intBflCknCnt + ") Items");

                }

                // If the key equals to "Wisconsin 6 Cheese Pizza", we're updating the text node
                // "txtLabel"
                else if (strKey.equals("Wisconsin 6 Cheese Pizza")) {

                    txtLabel.setText(
                            strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                                    + intWisCheeseCnt + ") Items");

                }

                // If the key equals to "French Fries", we're updating the text node "txtLabel"
                else if (strKey.equals("French Fries")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intFrchFrsCnt + ") Items");

                }

                // If the key equals to "Stuffed cheesy bread", we're updating the text node
                // "txtLabel"
                else if (strKey.equals("Stuffed cheesy bread")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intChsyBrdCnt + ") Items");

                }

                // If the key equals to "Drinks", we're updating the text node "txtLabel"
                else if (strKey.equals("Drinks")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intDrnksCnt + ") Items");

                }

                // If the key equals to "Plain Pizza" (Build your own pizza), we're updating the
                // text node "txtLabel"
                else if (strKey.equals(hashMapTrackThings.get(0))) {
                    txtLabel.setText("Plain Pizza (with " + arrListToppings.size() + " toppings): $"
                            + String.format("%.2f", hshMapCheckOut.get(strKey)));
                }

                // Setting the font style and alignment for the text node "txtLabel"
                txtLabel.setFont(Font.font("Geometric Sans-Serif", 21));
                txtLabel.setLayoutX(60);
                txtLabel.setLayoutY(intPosition);

                // Adding the objects to the checkout pane
                paneCheckout.getChildren().add(txtLabel);
                paneCheckout.getChildren().add(txtDominosReturn);

                // Increasing the intPosition by 38 for every iteration
                intPosition += 38;
            }

            // Creating a Text node "Dominos" for the scene checkout
            Text txtDominos_1 = DominosText();

            // Adding all the objects to the checkout pane
            paneCheckout.getChildren().addAll(txtYourCart, txtDominos_1, txtYourFinalPrice);

            // Setting the Text node for "Name:"
            txtCustomerName.setLayoutX(560);
            txtCustomerName.setLayoutY(130);
            txtCustomerName.setFont(Font.font("Geometric Sans-Serif", 21));

            // Setting the Text node for "Address:"
            txtCustomerAddress.setLayoutX(560);
            txtCustomerAddress.setLayoutY(246);
            txtCustomerAddress.setFont(Font.font("Geometric Sans-Serif", 21));

            // Setting the Text node for "Phone Number:"
            txtCustomerPhoneNumber.setLayoutX(560);
            txtCustomerPhoneNumber.setLayoutY(407);
            txtCustomerPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 21));

            // Updating the text node for total price
            txtYourFinalPrice.setText("Total Price: $" + String.format("%.2f", dblTotalCost));

            // Setting the alignment and size of the text field for name
            txtFieldNameInput.setMinWidth(50);
            txtFieldNameInput.setPrefHeight(50);
            txtFieldNameInput.setLayoutX(560);
            txtFieldNameInput.setLayoutY(150);
            txtFieldNameInput.setFont(Font.font("Geometric Sans-Serif", 13));

            // Setting the alignment and size of the text field for address
            txtFieldAddressInput.setMinWidth(50);
            txtFieldAddressInput.setPrefHeight(90);
            txtFieldAddressInput.setLayoutX(560);
            txtFieldAddressInput.setLayoutY(266);
            txtFieldAddressInput.setFont(Font.font("Geometric Sans-Serif", 13));

            // Setting the alignment and size of the text field for phone number
            txtFieldPhoneNumber.setMinWidth(50);
            txtFieldPhoneNumber.setPrefHeight(40);
            txtFieldPhoneNumber.setLayoutX(560);
            txtFieldPhoneNumber.setLayoutY(427);
            txtFieldPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 13));

            // Setting the alignment, font size and button size for the button
            // "btnPlaceOrder"
            btnPlaceOrder.setLayoutX(580);
            btnPlaceOrder.setLayoutY(503);
            btnPlaceOrder.setFont(Font.font("Geometric Sans-Serif", 14));
            btnPlaceOrder.setPrefSize(97, 50);

            // Adding all the objects to the checkout pane
            if (paneCheckout.lookup("#txtFieldAddressInput") == null) {
                paneCheckout.getChildren().addAll(txtFieldAddressInput);
            }
            if (paneCheckout.lookup("#txtFieldNameInput") == null) {
                paneCheckout.getChildren().addAll(txtFieldNameInput);
            }
            if (paneCheckout.lookup("#txtFieldPhoneNumber") == null) {
                paneCheckout.getChildren().addAll(txtFieldPhoneNumber);
            }
            if (paneCheckout.lookup("#btnPlaceOrder") == null) {
                paneCheckout.getChildren().addAll(btnPlaceOrder);
            }
            if (paneCheckout.lookup("#txtCustomerName") == null) {
                paneCheckout.getChildren().addAll(txtCustomerName);
            }
            if (paneCheckout.lookup("#txtCustomerAddress") == null) {
                paneCheckout.getChildren().addAll(txtCustomerAddress);
            }
            if (paneCheckout.lookup("#txtCustomerPhoneNumber") == null) {
                paneCheckout.getChildren().addAll(txtCustomerPhoneNumber);
            }

        });

        // Setting the button "btnBack" on action
        btnBack.setOnAction(e -> stgApp.setScene(sceneMain));

        // Setting the button "btnAddToYourCart" on action
        btnAddToYourCart.setOnAction(e -> {

            // Using the method Message() to display the message "Your Item successfully
            // added to the cart !"
            Message();

            // Adding the build your own pizza to the dblTotalCost
            dblTotalCost += dblPlainPizzaCost;

            // Iterating through array "arrListToppings" to get all the toppings name
            for (int t = 0; t < arrListToppings.size(); t++) {

                // Adding all the topping to one string
                strAddItems += arrListToppings.get(t) + " ";
            }

            // Adding all the toppings data and cost associated with it ot the hash map
            // "hshMapCheckOut"
            hshMapCheckOut.put(strAddItems, dblPlainPizzaCost);

            // Adding toppings data in "strAddItems" to the hash map hashMapTrackThings
            hashMapTrackThings.put(0, strAddItems);

            // If the hashMapTrackThings or hashMapTrackThings size is 0 or 1, we're
            // updating the price.
            if ((hashMapTrackThings.size() == 0) || (hashMapTrackThings.size() == 1)) {

                /// Using the method AddCounter() to count the total number of items
                AddCounter();

                txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));
            }

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

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intpepCnt + ") Items");

                }

                else if (strKey.equals("Buffalo Chicken Pizza")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intBflCknCnt + ") Items");

                }

                else if (strKey.equals("Wisconsin 6 Cheese Pizza")) {

                    txtLabel.setText(
                            strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                                    + intWisCheeseCnt + ") Items");

                }

                else if (strKey.equals("French Fries")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intFrchFrsCnt + ") Items");

                }

                else if (strKey.equals("Stuffed cheesy bread")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intChsyBrdCnt + ") Items");

                }

                else if (strKey.equals("Drinks")) {

                    txtLabel.setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + "   ("
                            + intDrnksCnt + ") Items");

                }

                else if (strKey.equals(hashMapTrackThings.get(0))) {
                    txtLabel.setText("Plain Pizza (with " + arrListToppings.size() + " toppings): $"
                            + String.format("%.2f", hshMapCheckOut.get(strKey)));
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

            txtCustomerName.setLayoutX(560);
            txtCustomerName.setLayoutY(130);
            txtCustomerName.setFont(Font.font("Geometric Sans-Serif", 21));

            txtCustomerAddress.setLayoutX(560);
            txtCustomerAddress.setLayoutY(246);
            txtCustomerAddress.setFont(Font.font("Geometric Sans-Serif", 21));

            txtCustomerPhoneNumber.setLayoutX(560);
            txtCustomerPhoneNumber.setLayoutY(407);
            txtCustomerPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 21));

            if ((hashMapTrackThings.size() == 1) || (hashMapTrackThings.size() == 0)) {
                txtYourFinalPrice.setText("Total Price: $" + String.format("%.2f", dblTotalCost));
            }

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

            //paneCheckout.getChildren().addAll(txtFieldAddressInput, txtFieldNameInput, txtFieldPhoneNumber,btnPlaceOrder);
            if (paneCheckout.lookup("#txtFieldAddressInput") == null) {
                paneCheckout.getChildren().addAll(txtFieldAddressInput);
            }
            if (paneCheckout.lookup("#txtFieldNameInput") == null) {
                paneCheckout.getChildren().addAll(txtFieldNameInput);
            }
            if (paneCheckout.lookup("#txtFieldPhoneNumber") == null) {
                paneCheckout.getChildren().addAll(txtFieldPhoneNumber);
            }
            if (paneCheckout.lookup("#btnPlaceOrder") == null) {
                paneCheckout.getChildren().addAll(btnPlaceOrder);
            }

        });
        btnBack_1.setOnAction(e -> stgApp.setScene(sceneMain));
        btnPlaceOrder.setOnAction(e -> {

            if ((txtFieldNameInput.getText().length() != 0) &&
                    (txtFieldAddressInput.getText().length() != 0) &&
                    (txtFieldPhoneNumber.getText().length() != 0)) {

                panePlaceOrder.getChildren().removeIf(node -> node instanceof Text);
                panePlaceOrder.getChildren().addAll(txtCustomerName, txtCustomerAddress, txtCustomerPhoneNumber,
                        txtPlaceOrderFinalPrice, txtSeparator, txtOrderConfirmed, txtReceipt);

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

                txtCustomerName.setLayoutX(50);
                txtCustomerName.setLayoutY(400);
                txtCustomerName.setFont(Font.font("Geometric Sans-Serif", 18));

                txtCustomerAddress.setLayoutX(50);
                txtCustomerAddress.setLayoutY(435);
                txtCustomerAddress.setFont(Font.font("Geometric Sans-Serif", 18));

                txtCustomerPhoneNumber.setLayoutX(50);
                txtCustomerPhoneNumber.setLayoutY(470);
                txtCustomerPhoneNumber.setFont(Font.font("Geometric Sans-Serif", 18));

                int intPositionCopy = 290;
                for (String strKey : hshMapCheckOut.keySet()) {

                    Text txtDominosReturnCopy = DominosText();
                    Text txtLabelCopy = new Text();

                    if (strKey.equals("Pepperoni Pizza")) {

                        txtLabelCopy
                                .setText(strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " ("
                                        + intpepCnt + ") Items");

                    }

                    else if (strKey.equals("Buffalo Chicken Pizza")) {

                        txtLabelCopy.setText(
                                strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " (" + intBflCknCnt
                                        + ") Items");

                    }

                    else if (strKey.equals("Wisconsin 6 Cheese Pizza")) {

                        txtLabelCopy.setText(
                                strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " ("
                                        + intWisCheeseCnt + ") Items");

                    }

                    else if (strKey.equals("French Fries")) {

                        txtLabelCopy.setText(
                                strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " ("
                                        + intFrchFrsCnt + ") Items");

                    }

                    else if (strKey.equals("Stuffed cheesy bread")) {

                        txtLabelCopy.setText(
                                strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " ("
                                        + intChsyBrdCnt + ") Items");

                    }

                    else if (strKey.equals("Drinks")) {

                        txtLabelCopy.setText(
                                strKey + ": $" + String.format("%.2f", hshMapCheckOut.get(strKey)) + " (" + intDrnksCnt
                                        + ") Items");

                    }

                    else if (strKey.equals(hashMapTrackThings.get(0))) {
                        txtLabelCopy.setText("Plain Pizza (with " + arrListToppings.size() + " toppings): $"
                                + String.format("%.2f", hshMapCheckOut.get(strKey)));
                    }

                    txtLabelCopy.setFont(Font.font("Geometric Sans-Serif", 19));
                    txtLabelCopy.setLayoutX(430);
                    txtLabelCopy.setLayoutY(intPositionCopy);
                    panePlaceOrder.getChildren().add(txtLabelCopy);
                    panePlaceOrder.getChildren().add(txtDominosReturnCopy);
                    intPositionCopy += 38;
                }

                txtSeparator.setLayoutX(430);
                txtSeparator.setLayoutY(intPositionCopy - 17);
                txtSeparator.setFont(Font.font("Geometric Sans-Serif", 19));

                txtPlaceOrderFinalPrice.setText("Total Price: $" + String.format("%.2f", dblTotalCost));
                txtPlaceOrderFinalPrice.setLayoutX(430);
                txtPlaceOrderFinalPrice.setLayoutY(intPositionCopy);
                txtPlaceOrderFinalPrice.setFont(Font.font("Geometric Sans-Serif", 19));

                // panePlaceOrder.getChildren().addAll(
                // txtPlaceOrderFinalPrice, txtSeparator);

            }

            else {

                Text txtCommand = new Text("Please enter you name,\nAddress and Phone number");
                txtCommand.setLayoutX(220);
                txtCommand.setLayoutY(126);
                txtCommand.setFont(Font.font("Geometric Sans-Serif", 19));
                paneCheckout.getChildren().add(txtCommand);
                txtCommand.setFill(Color.RED);

                int intDurationInSeconds = 5;

                // Create a Timeline to hide the message after the specified duration
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(intDurationInSeconds), new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                // Hide the message after the specified duration
                                txtCommand.setText("");
                            }
                        }));

                // Start the Timeline
                timeline.play();

            }

        });

        btnReturnToMainMenu.setOnAction(e -> {
            reset();
            stgApp.setScene(sceneMain);
        });

        stgApp.setScene(sceneMain);
        stgApp.setTitle("Dominos App");
        stgApp.show();

    }

    private void reset() {

        intItemsCount = 0;
        intPepperoniPizzaCount = 0;
        intBuffaloChickenPizzaCount = 0;

        txtFieldNameInput.clear();
        txtFieldAddressInput.clear();
        txtFieldPhoneNumber.clear();

        // Reset all counter variables

        dblTotalCost = 0.0;
        dblPlainPizzaCost = 10.50;
        // Reset all total/cost variables

        txtNumberOfItems.setText("You have\n" + intItemsCount + " items in your cart");
        txtYourPrice.setText("Your\nPrice: $" + String.format("%.2f", dblTotalCost));
        txtCurrentPrice.setText("Your Current Total Price: $" + String.format("%.2f", dblPlainPizzaCost));

        hshMapCheckOut.clear();
        hashMapTrackThings.clear();
        arrListToppings.clear();

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

        intStuffedcheesyBreadCount += 1;
        return intStuffedcheesyBreadCount;

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

    // Main method
    public static void main(String[] args) {
        launch(args);
    }

}

// Tab order should be consistent (optional)
// Fix the spaces in plain pizza - Fixed
// Error checking for price $0.00
// Word wrapping in text field ( use textArea )
// Use Mysql (side project)
// duplicate objects added - Fixed
// documented