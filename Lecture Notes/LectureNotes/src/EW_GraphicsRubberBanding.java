/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsRubberBanding
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-09
    Purpose:	The purpose of this program is to Create a JavaFX program to demonstrate how to 
                track and update mouse events.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-09	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class EW_GraphicsRubberBanding extends Application {

    private Line linCurrentLine;
    private Group grpMyGroup;
    private Random rndGenerator = new Random();
    private static Scene scnPointer;            // creating a static pointer to be used later

    /*
     * Create an empty scene and populates lines as the user clicks the mouse
     */
    public void start(Stage stgMyStage) {
        grpMyGroup = new Group();

        Scene scnMyScene = new Scene(grpMyGroup, 600, 300, Color.BLACK);

        scnMyScene.setOnMousePressed(this::processMousePress);
        scnMyScene.setOnMouseDragged(this::processMouseDrag);

        stgMyStage.setTitle("JavaFX Rubberbanding Lines");
        stgMyStage.setScene(scnMyScene);
        scnPointer = scnMyScene;            // create a pointer to the stgMyStage object for use later
        stgMyStage.show();
    }

    public void processMousePress(MouseEvent event) // adds a line while the mouse is pressed
    {
        linCurrentLine = new Line(event.getX(), event.getY(), event.getX(), event.getY());  // creates a 1-point line
        Color[] clrBrightColors = {Color.WHITE,Color.ALICEBLUE, Color.AQUA, Color.CORNSILK, // create an array of Color objects
            Color.CYAN, Color.DODGERBLUE, Color.FLORALWHITE, Color.FIREBRICK, Color.GREENYELLOW,
            Color.HOTPINK, Color.IVORY, Color.ORANGE, Color.LIGHTSALMON};
        int intWhichColor = rndGenerator.nextInt(0, clrBrightColors.length);  // pick a random color
        linCurrentLine.setStroke(clrBrightColors[intWhichColor]);
        linCurrentLine.setStrokeWidth(3);
        grpMyGroup.getChildren().add(linCurrentLine);               //adds the 3-wide 1-point line
        Stage stgActiveStage = (Stage) scnPointer.getWindow();      // create a reference to the ActiveStage
        stgActiveStage.setTitle("JavaFX Rubberbanding Lines - Current Color: (r:" +  // get current r,g,b valuse
            ((int)(clrBrightColors[intWhichColor].getRed() * 255)) + ", g:" + 
            ((int)(clrBrightColors[intWhichColor].getGreen() * 255)) + ", b:" +
            ((int)(clrBrightColors[intWhichColor].getGreen() * 255)) + ")");
    }

    /*
     * Updates the endpoints while the mouse is in drag mode making the rubberband effect.
     */
    public void processMouseDrag(MouseEvent event) {    // this event fires on every little mouse twitch
        linCurrentLine.setEndX(event.getX());
        linCurrentLine.setEndY(event.getY());
    }

    public static void main(String[] args) {
        launch(args);
    }
}