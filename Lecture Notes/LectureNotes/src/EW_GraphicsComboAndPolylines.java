/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsComboAndPolylines
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-07
    Purpose:	The purpose of this program is to create a JavaFX program which uses arrays to work
                with combo boxes, polylines and other shapes.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EW_GraphicsComboAndPolylines extends Application{

    public static final int DRAWING_HEIGHT = 600, DRAWING_WIDTH=600;
    public static String strShapeType = "", strColorChosen = "", strShapeCount = "";
    public static String strTxtMessage = "";
    public static Label lblMessage = new Label();
    public static Random rndGen = new Random();

    @Override
    public void start(Stage stgMStage) {

        HBox hbxWholeStage = new HBox();        // overall container which will have two vboxes
        hbxWholeStage.setMinHeight(600);
        hbxWholeStage.setMinWidth(800);
        Group grpTheDrawingCanvas = new Group();    // container for the drawing canvas
        grpTheDrawingCanvas.minHeight(DRAWING_HEIGHT);      // set the drawing canvas size
        grpTheDrawingCanvas.minWidth(DRAWING_WIDTH);

        VBox vbxGUI = new VBox();               // the left side of the scene (a vertical GUI)
        vbxGUI.setMinWidth(200);
        vbxGUI.setMinHeight(600);
        vbxGUI.setBorder(Border.stroke(Color.DARKRED));
        vbxGUI.setSpacing(10);
        vbxGUI.setPadding(new Insets(5,5,5,5));

        Label lblFirstInstruction = new Label("1) Select a Shape, a count" + 
                "\n   and a Color Choice" +
                "\n   and then click \"Draw Shapes\"");
        vbxGUI.getChildren().add(lblFirstInstruction);
        
        TilePane tpnShapesAndCounts = new TilePane();   // hold the label and combobox for drawing shapes
        tpnShapesAndCounts.setMaxWidth(200);
        tpnShapesAndCounts.setVgap(10);
        Label lblShapes = new Label("Shape choice: ");
        ComboBox<String> cbxShapes = new ComboBox<>();            // create the combo for shapes
        cbxShapes.getItems().add("Circles");
        cbxShapes.getItems().add("Squares");
        cbxShapes.getItems().add("Polylines");
        cbxShapes.setOnAction((event) -> {
            strShapeType = cbxShapes.getValue().toString();
//            System.out.println(strShapeType);         // sometimes print to make sure what is happening
        });
        Label lblCount = new Label("Shape count choice: ");
        ComboBox<String> cbxCount = new ComboBox<>();            // create the combo for shape count
        cbxCount.getItems().add("10");
        cbxCount.getItems().add("20");
        cbxCount.getItems().add("30");
        cbxCount.getItems().add("Random");
        cbxCount.setOnAction((event) -> {
            strShapeCount = cbxCount.getValue().toString();
//            System.out.println(strShapeCount);        // sometimes print to make sure what is happening
        });
        Label lblColors = new Label("Color choice: ");
        ComboBox<String> cbxColors = new ComboBox<>();            // create the combo for colors
        cbxColors.getItems().add("Red");
        cbxColors.getItems().add("Green");
        cbxColors.getItems().add("Blue");
        cbxColors.getItems().add("Orange");
        cbxColors.getItems().add("Random");
        cbxColors.setOnAction((event) -> {
            strColorChosen = cbxColors.getValue().toString();
//            System.out.println(strColorChosen);       // sometimes print to make sure what is happening
        });

        Button btnDrawShapes = new Button("Draw Shapes");
        btnDrawShapes.setOnAction(new EventHandler<ActionEvent>() {     
            @Override public void handle(ActionEvent e){   
                String strTempMsgText = ""; 
                if(strShapeType.equals("")){
                    strTempMsgText += "You must first pick a Shape!\n";
                }
                if(strShapeCount.equals("")){
                    strTempMsgText += "You must first pick a Count!\n";
                }
                if(strColorChosen.equals("")){
                    strTempMsgText += "You must first pick a Color!\n";
                }
                if(strTempMsgText.equals("")){  // this means there were no errors!
                    drawUsersShapes(grpTheDrawingCanvas);
                    strTxtMessage = "Your shapes are now drawn!";
                } else {
                    strTxtMessage = strTempMsgText;
                }
                lblMessage.setText(strTxtMessage);
            }
        });

        strTxtMessage = "Please make selections.";
        lblMessage.setText(strTxtMessage);
        tpnShapesAndCounts.getChildren().addAll(lblShapes,cbxShapes,lblCount, cbxCount, lblColors, 
                cbxColors, btnDrawShapes);
        vbxGUI.getChildren().addAll(tpnShapesAndCounts, lblMessage);

        hbxWholeStage.getChildren().addAll(vbxGUI,grpTheDrawingCanvas);
        Scene scnMyScene = new Scene(hbxWholeStage);
        stgMStage.setTitle("Dropdowns, Polylines, and other using Arrays");
        stgMStage.setScene(scnMyScene);
        stgMStage.show();
    }

    public static void drawUsersShapes(Group grpTheCanvas){
        grpTheCanvas.getChildren().clear();             // remove anything that may still be there
        int intShapeCount = 0;
        switch (strShapeCount){
            case "10":
                intShapeCount = 10;
                break;
            case "20":
                intShapeCount = 20;
                break;
            case "30":
                intShapeCount = 30;
                break;
            case "Random":
                intShapeCount = rndGen.nextInt(1,31);        // get a rand # between 1 and 30
                break;
        }

        switch (strShapeType){
            case "Circles":
                // create all circles
                Circle[] cirAllCircles = new Circle[intShapeCount];
                int i = 0;      // init a counter for all circles
                for (Circle cirOneCircle : cirAllCircles){
                    cirOneCircle = new Circle();
                    cirOneCircle.setRadius(rndGen.nextDouble(25, 75));
                    double dblMinX = cirOneCircle.getRadius();
                    double dblMaxX = DRAWING_WIDTH - cirOneCircle.getRadius();
                    double dblMinY = cirOneCircle.getRadius();
                    double dblMaxY = DRAWING_HEIGHT - cirOneCircle.getRadius();
                    cirOneCircle.setCenterX(rndGen.nextDouble(dblMinX, dblMaxX));
                    cirOneCircle.setCenterY(rndGen.nextDouble(dblMinY, dblMaxY));
                    cirAllCircles[i]=cirOneCircle;
                    switch (strColorChosen){
                        case "Red":
                            cirAllCircles[i].setFill(Color.RED);
                            cirAllCircles[i].setOpacity(.5);        // make them semi-transparent
                            break;
                        case "Green":
                            cirAllCircles[i].setFill(Color.GREEN);
                            cirAllCircles[i].setOpacity(.5);
                            break;
                        case "Blue":
                            cirAllCircles[i].setFill(Color.BLUE);
                            cirAllCircles[i].setOpacity(.5);
                            break;
                        case "Orange":
                            cirAllCircles[i].setFill(Color.ORANGE);
                            cirAllCircles[i].setOpacity(.5);
                            break;
                        case "Random":
                            cirAllCircles[i].setFill(Color.rgb(rndGen.nextInt(0,255), 
                            rndGen.nextInt(0,255),rndGen.nextInt(0,255),
                            rndGen.nextDouble()));
                            break;
                    }
                    cirAllCircles[i].setStroke(Color.BLACK);
                    cirAllCircles[i].setStrokeWidth(2);
                    grpTheCanvas.getChildren().add(cirAllCircles[i]);
                    i++;
                }
                break;
            case "Squares":
                Rectangle[] rctAllSquares = new Rectangle[intShapeCount];
                int j = 0;      // init a counter for all squares
                for (Rectangle rctOneSquare : rctAllSquares){
                    rctOneSquare = new Rectangle();
                    rctOneSquare.setWidth(rndGen.nextDouble(25, 150));
                    rctOneSquare.setHeight(rctOneSquare.getWidth());
                    double dblMaxX = DRAWING_WIDTH - rctOneSquare.getWidth();
                    double dblMaxY = DRAWING_HEIGHT - rctOneSquare.getWidth();
                    rctOneSquare.setX(rndGen.nextDouble(0, dblMaxX));
                    rctOneSquare.setY(rndGen.nextDouble(0, dblMaxY));
                    rctAllSquares[j]=rctOneSquare;
                    switch (strColorChosen){
                        case "Red":
                            rctAllSquares[j].setFill(Color.RED);
                            rctAllSquares[j].setOpacity(.5);        // make them semi-transparent
                            break;
                        case "Green":
                            rctAllSquares[j].setFill(Color.GREEN);
                            rctAllSquares[j].setOpacity(.5);
                            break;
                        case "Blue":
                            rctAllSquares[j].setFill(Color.BLUE);
                            rctAllSquares[j].setOpacity(.5);
                            break;
                        case "Orange":
                            rctAllSquares[j].setFill(Color.ORANGE);
                            rctAllSquares[j].setOpacity(.5);
                            break;
                        case "Random":
                            rctAllSquares[j].setFill(Color.rgb(rndGen.nextInt(0,255), 
                            rndGen.nextInt(0,255),rndGen.nextInt(0,255),
                            rndGen.nextDouble()));
                            break;
                    }
                    rctAllSquares[j].setStrokeWidth(2);
                    rctAllSquares[j].setStroke(Color.BLACK);
                    grpTheCanvas.getChildren().add(rctAllSquares[j]);
                    j++;
                }
                break;
            case "Polylines":
                double[] aryPolyPoints = new double[intShapeCount * 2 + 2]; // polypoints need an x,y for each point
                int k = 0;      // init a counter for all polypoints x and y

                for (int l=0; l<intShapeCount;l++){
                    aryPolyPoints[k] = rndGen.nextDouble(DRAWING_WIDTH);
                    aryPolyPoints[k+1] = rndGen.nextDouble(DRAWING_HEIGHT);
                    k+=2;           // adding both the x and y into the array
                }
                Polyline plySquiggles = new Polyline(aryPolyPoints);
                plySquiggles.setStrokeWidth(2);
                grpTheCanvas.getChildren().add(plySquiggles);
                switch (strColorChosen){
                    case "Red":
                        plySquiggles.setFill(Color.RED);
                        break;
                    case "Green":
                        plySquiggles.setFill(Color.GREEN);
                        break;
                    case "Blue":
                        plySquiggles.setFill(Color.BLUE);
                        break;
                    case "Orange":
                        plySquiggles.setFill(Color.ORANGE);
                        break;
                    case "Random":
                        plySquiggles.setFill(Color.rgb(rndGen.nextInt(0,255), 
                        rndGen.nextInt(0,255),rndGen.nextInt(0,255),
                        rndGen.nextDouble()));
                        break;
                    }
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }    
}

