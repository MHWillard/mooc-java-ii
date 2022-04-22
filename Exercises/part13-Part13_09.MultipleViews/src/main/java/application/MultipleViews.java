package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage stage) {
        Label label1 = new Label("First view!");
        Label label2 = new Label("Second view!");
        Label label3 = new Label("Third view!");
        
        Button button1 = new Button("To the second view!");
        Button button2 = new Button("To the third view!");
        Button button3 = new Button("To the first view!");
        
        BorderPane pane = new BorderPane();
        VBox box = new VBox();
        GridPane grid = new GridPane();
        
        //add buttons and labels to each layout thing
        //then add to scenes
        
        pane.setTop(label1);
        pane.setCenter(button1);
        box.getChildren().addAll(button2,label2);
        grid.add(label3, 0, 0);
        grid.add(button3, 1, 1);
                
        
        Scene view1 = new Scene(pane);
        Scene view2 = new Scene(box);
        Scene view3 = new Scene(grid);
        
        //scenes
        //event listener for buttons
        button1.setOnAction((event)->{
            stage.setScene(view2);
        });
        
        button2.setOnAction((event)->{
            stage.setScene(view3);
        });
                
        button3.setOnAction((event)->{
            stage.setScene(view1);
        });
        
        stage.setScene(view1);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
