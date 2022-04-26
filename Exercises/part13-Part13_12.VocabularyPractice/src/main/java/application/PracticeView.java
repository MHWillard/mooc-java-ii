/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author mwillard
 */
public class PracticeView {
    public VBox practiceView;
    
    public PracticeView() {
        VBox vbox = new VBox();
        TextField answerInput = new TextField();
        Button checkAnswer = new Button("Check");
        vbox.getChildren().addAll(new Label("Translate the word [XXX]"),answerInput,checkAnswer);
        
        practiceView = vbox;
    }
    
    //create practice view
    //check for button events then run get word and check translation
    
    /*

    */
    
}
