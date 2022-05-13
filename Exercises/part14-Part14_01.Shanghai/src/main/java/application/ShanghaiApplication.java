package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class ShanghaiApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //vbox
        //title label
        //line chart: arm axes with titles and size
        //create lines for feeding into dataset
        //output: put into scene
        
        VBox box = new VBox();
        Label label = new Label("University of Helsinki, Shanghai ranking");
        
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> chart = new LineChart(xAxis, yAxis);
        chart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series data = new XYChart.Series();
        
        data.getData().add(new XYChart.Data(2007, 73));
        data.getData().add(new XYChart.Data(2008, 68));
        data.getData().add(new XYChart.Data(2009, 72));
        data.getData().add(new XYChart.Data(2010, 72));
        data.getData().add(new XYChart.Data(2011, 74));
        data.getData().add(new XYChart.Data(2012, 73));
        data.getData().add(new XYChart.Data(2013, 76));
        data.getData().add(new XYChart.Data(2014, 73));
        data.getData().add(new XYChart.Data(2015, 67));
        data.getData().add(new XYChart.Data(2016, 56));
        data.getData().add(new XYChart.Data(2017, 56));
        
        
        Scene scene = new Scene(chart,800,600);
        chart.getData().add(data);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
