/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week10_GUI_Program_3_StackPane_SecondModel
    Author:		AJ
    Language:	Java
    Date:		2023-10-26
    Purpose:	The purpose of this program is to create a stackpane to stack 5 different shapes(with decreasing
                size) on top of each other. Also, placing my name as a text object on the top level in 20
                point size.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week10_GUI_Program_3_StackPane_SecondModel extends Application {

    @Override
    public void start(Stage stgApp) {

        Text txtNameDescription = new Text("Athul Jaishankar (AJ)");
        txtNameDescription.setFont(new Font("Comic Sans MS", 20));
        txtNameDescription.setFill(Color.BLACK);

        Rectangle rectangleShape = new Rectangle(265, 165);
        rectangleShape.setFill(Color.rgb(255, 0, 0, 0.5));
        rectangleShape.setStroke(Color.BLACK);
        rectangleShape.setStrokeWidth(2);
        
        Circle circleShape = new Circle(70);
        circleShape.setFill(Color.rgb(0, 255, 0, 0.5));
        circleShape.setStroke(Color.BLACK);
        circleShape.setStrokeWidth(2);

        Ellipse ellipseShape = new Ellipse(50,30);
        ellipseShape.setFill(Color.rgb(0, 0, 255, 0.5));
        ellipseShape.setStroke(Color.BLACK);
        ellipseShape.setStrokeWidth(2);

        Polygon polygonShape = new Polygon();
        polygonShape.getPoints().addAll(
            0.0, 0.0,
            50.0, 0.0,
            25.0, 40.0
        );
        polygonShape.setFill(Color.rgb(255, 165, 0, 0.5));
        polygonShape.setStroke(Color.BLACK);
        polygonShape.setStrokeWidth(2);

        Arc arcShape = new Arc(100,100,15,15,0.5,180);
        arcShape.setFill(Color.rgb(128, 0, 128, 0.5));
        arcShape.setStroke(Color.BLACK);
        arcShape.setStrokeWidth(2);

        VBox vboxContainer = new VBox();
        vboxContainer.setAlignment(Pos.CENTER);
        vboxContainer.getChildren().addAll(arcShape,polygonShape,ellipseShape,circleShape,rectangleShape);

        StackPane stackPaneText = new StackPane();
        stackPaneText.getChildren().add(txtNameDescription);

        HBox hboxContainer = new HBox();
        hboxContainer.setAlignment(Pos.CENTER);
        hboxContainer.getChildren().addAll(vboxContainer);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(stackPaneText);
        borderPane.setCenter(hboxContainer);

        Scene scene = new Scene(borderPane, 900, 750);
        stgApp.setScene(scene);
        stgApp.setTitle("StackPane Project on Top of each other");
        stgApp.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}