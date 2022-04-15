package notifier;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.VBox;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage stage) {
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        VBox box = new VBox();
        box.getChildren().addAll(text, button, label);
        
        Scene scene = new Scene(box);
        
        stage.setScene(scene);
        stage.show();
 
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        //System.out.println("Hello world!");
    }

}
