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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week15_GUI_Program_Final_ECommerce extends Application {

    @Override
    public void start(Stage stgApp) throws Exception {

        Pane paneMain = new Pane();

        Image imgDominosLogo = new Image("dominos.jpg");
        ImageView imageViewDominosLogo = new ImageView(imgDominosLogo);
        imageViewDominosLogo.setLayoutX(0);
        imageViewDominosLogo.setLayoutY(0);

        Image imgDominosLogo_1 = new Image("dominos.jpg");
        ImageView imageViewDominosLogo_1 = new ImageView(imgDominosLogo_1);
        imageViewDominosLogo_1.setLayoutX(0);
        imageViewDominosLogo_1.setLayoutY(0);

        Image imgBuildYourOwnPizza = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza = new ImageView(imgBuildYourOwnPizza);
        imageViewBuildYourOwnPizza.setLayoutX(40);
        imageViewBuildYourOwnPizza.setLayoutY(120);
        imageViewBuildYourOwnPizza.setFitWidth(120);
        imageViewBuildYourOwnPizza.setFitHeight(120);

        Image imgBuildYourOwnPizza_1 = new Image("Create your own.jpg");
        ImageView imageViewBuildYourOwnPizza_1 = new ImageView(imgBuildYourOwnPizza_1);
        imageViewBuildYourOwnPizza_1.setLayoutX(110);
        imageViewBuildYourOwnPizza_1.setLayoutY(118);
        imageViewBuildYourOwnPizza_1.setFitWidth(140);
        imageViewBuildYourOwnPizza_1.setFitHeight(140);

        Text txtDominos = new Text("Dominos");
        txtDominos.setLayoutX(100);
        txtDominos.setLayoutY(55);
        txtDominos.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos.setFill(Color.WHITESMOKE);

        Text txtDominos_1 = new Text("Dominos");
        txtDominos_1.setLayoutX(100);
        txtDominos_1.setLayoutY(55);
        txtDominos_1.setFont(Font.font("Geometric Sans-Serif", 43));
        txtDominos_1.setFill(Color.WHITESMOKE);

        Button btnBuildYourOwnPizza = new Button("Build your own");
        btnBuildYourOwnPizza.setLayoutX(50);
        btnBuildYourOwnPizza.setLayoutY(260);
        btnBuildYourOwnPizza.setFont(Font.font("Geometric Sans-Serif", 13));

        Button btnCheckout = new Button("checkout");
        btnCheckout.setLayoutX(670);
        btnCheckout.setLayoutY(530);
        btnCheckout.setPrefSize(93, 35);
        btnCheckout.setFont(Font.font("Geometric Sans-Serif", 15));

        Rectangle rectangleDominosHeader = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleDominosHeader_1 = new Rectangle(1000, 82, Color.DARKBLUE);
        Rectangle rectangleBackground = new Rectangle(1000, 700, Color.ALICEBLUE);
        Rectangle rectangleBackground_1 = new Rectangle(1000, 700, Color.ALICEBLUE);
        Rectangle rectangleBackground_2 = new Rectangle(1000, 700, Color.ALICEBLUE);

        paneMain.getChildren().add(rectangleBackground);
        paneMain.getChildren().add(rectangleDominosHeader);
        paneMain.getChildren().add(imageViewDominosLogo);
        paneMain.getChildren().add(txtDominos);
        paneMain.getChildren().add(btnBuildYourOwnPizza);
        paneMain.getChildren().add(btnCheckout);
        paneMain.getChildren().add(imageViewBuildYourOwnPizza);
        

        Button btnBack = new Button("BACK");
        btnBack.setLayoutX(20);
        btnBack.setLayoutY(20);
        btnBack.setFont(Font.font("Geometric Sans-Serif", 15));

        Button btnBack_1 = new Button("BACK");
        btnBack_1.setLayoutX(27);
        btnBack_1.setLayoutY(110);
        btnBack_1.setFont(Font.font("Geometric Sans-Serif", 15));

        Pane paneBuildYourPizza = new Pane();
        paneBuildYourPizza.getChildren().add(rectangleBackground_2);
        paneBuildYourPizza.getChildren().add(btnBack);
        paneBuildYourPizza.getChildren().add(imageViewBuildYourOwnPizza_1);
        

        Pane paneCheckout = new Pane();
        paneCheckout.getChildren().add(rectangleBackground_1);
        paneCheckout.getChildren().add(rectangleDominosHeader_1);
        paneCheckout.getChildren().add(imageViewDominosLogo_1);
        paneCheckout.getChildren().add(btnBack_1);
        paneCheckout.getChildren().add(txtDominos_1);
        

        Scene sceneMain = new Scene(paneMain, 800, 600);
        Scene sceneBuildYourOwnPizza = new Scene(paneBuildYourPizza, 800, 600);
        Scene sceneCheckout = new Scene(paneCheckout, 800, 600);

        btnBuildYourOwnPizza.setOnAction(e -> stgApp.setScene(sceneBuildYourOwnPizza));
        btnBack.setOnAction(e -> stgApp.setScene(sceneMain));
        btnCheckout.setOnAction(e -> stgApp.setScene(sceneCheckout));
        btnBack_1.setOnAction(e -> stgApp.setScene(sceneMain));

        stgApp.setScene(sceneMain);
        stgApp.setTitle("Dominos App");
        stgApp.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
