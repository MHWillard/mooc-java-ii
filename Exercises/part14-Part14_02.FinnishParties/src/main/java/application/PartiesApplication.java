package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class PartiesApplication extends Application {
    //x axis: 1960-2010
    //y axis: 30 points max
    //data object: load in csv file, read each line, and split: object
    
    @Override
    public void start(Stage stage) {
        //VBox box = new VBox();
        //Label label = new Label("University of Helsinki, Shanghai ranking");
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 2);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        //xAxis.setLabel("Year");
        //yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> chart = new LineChart(xAxis, yAxis);
        chart.setTitle("Relative support of the parties");
        
        //XYChart.Series data = new XYChart.Series();
        ChartData graph = new ChartData();
        
        graph.data.getData().add(new XYChart.Data(2007, 10));
        graph.data.getData().add(new XYChart.Data(2008, 15));
        graph.data.getData().add(new XYChart.Data(2009, 20));
        
        graph.readData();
        
        
        Scene scene = new Scene(chart,800,600);
        chart.getData().add(graph.data);
        
        stage.setScene(scene);
        stage.show();    
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
