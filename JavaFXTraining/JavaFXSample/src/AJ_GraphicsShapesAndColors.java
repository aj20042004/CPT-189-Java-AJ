/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsShapesAndColors
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-05
    Purpose:	The purpose of this program is to demonstrate creating JavaFX basic shapes with colors

----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_GraphicsShapesAndColors extends Application{        // this has to be done for ALL graphics programs

    @Override                                               // this overrides the basic Application's own start method
    public void start(Stage stgMyStage) {                   // this is our own start method using our own stage
        Rectangle rectPlainRect = new Rectangle(200, 100);  // creates a new plain rectangle object 200 px by 100 px
        rectPlainRect.setX(50);                             // sets the rectangle's X location to 50 px
        rectPlainRect.setY(100);                            // sets the rectangle's Y location to 100 px
        rectPlainRect.setFill(Color.BLUE);               // sets the fill color to the Color class constant DARKRED
        Group grpMyGroup = new Group(rectPlainRect);        // this adds the objects to a new group object      
        Scene scnMyScene = new Scene(grpMyGroup, 400, 400); // this creates a 400x400 scene and loads it with the group
        stgMyStage.setScene(scnMyScene);                    // this sets the scene on the stage
        stgMyStage.setTitle("Basic Graphic Shapes and Colors");     // this sets the window title
                                      // this shows the stage
 
    
        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Move the rectange, change its color, and resize it.  Also change the stage color
        rectPlainRect.setFill(Color.rgb(255, 255, 150));        // change the rect color to rgb(255,255,150)
        rectPlainRect.setX(200);                            // set new X position
        rectPlainRect.setY(200);                            // set new Y position
        rectPlainRect.setScaleX(.5);                        // set the new size to 1/2
        rectPlainRect.setScaleY(.5);                        // set the new size to 1/2
        scnMyScene.setFill(Color.DARKGREEN);


        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Add a new rectangle, and a circle, and a line
        Rectangle rectLtGreen = new Rectangle(200, 100, Color.LIGHTGREEN);  // a new rect object
        rectLtGreen.setX(77);
        rectLtGreen.setY(200);
        rectLtGreen.setStyle("-fx-stroke-width: 3; -fx-stroke: black;");    // can use some CSS for styling
        grpMyGroup.getChildren().add(rectLtGreen);      // gets the collection of child nodes and adds the new node

        Circle cirMyCircle = new Circle(150, 150, 63, Color.LIGHTCORAL);    // create a circle at center x,y with radis r and color
        cirMyCircle.getStrokeDashArray().addAll(25.0,15.0);                   // create a dashed stroke
        cirMyCircle.setStrokeWidth(3);
        cirMyCircle.setStroke(Color.BROWN);
        grpMyGroup.getChildren().add(cirMyCircle);
        
        Line linMyLine = new Line(25,25,250,250);       
        linMyLine.setStrokeWidth(3.5);                 
        linMyLine.setStroke(Color.WHITE);
        grpMyGroup.getChildren().add(linMyLine);


        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Create a final Ellipse that has a random x, a random y, a random semi-transparent random color
        //  Also add some text
        Random rndMyGenerator = new Random();
        Ellipse eliMyEllipse = new Ellipse(200, 200, rndMyGenerator.nextDouble(200) + 10, 
                                            rndMyGenerator.nextDouble(200) + 10);
        eliMyEllipse.setFill(Color.rgb(rndMyGenerator.nextInt(255), // create random semi-transparent color
                            rndMyGenerator.nextInt(255), 
                            rndMyGenerator.nextInt(255), 0.5));
        grpMyGroup.getChildren().add(eliMyEllipse);
        Text txtMyGreeting = new Text(35,360,"Hello World in Java FX!");
        txtMyGreeting.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
        txtMyGreeting.setStroke(Color.YELLOW);
        grpMyGroup.getChildren().add(txtMyGreeting);
        stgMyStage.show();    
         
   
    }

    public static void main(String[] args) {
        launch(args);
    }
}
