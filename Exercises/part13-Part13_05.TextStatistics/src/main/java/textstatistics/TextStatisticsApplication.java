package textstatistics;

/*
Use the BorderPane class for the layout. In the center there should be a text field created using the TextArea class, and along the bottom edge
there should be three textComponents. Place the text components along the bottom edge into a HBox object.The first text component should have 
the text "Letters: 0", the second text component should have the text "Words: 0", and the third text component should have the text 
"The longest word is:".
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Label text1 = new Label("Letters: 0");
        Label text2 = new Label("Words: 0");
        Label text3 = new Label("The longest word is:");
        TextArea center = new TextArea("center");
        
        HBox box = new HBox(3);
        BorderPane pane = new BorderPane();
        
        box.getChildren().addAll(text1,text2,text3);
        pane.setCenter(center);
        pane.setBottom(box);
    
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
    
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
