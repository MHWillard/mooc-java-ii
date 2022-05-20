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
    Slider interestSlider = new Slider(0, 10, 0);
    //interest slider: 0-10
    
    savingsSliderPane.setLeft(new Label("Monthly savings"));
    savingsSliderPane.setCenter(savingsSlider);
    //savingsSliderPane.setRight();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
