/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author mwillard
 */
public class AppPane {
    public BorderPane pane;
    InputView input;
    PracticeView practice;
    HBox buttons;
    //maybe port in the view guts to work with? Actually this makes a lot of sense.
    
    public AppPane(ViewButtons buttons, InputView input, PracticeView practice) {
        BorderPane pane = new BorderPane();
        this.pane = pane;
        this.input = input;
        this.practice = practice;
        
        HBox viewButtons = new HBox();
        Button wordMode = new Button("Enter new words");
        Button practiceMode = new Button("Practice");
        
        viewButtons.getChildren().addAll(wordMode, practiceMode);
        
        wordMode.setOnAction((event)->{
            setInputView();
        });
        
        practiceMode.setOnAction((event)->{
            setPracticeView();
        });
        
        this.buttons = viewButtons;
    }
    
    public void setInitialPane() {
        pane.setTop(buttons);
        pane.setCenter(input.getView());
    }
    
    public void setInputView() {
       pane.setCenter(input.getView());
    }
    
    public void setPracticeView() {
        pane.setCenter(practice.getView());
    }
}
