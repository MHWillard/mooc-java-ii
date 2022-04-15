package textstatistics;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author mwillard
 */
public class TextStatisticsApplication extends Application {
    
    /**
     *
     * @param stage
     */
    @Override
    public void start(Stage stage) {
        int letterCount = 0;
        
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        TextArea input = new TextArea("");
        
        HBox box = new HBox(3);
        BorderPane pane = new BorderPane();
        
        input.textProperty().addListener((change, oldValue, newValue) -> {
            letters.setText("Letters: " + newValue.length());
            //letterCount = updateLetters(newValue);
            String[] parts = newValue.split(" ");
            words.setText("Words: " + parts.length);
            
            /*
            stream:
            set length of word = 0
            for each part: if part.length >= wordLength
                set longestWord to that word
                update wordLength number
            then return longestWord
            
            String longestWord = parts.stream()
                .forEach(p -> 
            
            */
        });
        
        box.getChildren().addAll(letters,words,longest);
        pane.setCenter(input);
        pane.setBottom(box);
    
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
    
    }
    
    /**
     *
     * @param newValue
     */
    public int updateLetters(String newValue) {
        //grab current value: newvalue?
        //count letters
        //generate int
        //return int to append to string label
        int length = newValue.length();
        return length;
        
    }
    
    public void updateLongestWord(String p, int longestWordLength) {
        if (p.length() > longestWordLength) {
            
        }
    }
    
    /*
    Event handlers:
    -count letters in text area and update text 1
    -count words (get whole string, count number of spaces, if textarea !isEmpty, words +1
    -longest word: as it types, split text up into parts based on spaces; iterate through each, 
    then capture word that is longest and push to text3
    
    input.onChange((input, oldValue, newValue) -> {
        updateLetters();
        updateWords();
        updateLongest();
    });
    */
    
    /*
    public void updateLetters() {
        //grab current value
        //count letters
        //generate int
        //return int to append to string label
    }
    
    
    */

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
