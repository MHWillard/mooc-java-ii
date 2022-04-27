/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author mwillard
 */
public class ViewButtons {
    public HBox buttonBox;
    
    public ViewButtons() {
        HBox viewButtons = new HBox();
        Button wordMode = new Button("Enter new words");
        Button practiceMode = new Button("Practice");
        
        viewButtons.getChildren().addAll(wordMode, practiceMode);
        
        buttonBox = viewButtons;
    }
    
    /*
    wordMode.setOnAction((event)->{
            pane.setCenter(addView);
        });
    
    switchWordMode() {
        
    }
    */
    
    
    
    /*
    public void setAddView(BorderPane pane) {
        pane.setCenter(addView);
    }
    */
    
    //set addView button event
    
    //set practiceView button event
    
}

/*
        HBox viewButtons = new HBox();
        VBox addView = createAddView();
        VBox practiceView = createPracticeView();
        Button wordMode = new Button("Enter new words");
        Button practiceMode = new Button("Practice");
        
        viewButtons.getChildren().addAll(wordMode, practiceMode);
        
        wordMode.setOnAction((event)->{
            pane.setCenter(addView);
        });
        
        practiceMode.setOnAction((event)->{
            pane.setCenter(practiceView);
        });
*/