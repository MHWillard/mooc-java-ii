package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage stage) {
        //button then text field in that order
    Button button = new Button("Button");
    TextField text = new TextField("Text field");
    FlowPane flow = new FlowPane();
    
    flow.getChildren().add(button);
    flow.getChildren().add(text);
    
    Scene scene = new Scene(flow);
    
    stage.setScene(scene);
    stage.show();
    
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
