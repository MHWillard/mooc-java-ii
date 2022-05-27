/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.chart.XYChart;

/**
 *
 * @author mwillard
 */
public class Data {
    //savingSeries
    //interestSeries
    XYChart.Series savingSeries;
    XYChart.Series interestSeries;
    
    //constructor: create initial savings chart
    public Data() {
        savingSeries = new XYChart.Series();
        interestSeries = new XYChart.Series();
        //create initial savings chart
    }
    
    public void updateSavings(int savings, double interest, double savingSliderValue) {
        
            savingSeries.getData().clear();
            interestSeries.getData().clear();
            
            for (int i = 0; i <= 30; i++) {
                int timeSavings = savings * (i*12);
                double timeInterest = savingSliderValue * interest * (i*12);
                
                interestSeries.getData().add(new XYChart.Data(i, timeInterest));
                savingSeries.getData().add(new XYChart.Data(i, timeSavings));
            }   
    }
    
    public void updateInterest(double interest, double savingSliderValue) {
        
            interestSeries.getData().clear();
            
            for (int i = 0; i <= 30; i++) {
                double timeInterest = savingSliderValue * interest * (i*12);
                interestSeries.getData().add(new XYChart.Data(i, timeInterest));
            }
    }
    
    //recalculateSavings
    //recalculateInterest
    
}
