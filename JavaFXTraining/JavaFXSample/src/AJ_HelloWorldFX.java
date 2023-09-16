/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_HelloWorldFX
    Author:		AJ
    Language:	Java
    Date:		2023-09-14
    Purpose:	The purpose of this program is to print Hello World in GUI app using JavaFX
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-14	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;

public class AJ_HelloWorldFX extends Application {

    public void start(Stage appStage) {

        Text txtHelloWorld = new Text(50, 50, "Hello World");
        Group grpMyGroup = new Group(txtHelloWorld);
        Scene scnMyScene = new Scene(grpMyGroup,400,400);
        appStage.setScene(scnMyScene);
        appStage.setTitle("Hello World in FX By AJ");
        appStage.show(); 

    }

    public static void main(String[] args) {
        
        launch(args);
    }


}