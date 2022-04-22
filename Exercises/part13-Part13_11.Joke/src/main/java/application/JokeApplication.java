package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage stage) {
        
        //three buttons: Joke, Answer, Explanation
        //row one: buttons
        //row 2: text labels for each button
        //click button to change label
        //StackPAne for top for buttons
        //overall layout: HBox
        //events cause flipping the labels
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explain = new Button("Explanation");
        
        StackPane jokePane = createPane("What do you call a bear with no teeth?");
        StackPane answerPane = createPane("A gummy bear.");
        StackPane explainPane = createPane("A bear with no teeth has only gums, thus, a gummy bear.");

        HBox buttonBox = new HBox();
        BorderPane pane = new BorderPane();
        
        buttonBox.getChildren().addAll(joke, answer, explain);
        pane.setTop(buttonBox);
        pane.setCenter(answerPane);
        
        joke.setOnAction((event) -> {
           
           pane.setCenter(jokePane); 
        });
        
        answer.setOnAction((event) -> {
           pane.setCenter(answerPane);
        });
        
        explain.setOnAction((event) -> {
           pane.setCenter(explainPane);
        });
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    public StackPane createPane(String text) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Label(text));
        
        return pane;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
