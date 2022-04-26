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
public class InputView {
    public VBox inputView;
    
    public InputView() {
        VBox vbox = new VBox();
        TextField wordInput = new TextField();
        TextField translateInput = new TextField();
        Button addWordPair = new Button("Add the word pair");
        vbox.getChildren().addAll(new Label("Word"),wordInput,new Label("Translation"),translateInput,addWordPair);
        
        inputView = vbox;
    }
    
    //create add view
    //check for button events then run add word
    
    /*
            VBox vbox = new VBox();
        TextField wordInput = new TextField();
        TextField translateInput = new TextField();
        Button addWordPair = new Button("Add the word pair");
        vbox.getChildren().addAll(new Label("Word"),wordInput,new Label("Translation"),translateInput,addWordPair);
        
        return vbox;
    */
}
