/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week04_GUI_Program_2_House
    Author:		AJ
    Language:	Java
    Date:		2023-09-14
    Purpose:	The purpose of this program is to draw a house with a door , doorknob, windows and a chimney. Also,
                adding smoke coming out of the chimney and some clouds in the sky. We are using javaFX method to 
                create and design graphics.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-14	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class AJ_Week04_GUI_Program_2_House extends Application{
    
    // Start Method
    public void start(Stage appStage) { 
        
        // Main base of the house
        // Creating the Base rectangle shape. 
        Rectangle rectangleBase = new Rectangle(370,200);
        rectangleBase.setX(150); 
        rectangleBase.setY(400);                         
        rectangleBase.setFill(Color.LIGHTSKYBLUE);              
        Group groupHouse = new Group(rectangleBase);    

        // Door of the house
        // Creating the rectangle shape for door
        Rectangle rectangleDoor = new Rectangle(55,90);
        rectangleDoor.setX(300); 
        rectangleDoor.setY(510);                         
        rectangleDoor.setFill(Color.BROWN); 
        groupHouse.getChildren().add(rectangleDoor);  

        // Doorknob of the house
        // Creating a small circle for doorknob
        Circle circleDoorknob = new Circle(343,555,4,Color.YELLOW);
        circleDoorknob.getStrokeLineCap();                  
        circleDoorknob.setStrokeWidth(3);
        circleDoorknob.setStroke(Color.YELLOW);
        groupHouse.getChildren().add(circleDoorknob);

        // Chimney of the house
        // Creating vertical shaped rectangle for chimney
        Rectangle rectangleChimney = new Rectangle(55,90);
        rectangleChimney.setX(460); 
        rectangleChimney.setY(310);                         
        rectangleChimney.setFill(Color.GREY); 
        groupHouse.getChildren().add(rectangleChimney); 

        // Middle Cloud in the Sky
        Circle circleCloud1 = new Circle(450, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud2 = new Circle(480, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud3 = new Circle(510, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud4 = new Circle(475, 150, 30,Color.LIGHTBLUE);
        groupHouse.getChildren().add(circleCloud1);
        groupHouse.getChildren().add(circleCloud2);
        groupHouse.getChildren().add(circleCloud3);
        groupHouse.getChildren().add(circleCloud4);

        // Left Cloud in the Sky
        Circle circleCloud5 = new Circle(250, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud6 = new Circle(280, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud7 = new Circle(310, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud8 = new Circle(275, 150, 30,Color.LIGHTBLUE);
        groupHouse.getChildren().add(circleCloud5);
        groupHouse.getChildren().add(circleCloud6);
        groupHouse.getChildren().add(circleCloud7);
        groupHouse.getChildren().add(circleCloud8);

        // Right Cloud in the Sky
        Circle circleCloud9 = new Circle(650, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud10 = new Circle(680, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud11 = new Circle(710, 180, 30,Color.LIGHTBLUE);
        Circle circleCloud12 = new Circle(675, 150, 30,Color.LIGHTBLUE);
        groupHouse.getChildren().add(circleCloud9);
        groupHouse.getChildren().add(circleCloud10);
        groupHouse.getChildren().add(circleCloud11);
        groupHouse.getChildren().add(circleCloud12);

        // Smoke 1 in the sky using circle
        Circle circleSmoke1 = new Circle(490,300,4,Color.BLACK);
        circleSmoke1.getStrokeLineCap();                  
        circleSmoke1.setStrokeWidth(3);
        circleSmoke1.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke1);
        
        // Smoke 2 in the sky using circle
        Circle circleSmoke2 = new Circle(500,280,4,Color.BLACK);
        circleSmoke2.getStrokeLineCap();                  
        circleSmoke2.setStrokeWidth(3);
        circleSmoke2.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke2);
        
        // Smoke 3 in the sky using circle
        Circle circleSmoke3 = new Circle(515,265,4,Color.BLACK);
        circleSmoke3.getStrokeLineCap();                  
        circleSmoke3.setStrokeWidth(3);
        circleSmoke3.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke3);
        
        // Smoke 4 in the sky using circle
        Circle circleSmoke4 = new Circle(530,245,4,Color.BLACK);
        circleSmoke4.getStrokeLineCap();                  
        circleSmoke4.setStrokeWidth(3);
        circleSmoke4.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke4);
        
        // Smoke 5 in the sky using circle
        Circle circleSmoke5 = new Circle(540,232,4,Color.BLACK);
        circleSmoke5.getStrokeLineCap();                  
        circleSmoke5.setStrokeWidth(3);
        circleSmoke5.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke5);

        // Smoke 6 in the sky using circle
        Circle circleSmoke6 = new Circle(555,220,4,Color.BLACK);
        circleSmoke6.getStrokeLineCap();                  
        circleSmoke6.setStrokeWidth(3);
        circleSmoke6.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke6);

        // Smoke 7 in the sky using circle
        Circle circleSmoke7= new Circle(570,208,4,Color.BLACK);
        circleSmoke7.getStrokeLineCap();                  
        circleSmoke7.setStrokeWidth(3);
        circleSmoke7.setStroke(Color.BLACK);
        groupHouse.getChildren().add(circleSmoke7);

        // Creating the Outer Window 1 for the house
        Rectangle rectangleOuterWindow1 = new Rectangle(90,60);
        rectangleOuterWindow1.setX(190); 
        rectangleOuterWindow1.setY(430);                         
        rectangleOuterWindow1.setFill(Color.BLACK);              
        groupHouse.getChildren().add(rectangleOuterWindow1);
        
        // Creating the Inner window 1 for the house
        Rectangle rectangleInnerWindow1 = new Rectangle(50,30);
        rectangleInnerWindow1.setX(210); 
        rectangleInnerWindow1.setY(445);                         
        rectangleInnerWindow1.setFill(Color.WHITE);              
        groupHouse.getChildren().add(rectangleInnerWindow1);


        // Creating the Outer Window 2 for the house
        Rectangle rectangleOuterWindow2 = new Rectangle(90,60);
        rectangleOuterWindow2.setX(390); 
        rectangleOuterWindow2.setY(430);                         
        rectangleOuterWindow2.setFill(Color.BLACK);              
        groupHouse.getChildren().add(rectangleOuterWindow2);
        
        // Creating the Inner window 2 for the house
        Rectangle rectangleInnerWindow2 = new Rectangle(50,30);
        rectangleInnerWindow2.setX(410); 
        rectangleInnerWindow2.setY(445);                         
        rectangleInnerWindow2.setFill(Color.WHITE);              
        groupHouse.getChildren().add(rectangleInnerWindow2);

        
        // Creating a scene and adding the group which has all the elements
        Scene scnMyScene = new Scene(groupHouse, 900, 700);

        // Adding the scene to the stage
        appStage.setScene(scnMyScene);                    

        // Setting the Title
        appStage.setTitle("Modern House");    
        appStage.show();
    }
    
    // Main Method
    public static void main(String [] args) {
         
        launch(args);

    }
} 
