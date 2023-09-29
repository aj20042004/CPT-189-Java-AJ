/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_GraphicsArcsImagesAndGUIs
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-06
    Purpose:	The purpose of this program is to create additional JavaFX items including arcs, images,
                and GUI elements.  This program will also introduce event handling like button clicks.  
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EW_GraphicsArcsImagesAndGUIs extends Application{

    public static boolean blnPicSwitch = true;  // create a global switch to determine which pic to show

    @Override
    public void start(Stage stgMyStage) {
        /*
         * This first part of the program will define a series of overlapping arcs to create a rainbow
         * It will also create a VBox container to hold the three gropus of things we are adding
         */

        
        Arc arcRedArc = new Arc(200, 100, 180, 90, 0, 180);  // x,y - center, x-radius, y-radius, start angle, end angle
        arcRedArc.setFill(Color.RED);
        Arc arcOrangeArc = new Arc(200, 100, 170, 80, 0, 180);
        arcOrangeArc.setFill(Color.ORANGE);
        Arc arcYellowArc = new Arc(200, 100, 160, 70, 0, 180);  
        arcYellowArc.setFill(Color.YELLOW);
        Arc arcGreenArc = new Arc(200, 100, 150, 60, 0, 180); 
        arcGreenArc.setFill(Color.GREEN);
        Arc arcBlueArc = new Arc(200, 100, 140, 50, 0, 180); 
        arcBlueArc.setFill(Color.BLUE);
        Arc arcBlueVioletArc = new Arc(200, 100, 130, 40, 0, 180); 
        arcBlueVioletArc.setFill(Color.BLUEVIOLET);
        Arc arcWhiteArc = new Arc(200, 100, 120, 30, 0, 180); 
        arcWhiteArc.setFill(Color.WHITE);
        Group grpMyGroup = new Group(arcRedArc, arcOrangeArc, arcYellowArc, arcGreenArc, arcBlueArc, 
                        arcBlueVioletArc, arcWhiteArc);         // add the arcs IN ORDER so they overlap each other properly
        VBox vboxParentConatiner = new VBox(grpMyGroup);        // A vertical box to hold our three groups
        vboxParentConatiner.setAlignment(Pos.CENTER);           // center it all
        Scene scnMyScene = new Scene(vboxParentConatiner, 600, 500); 
        stgMyStage.setScene(scnMyScene);                    
        stgMyStage.setTitle("JavaFX Arcs, Images, and GUIs");    
        stgMyStage.show();                                 


        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Create a HBox layout control object and populate it with two images and add it to the VBox
        HBox hboxImages = new HBox();                               // create empty horizontal box container
        Image imgMyLogo = new Image("./media/lion.jpg",true);  // must exist for both src and bin!
        ImageView imvMyLogo = new ImageView(imgMyLogo);             // image view is needed to view image objects
        imvMyLogo.setFitWidth(210);                                 // resize to fit 210 wide
        imvMyLogo.setFitHeight(200);                                // resize to fit 200 high
        Image imgMyFam = new Image("./media/tiger.jpg",true); 
        ImageView imvMyFam = new ImageView(imgMyFam);
        imvMyFam.setFitWidth(210);                                  // resize to fit 210 wide
        imvMyFam.setFitHeight(200);                                 // resize to fit 200 high
        hboxImages.getChildren().addAll(imvMyLogo, imvMyFam);
        hboxImages.setAlignment(Pos.CENTER);
        hboxImages.setMinHeight(220);
        vboxParentConatiner.getChildren().add(hboxImages);
      

        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Create a text label for instructions and a push button that the user can click
        //  Add an event handler for the OnClick event to switch the pictures
        //  Add these both to another HBox and add that group to the Vbox

        HBox hboxGUI = new HBox();
        Text txtInstructions = new Text("Click the button to switch the pictures --> ");
        Button btnSwitchPics = new Button("Switch Pictures");
        hboxGUI.setAlignment(Pos.CENTER);
        hboxGUI.setSpacing(10);
        hboxGUI.setMinHeight(50);
        hboxGUI.getChildren().addAll(txtInstructions,btnSwitchPics);
        vboxParentConatiner.getChildren().add(hboxGUI);
        btnSwitchPics.setOnAction(new EventHandler<ActionEvent>() {     // add an EventHandler object
            @Override public void handle(ActionEvent e){    // needs to have the default handle overridden
                if(blnPicSwitch){                // the switch is true so flip the images
                    imvMyFam.setImage(imgMyLogo);
                    imvMyLogo.setImage(imgMyFam);
                    blnPicSwitch = false;       // remember to switch the switch itself!
                } else {                        // the switch is false so flip them back
                    imvMyFam.setImage(imgMyFam);
                    imvMyLogo.setImage(imgMyLogo);
                    blnPicSwitch = true;      
                }
            }
        });


        //  This code is commented out now... when we uncomment it, it will further manipulate the window
        //  Create some radio buttons to change the color of a rectangle
        //  Add an event handler for the OnClick event to process the radio buttons
        //  Add these both to another HBox and add that group to the Vbox
        Rectangle rectColorBlock = new Rectangle(400,100,Color.WHITE);
        vboxParentConatiner.getChildren().add(rectColorBlock);      // add the rectangle into the vbox
        HBox hboxGUIRadio = new HBox();
        hboxGUIRadio.setAlignment(Pos.CENTER);
        hboxGUIRadio.setSpacing(10);
        ToggleGroup tglColors = new ToggleGroup();                  // create the group to hold the radios 
        RadioButton rbRed = new RadioButton("Red");            // create radiobuttons with their labels
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbViolet = new RadioButton("Violet");
        
        rbRed.setToggleGroup(tglColors);                            // add the radios into the group
        rbOrange.setToggleGroup(tglColors);
        rbYellow.setToggleGroup(tglColors);
        rbGreen.setToggleGroup(tglColors);
        rbBlue.setToggleGroup(tglColors);
        rbViolet.setToggleGroup(tglColors);
        hboxGUIRadio.getChildren().addAll(rbRed,rbOrange,rbYellow,rbGreen,rbBlue,rbViolet);
        vboxParentConatiner.getChildren().add(hboxGUIRadio);
        //  This next section sets the action handlers for the radio buttons
        rbRed.setOnAction(e->{  
                rectColorBlock.setFill(Color.RED);
            }); 
        rbOrange.setOnAction(e->{ 
                rectColorBlock.setFill(Color.ORANGE);
            }); 
        rbYellow.setOnAction(e->{ 
                rectColorBlock.setFill(Color.YELLOW);
            }); 
        rbGreen.setOnAction(e->{ 
                rectColorBlock.setFill(Color.GREEN);
            }); 
        rbBlue.setOnAction(e->{ 
                rectColorBlock.setFill(Color.BLUE);
            }); 
        rbViolet.setOnAction(e->{ 
                rectColorBlock.setFill(Color.VIOLET);
            }); 

    }

    

    public static void main(String[] args) {
        launch(args);
    }
}