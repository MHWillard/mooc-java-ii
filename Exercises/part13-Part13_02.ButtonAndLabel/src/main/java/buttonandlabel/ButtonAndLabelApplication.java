package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Button");
        Label label = new Label("text");
        
        FlowPane flow = new FlowPane();
        flow.getChildren().add(label);
        flow.getChildren().add(button);
        
        Scene view = new Scene(flow);
        
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
