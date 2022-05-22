package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class SavingsCalculatorApplication extends Application {
    

    
    @Override
    public void start(Stage stage) {
        
            /*
    In this exercise you will implement a program for calculating and displaying the sum in a savings account. User can give the calculator
    a sum to save each month and the yearly interest rate, and the calculator will display how the savings will increase over 30 years.
    
    BorderPane
    -middle: the linechart with two NumberAxis
    -top: VBox with two BorderPanes: top is slider, bottom is also slider (use the Slider class)
    
    */
    BorderPane mainPane = new BorderPane();
    BorderPane savingsSliderPane = new BorderPane();
    BorderPane interestSliderPane = new BorderPane();
    VBox sliderBox = new VBox();
    
    NumberAxis xAxis = new NumberAxis();
    NumberAxis yAxis = new NumberAxis();
    LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
    
    //savings Slider: minimum is 25, max is 250; defailt 25
    Slider savingsSlider = new Slider(25, 250, 25);
    savingsSlider.setShowTickMarks(true);
    savingsSlider.setShowTickLabels(true);
    savingsSlider.setMajorTickUnit(25);
    savingsSlider.setMinorTickCount(5);
    savingsSlider.setSnapToTicks(true);
   
    
    Slider interestSlider = new Slider(0, 10, 0);
    interestSlider.setShowTickMarks(true);
    interestSlider.setShowTickLabels(true);
    interestSlider.setMajorTickUnit(1);
    //interestSlider.setMinorTickCount(3);
    interestSlider.setSnapToTicks(true);
    //interest slider: 0-10
    
    Label savingsLabel = new Label("Monthly savings");
    Label interestLabel = new Label("Yearly interest rate");
    Label currentSavings = new Label(Double.toString(savingsSlider.getValue()));
    Label currentInterest = new Label(Double.toString(interestSlider.getValue()));
    
    /*
    WHEN SLIDER IS MANIPULATED:
    
    catch event
    catch current value
    change currentInterest label = value (held as object property)
    */
    
        //add changelistener
    //https://docs.oracle.com/javafx/2/ui_controls/slider.htm
    savingsSlider.valueProperty().addListener(new ChangeListener<Number>() {
        public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
            //currentSavings.setText(new_val.toString());
            currentSavings.setText(String.format("%.2f",new_val));
        }
    });
    
    interestSlider.valueProperty().addListener(new ChangeListener<Number>() {
        public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
            currentInterest.setText(String.format("%.2f",new_val));
        }
    });
    
    savingsSliderPane.setLeft(savingsLabel);
    savingsSliderPane.setCenter(savingsSlider);
    savingsSliderPane.setRight(currentSavings);
    
    interestSliderPane.setLeft(interestLabel);
    interestSliderPane.setCenter(interestSlider);
    interestSliderPane.setRight(currentInterest);
    
    sliderBox.getChildren().addAll(savingsSliderPane, interestSliderPane);
    
    mainPane.setTop(sliderBox);
    mainPane.setCenter(chart);
    
    Scene scene = new Scene(mainPane);
    stage.setScene(scene);
    stage.show();
        
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

}
