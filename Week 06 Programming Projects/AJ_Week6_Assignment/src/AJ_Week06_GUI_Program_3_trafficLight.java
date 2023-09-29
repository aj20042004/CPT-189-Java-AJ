/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_GUI_Program_3_trafficLight
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to design a traffic light
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
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
    
    @Override
    public void start(Stage stgMyStage){

        VBox vboxParentContainer = new VBox(30);

        Rectangle rectangleBase = new Rectangle(80,175);
        rectangleBase.setX(300); 
        rectangleBase.setY(150);                         
        rectangleBase.setFill(Color.BLACK);
        Group grpTrafficLight = new Group(rectangleBase);

        Circle circleStop = new Circle(340,179,20,Color.rgb(255, 128, 128));
        circleStop.getStrokeLineCap();                  
        grpTrafficLight.getChildren().add(circleStop);

        Circle circleCaution = new Circle(340,230,20,Color.rgb(255, 255, 153));
        circleStop.getStrokeLineCap();                  
        grpTrafficLight.getChildren().add(circleCaution);

        Circle circleGo = new Circle(340,285,20,Color.rgb(144, 238, 144));
        circleGo.getStrokeLineCap();                  
        grpTrafficLight.getChildren().add(circleGo);

        vboxParentContainer.getChildren().addAll(grpTrafficLight);
        vboxParentContainer.setAlignment(Pos.CENTER);

        HBox hboxTrafficLightRadio = new HBox();
        hboxTrafficLightRadio.setAlignment(Pos.CENTER);
        hboxTrafficLightRadio.setSpacing(10);

        ToggleGroup tglLights = new ToggleGroup();             
        RadioButton rbRedLight = new RadioButton("STOP");            
        RadioButton rbYellowLight = new RadioButton("CAUTION");
        RadioButton rbGreenLight = new RadioButton("GO");

        rbRedLight.setToggleGroup(tglLights);
        rbYellowLight.setToggleGroup(tglLights);
        rbGreenLight.setToggleGroup(tglLights);

        rbRedLight.setOnAction( e-> {
            circleStop.setFill(Color.RED);
            Text txtTrafficLabel = new Text("STOP !");
            txtTrafficLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));
            vboxParentContainer.getChildren().add(txtTrafficLabel);
        });

        rbYellowLight.setOnAction( e-> {
            circleCaution.setFill(Color.YELLOW);
           // txtTrafficLabel.setText("CAUTION !");
        });

        rbGreenLight.setOnAction( e-> {
            circleGo.setFill(Color.GREEN);
          //  txtTrafficLabel.set
        });

        hboxTrafficLightRadio.getChildren().addAll(rbGreenLight,rbRedLight,rbYellowLight);
        vboxParentContainer.getChildren().addAll(hboxTrafficLightRadio);


        Scene scnMyScene = new Scene(vboxParentContainer, 700, 600);

        stgMyStage.setScene(scnMyScene);
        stgMyStage.setTitle("Traffic Light");
        stgMyStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
