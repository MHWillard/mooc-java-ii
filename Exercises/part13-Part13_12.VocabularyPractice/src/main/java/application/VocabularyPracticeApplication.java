package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    /*
    two views
    1. enter words and translations into program
    2. randomly asked to translate words from list
    Word list: key/value pairs, words and translations: arraylist
    
    starts on enter new words view
    -both buttoms switch views but share text input
    
    view 1:
    Word + input; Translation + input; button to add word pair
    
    view 2: ask to translate word, input prompt, check button
    will say 'correct' if good and will give translation if wrong
    
    STEPS:
    create enter new word view
    create practice view
    make sure toggles work between views
    set up functionality for adding word pairs
    set up functionality for doing a translation practice
    
    OBJECTS:
    WordList (hashmap, list for pulling words)
    button logic
    button-factory
    label-factory
    layout-factory
    createView
    */
    
    @Override
    public void start(Stage window) {
        Dictionary dict = new Dictionary();
        
        ViewButtons viewButtons = new ViewButtons();
        InputView inputView = new InputView(dict);
        PracticeView practiceView = new PracticeView(dict);
        AppPane pane = new AppPane(viewButtons, inputView, practiceView);

        
        /*
        practiceMode.setOnAction((event)->{
            pane.setCenter(practiceView);
        });
        
        //turn the views into objects: what else can we turn into objects? Event Handlers? Push yourself for OOP design from the getgo
        addWordPair.setOnAction((event)-> {
            
        });
*/
        
        //addView.wordInput and translateInput?
        
        pane.setInitialPane();
        
        Scene scene = new Scene(pane.pane);
        
        window.setScene(scene);
        window.show();
    
    }


    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
