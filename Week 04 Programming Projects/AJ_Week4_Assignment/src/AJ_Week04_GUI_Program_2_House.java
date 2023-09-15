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
        Rectangle baseRectangle = new Rectangle(370,200);
        baseRectangle.setX(150); 
        baseRectangle.setY(400);                         
        baseRectangle.setFill(Color.LIGHTSKYBLUE);              
        Group group = new Group(baseRectangle);    

        // Door of the house
        // Creating the rectangle shape for door
        Rectangle doorRectangle = new Rectangle(55,90);
        doorRectangle.setX(300); 
        doorRectangle.setY(510);                         
        doorRectangle.setFill(Color.BROWN); 
        group.getChildren().add(doorRectangle);  

        // Doorknob of the house
        // Creating a small circle for doorknob
        Circle doorknobCircle = new Circle(343,555,4,Color.YELLOW);
        doorknobCircle.getStrokeLineCap();                  
        doorknobCircle.setStrokeWidth(3);
        doorknobCircle.setStroke(Color.YELLOW);
        group.getChildren().add(doorknobCircle);

        // Chimney of the house
        // Creating vertical shaped rectangle for chimney
        Rectangle chimneyRectangle = new Rectangle(55,90);
        chimneyRectangle.setX(460); 
        chimneyRectangle.setY(310);                         
        chimneyRectangle.setFill(Color.GREY); 
        group.getChildren().add(chimneyRectangle); 

        // Middle Cloud in the Sky
        Circle cloudCircle1 = new Circle(450, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle2 = new Circle(480, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle3 = new Circle(510, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle4 = new Circle(475, 150, 30,Color.LIGHTBLUE);
        group.getChildren().add(cloudCircle1);
        group.getChildren().add(cloudCircle2);
        group.getChildren().add(cloudCircle3);
        group.getChildren().add(cloudCircle4);

        // Left Cloud in the Sky
        Circle cloudCircle5 = new Circle(250, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle6 = new Circle(280, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle7 = new Circle(310, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle8 = new Circle(275, 150, 30,Color.LIGHTBLUE);
        group.getChildren().add(cloudCircle5);
        group.getChildren().add(cloudCircle6);
        group.getChildren().add(cloudCircle7);
        group.getChildren().add(cloudCircle8);

        // Red Cloud in the Sky
        Circle cloudCircle9 = new Circle(650, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle10 = new Circle(680, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle11 = new Circle(710, 180, 30,Color.LIGHTBLUE);
        Circle cloudCircle12 = new Circle(675, 150, 30,Color.LIGHTBLUE);
        group.getChildren().add(cloudCircle9);
        group.getChildren().add(cloudCircle10);
        group.getChildren().add(cloudCircle11);
        group.getChildren().add(cloudCircle12);

        // Smoke 1 in the sky using circle
        Circle smokeCircle1 = new Circle(490,300,4,Color.BLACK);
        smokeCircle1.getStrokeLineCap();                  
        smokeCircle1.setStrokeWidth(3);
        smokeCircle1.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle1);
        
        // Smoke 2 in the sky using circle
        Circle smokeCircle2 = new Circle(500,280,4,Color.BLACK);
        smokeCircle2.getStrokeLineCap();                  
        smokeCircle2.setStrokeWidth(3);
        smokeCircle2.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle2);
        
        // Smoke 3 in the sky using circle
        Circle smokeCircle3 = new Circle(515,265,4,Color.BLACK);
        smokeCircle3.getStrokeLineCap();                  
        smokeCircle3.setStrokeWidth(3);
        smokeCircle3.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle3);
        
        // Smoke 4 in the sky using circle
        Circle smokeCircle4 = new Circle(530,245,4,Color.BLACK);
        smokeCircle4.getStrokeLineCap();                  
        smokeCircle4.setStrokeWidth(3);
        smokeCircle4.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle4);
        
        // Smoke 5 in the sky using circle
        Circle smokeCircle5 = new Circle(540,232,4,Color.BLACK);
        smokeCircle5.getStrokeLineCap();                  
        smokeCircle5.setStrokeWidth(3);
        smokeCircle5.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle5);

        // Smoke 6 in the sky using circle
        Circle smokeCircle6 = new Circle(555,220,4,Color.BLACK);
        smokeCircle6.getStrokeLineCap();                  
        smokeCircle6.setStrokeWidth(3);
        smokeCircle6.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle6);

        // Smoke 7 in the sky using circle
        Circle smokeCircle7= new Circle(570,208,4,Color.BLACK);
        smokeCircle7.getStrokeLineCap();                  
        smokeCircle7.setStrokeWidth(3);
        smokeCircle7.setStroke(Color.BLACK);
        group.getChildren().add(smokeCircle7);

        // Creating the Outer Window 1 for the house
        Rectangle outerWindowRectangle1 = new Rectangle(90,60);
        outerWindowRectangle1.setX(190); 
        outerWindowRectangle1.setY(430);                         
        outerWindowRectangle1.setFill(Color.BLACK);              
        group.getChildren().add(outerWindowRectangle1);
        
        // Creating the Inner window 1 for the house
        Rectangle innerWindowRectangle1 = new Rectangle(50,30);
        innerWindowRectangle1.setX(210); 
        innerWindowRectangle1.setY(445);                         
        innerWindowRectangle1.setFill(Color.WHITE);              
        group.getChildren().add(innerWindowRectangle1);


        // Creating the Outer Window 2 for the house
        Rectangle outerWindowRectangle2 = new Rectangle(90,60);
        outerWindowRectangle2.setX(390); 
        outerWindowRectangle2.setY(430);                         
        outerWindowRectangle2.setFill(Color.BLACK);              
        group.getChildren().add(outerWindowRectangle2);
        
        // Creating the Inner window 2 for the house
        Rectangle innerWindowRectangle2 = new Rectangle(50,30);
        innerWindowRectangle2.setX(410); 
        innerWindowRectangle2.setY(445);                         
        innerWindowRectangle2.setFill(Color.WHITE);              
        group.getChildren().add(innerWindowRectangle2);

        
        // Creating a scene and adding the group which has all the elements
        Scene scnMyScene = new Scene(group, 900, 700);

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
