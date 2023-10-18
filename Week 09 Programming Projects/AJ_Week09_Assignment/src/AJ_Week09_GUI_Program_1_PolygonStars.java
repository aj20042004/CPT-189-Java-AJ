
/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week09_GUI_Program_1_PolygonStars
    Author:		AJ
    Language:	Java
    Date:		2023-10-17
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-17	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class AJ_Week09_GUI_Program_1_PolygonStars extends Application {

    @Override
    public void start(Stage appStage) throws Exception {

        Pane pane = new Pane();

        Star star1 = new Star(Color.RED, 100, 120, 0.9);
        Star star2 = new Star(Color.ORANGE, 550, 60, 1.2);
        Star star3 = new Star(Color.GREEN, 120, 400, 1.7);
        Star star4 = new Star(Color.YELLOW, 700, 350, 2.7);
        Star star5 = new Star(Color.BLUE, 350, 200, 0.5);

        pane.getChildren().addAll(star1, star2, star3, star4, star5);

        Scene scene = new Scene(pane, 1100, 700);
        appStage.setScene(scene);
        appStage.setTitle("Star Polygon");
        appStage.show();

    }

    class Star extends Polygon {
        Star(Color color, double x, double y, double scale) {
            getPoints().addAll(

                    100.0, 10.0,
                    40.0, 180.0,
                    190.0, 60.0, 
                    10.0, 60.0, 
                    160.0, 180.0 

            );
            setFill(color);
            setScaleX(scale);
            setScaleY(scale);
            setTranslateX(x);
            setTranslateY(y);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
