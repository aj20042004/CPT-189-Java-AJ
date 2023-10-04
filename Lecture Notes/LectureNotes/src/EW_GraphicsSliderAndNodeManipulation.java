/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsSliderAndNodeManipulation
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-06
    Purpose:	The purpose of this program is to create a JavaFX graphics slider and use them to 
                manipulate other nodes.  
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EW_GraphicsSliderAndNodeManipulation extends Application{

    @Override
    public void start(Stage stMyStage) {
        Slider sldRSlider = new Slider(0, 255, 0);  // the Red color value to be used
        Slider sldGSlider = new Slider(0, 255, 0);  // the Green color value to be used
        Slider sldBSlider = new Slider(0, 255, 0);  // the Blue color value to be used
        Rectangle rectMyRect = new Rectangle(10, 100, 150, 100);
        rectMyRect.setFill(Color.rgb(sldRSlider.valueProperty().intValue(), 
                                        sldGSlider.valueProperty().intValue(),
                                        sldBSlider.valueProperty().intValue()));
        VBox vbxContainer = new VBox(rectMyRect);
        vbxContainer.setAlignment(Pos.CENTER);

        sldRSlider.setMaxWidth(100);
        sldRSlider.setMajorTickUnit(255);
        sldRSlider.setShowTickLabels(true);
        sldRSlider.setShowTickMarks(true);
        sldGSlider.setMaxWidth(100);
        sldGSlider.setMajorTickUnit(255);
        sldGSlider.setShowTickLabels(true);
        sldGSlider.setShowTickMarks(true);
        sldBSlider.setMaxWidth(100);
        sldBSlider.setMajorTickUnit(255);
        sldBSlider.setShowTickLabels(true);
        sldBSlider.setShowTickMarks(true);
        Label lblR = new Label("  Red: ");
        Label lblG = new Label("  Green: ");
        Label lblB = new Label("  Blue: ");
        sldRSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    Color clrCurrentColor = (Color) rectMyRect.getFill(); // force a paint object to conver to a color object
                    int intCurrentG = (int) (clrCurrentColor.getGreen() * 255);
                    int intCurrentB = (int) (clrCurrentColor.getBlue() * 255);
                    rectMyRect.setFill(Color.rgb((int)sldRSlider.getValue(), intCurrentG, intCurrentB)); // getValue is double
            }
        });
        
        sldGSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    Color clrCurrentColor = (Color) rectMyRect.getFill(); // force a paint object to conver to a color object
                    int intCurrentR = (int) (clrCurrentColor.getRed() * 255);
                    int intCurrentB = (int) (clrCurrentColor.getBlue() * 255);
                    rectMyRect.setFill(Color.rgb(intCurrentR, (int)sldGSlider.getValue(), intCurrentB)); 
            }
        });
        
        sldBSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    Color clrCurrentColor = (Color) rectMyRect.getFill(); // force a paint object to conver to a color object
                    int intCurrentR = (int) (clrCurrentColor.getRed() * 255);
                    int intCurrentG = (int) (clrCurrentColor.getGreen() * 255);
                    rectMyRect.setFill(Color.rgb(intCurrentR, intCurrentG, (int)sldBSlider.getValue() )); 
            }
        });

        HBox hbxSliders = new HBox(lblR, sldRSlider, lblG, sldGSlider, lblB, sldBSlider);
        hbxSliders.setSpacing(5);
        hbxSliders.setMinHeight(100);
        hbxSliders.setAlignment(Pos.BOTTOM_CENTER);
        vbxContainer.getChildren().add(hbxSliders);

        Label lblRotator = new Label("Rotation Angle: ");
        Slider sldRotater = new Slider(0, 360, 0);  // the rotation angle to use
        sldRotater.setMaxWidth(250);
        sldRotater.setMajorTickUnit(40);
        sldRotater.setShowTickLabels(true);
        sldRotater.setShowTickMarks(true);
        sldRotater.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    rectMyRect.setRotate(sldRotater.getValue());
            }
        });


        HBox hbxRotater = new HBox(lblRotator, sldRotater);
        hbxRotater.setSpacing(5);
        hbxRotater.setMinHeight(100);
        hbxRotater.setAlignment(Pos.BOTTOM_CENTER);
        vbxContainer.getChildren().add(hbxRotater);

        Scene scnMyScene = new Scene(vbxContainer, 500, 500);
        stMyStage.setTitle("JavaFX Sliders and Manipulations");
        stMyStage.setScene(scnMyScene);
        stMyStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }    
}