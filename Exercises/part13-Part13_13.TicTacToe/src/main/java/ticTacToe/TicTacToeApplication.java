package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application {    
    private Turn turn;
    private String turnLabel;

    @Override
    public void start(Stage window) {
        this.turn = new Turn();
        this.turnLabel = this.turn.getTurn();
        
        BorderPane pane = new BorderPane();
        GridPane grid = new GridPane(); //tryGridBuilder object here for fun
        Label status = new Label("Turn: " + this.turnLabel);
        status.setFont(Font.font("Monospaced", 40));
        
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=2; j++) {
                Button gridButton = new Button("");
                gridButton.setMinSize(100,100);
                gridButton.setFont(Font.font("Monospaced", 40));
                
                gridButton.setOnAction((event) -> {
                    if (gridButton.getText().isEmpty()) {
                    //make buttons way bigger
                        gridButton.setText(this.turn.getTurn());
                        this.turn.changeTurn();
                        this.turnLabel = this.turn.getTurn();
                        status.setText("Turn: " + this.turnLabel);
                    }
                    //set text to current turn if button text is emptyddsd
                });
                
                grid.add(gridButton, i, j);
                
                
            }
        }
        
        pane.setTop(status);
        pane.setCenter(grid);

        Scene scene = new Scene(pane);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
