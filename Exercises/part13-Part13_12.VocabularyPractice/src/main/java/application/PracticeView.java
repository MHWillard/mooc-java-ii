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
    private VBox practiceView;
    private Dictionary dict;
    
    public PracticeView(Dictionary dict) {
        this.dict = dict;
        
        VBox vbox = new VBox();
        TextField answerInput = new TextField();
        Button checkAnswer = new Button("Check");

        vbox.getChildren().addAll(new Label(this.createQuestion()),answerInput,checkAnswer);
        
        //feed keys into arraylist
        //or: get a random hashmap key
        //tran compare values for translation
        checkAnswer.setOnAction((event) -> {
            String guess = answerInput.getText();
            //int size = this.dict.dictionary.size();
            System.out.println("Checked");
        });
        
        
        practiceView = vbox;
    }
    
    public VBox getView() {
        return practiceView;
    }
    
    public String createQuestion() {
        String practiceText = "";
        
        if (!dict.keys.isEmpty()) {
            practiceText = "Translate the word: " + dict.getPracticeWord();
        } else {
            practiceText = "Add a word to the dictionary to translate.";
        }
        
        return practiceText;
    }
    
    //create practice view
    //check for button events then run get word and check translation
    
    /*

    */
    
}
