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
    private VBox inputView;
    private Dictionary dict;
    
    public InputView(Dictionary dict) {
        this.dict = dict;
        
        VBox vbox = new VBox();
        TextField wordInput = new TextField();
        TextField translateInput = new TextField();
        Button addWordPair = new Button("Add the word pair");
        vbox.getChildren().addAll(new Label("Word"),wordInput,new Label("Translation"),translateInput,addWordPair);
        
        //try/catch here to ensure a pair must be present to add
        addWordPair.setOnAction((event)->{
            //gettext from wordinput
            //get text from translate input
            //return the pair (then this will be fed into the object)
            String word = wordInput.getText();
            String translation = translateInput.getText();
            dict.addWordPair(word, translation);
        });
        
        inputView = vbox;
    }
    
    public VBox getView() {
        return inputView;
    }
    
    /*
    public void addWord(String word, String trnaslation) {}
    */
    
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
