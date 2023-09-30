/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_GUI_Program_3_trafficLight
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to design a JavaFX application that displays the 
                drawing of a traffic light. We are going to allow the user to select the state of 
                the traffic light (Stop, Caution, or Go) from a set of radio buttons.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week06_GUI_Program_3_trafficLight extends Application {
    
    // Private variables
    private Text txtTrafficLabel;
    
    // Start method
    @Override
    public void start(Stage stgMyStage){
        
        // Creating a VBox
        VBox vboxParentContainer = new VBox(30);

        // Creating a Text Node to display the text "Traffic Light"
        txtTrafficLabel = new Text("Traffic Light !");
        txtTrafficLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));
        vboxParentContainer.getChildren().add(txtTrafficLabel);

        // Creating a Rectangle for the Traffic Signal
        Rectangle rectangleBase = new Rectangle(80,175);
        rectangleBase.setX(300); 
        rectangleBase.setY(150);                         
        rectangleBase.setFill(Color.BLACK);
        Group grpTrafficLight = new Group(rectangleBase);
        
        // Creating a Red Circle for "Stop"
        Circle circleStop = new Circle(340,179,20,Color.rgb(255, 128, 128));                  
        grpTrafficLight.getChildren().add(circleStop);
        
        // Creating a Yellow Circle for "Caution"
        Circle circleCaution = new Circle(340,230,20,Color.rgb(255, 255, 153));                  
        grpTrafficLight.getChildren().add(circleCaution);
        
        // Creating a Green Circle for "Go"
        Circle circleGo = new Circle(340,285,20,Color.rgb(144, 238, 144));                  
        grpTrafficLight.getChildren().add(circleGo);
        
        // Adding the group to vboxParentContainer and aligning it to center
        vboxParentContainer.getChildren().addAll(grpTrafficLight);
        vboxParentContainer.setAlignment(Pos.CENTER);
        
        // Creating the HBox
        HBox hboxTrafficLightRadio = new HBox();
        hboxTrafficLightRadio.setAlignment(Pos.CENTER);
        hboxTrafficLightRadio.setSpacing(16);
        
        // Creating the ToggleGroup for lights 
        ToggleGroup tglLights = new ToggleGroup(); 
        
        // Creating a RadioButton for STOP
        RadioButton rbRedLight = new RadioButton("STOP");
        rbRedLight.setFont(Font.font("System",FontWeight.BOLD,14));            
        
        // Creating a RadioButton for CAUTION
        RadioButton rbYellowLight = new RadioButton("CAUTION");
        rbYellowLight.setFont(Font.font("System",FontWeight.BOLD,14));            
        
        // Creating a RadioButton for GO
        RadioButton rbGreenLight = new RadioButton("GO");
        rbGreenLight.setFont(Font.font("System",FontWeight.BOLD,14));            

        // Setting all the lights to the ToggleGroup
        rbRedLight.setToggleGroup(tglLights);
        rbYellowLight.setToggleGroup(tglLights);
        rbGreenLight.setToggleGroup(tglLights);
        
        // Changing the STOP light color when user clicks the radio button
        rbRedLight.setOnAction( e-> {
            circleStop.setFill(Color.RED);
            circleCaution.setFill(Color.rgb(255, 255, 153));
            circleGo.setFill(Color.rgb(144, 238, 144));
            txtTrafficLabel.setText("STOP !");

        });
        
        // Changing the CAUTION light color when user clicks the radio button
        rbYellowLight.setOnAction( e-> {
            circleStop.setFill(Color.rgb(255, 128, 128));
            circleCaution.setFill(Color.YELLOW);
            circleGo.setFill(Color.rgb(144, 238, 144));
            txtTrafficLabel.setText("CAUTION !");
  
        });
        
        // Changing the GO light color when user clicks the radio button
        rbGreenLight.setOnAction( e-> {
            circleStop.setFill(Color.rgb(255, 128, 128));
            circleCaution.setFill(Color.rgb(255, 255, 153));
            circleGo.setFill(Color.GREEN);
            txtTrafficLabel.setText("GO !");
        });
        
        // Adding the elements to the HBox and VBox
        hboxTrafficLightRadio.getChildren().addAll(rbGreenLight,rbRedLight,rbYellowLight);
        vboxParentContainer.getChildren().addAll(hboxTrafficLightRadio);

        // Creating and setting the Scene
        Scene scnMyScene = new Scene(vboxParentContainer, 700, 600);
        stgMyStage.setScene(scnMyScene);

        // Setting the title for the application
        stgMyStage.setTitle("Traffic Light");
        stgMyStage.show();
    }

    // Main Method
    public static void main(String[] args) {
        launch(args);
    }
    
}
