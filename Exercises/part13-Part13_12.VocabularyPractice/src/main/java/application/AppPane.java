/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.layout.BorderPane;

/**
 *
 * @author mwillard
 */
public class AppPane {
    public BorderPane pane;
    InputView input;
    PracticeView practice;
    ViewButtons buttons;
    //maybe port in the view guts to work with? Actually this makes a lot of sense.
    
    public AppPane(ViewButtons buttons, InputView input, PracticeView practice) {
        BorderPane pane = new BorderPane();
        this.pane = pane;
        this.input = input;
        this.practice = practice;
        this.buttons = buttons;
    }
    
    public void setInitialPane() {
        pane.setTop(buttons.buttonBox);
        pane.setCenter(input.inputView);
    }
    
    public void setInputView() {
       pane.setCenter(input.inputView);
    }
    
    public void setPracticeView() {
        pane.setCenter(practice.practiceView);
    }
}
