/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.chart.XYChart;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author mwillard
 */
public class ChartData {
    //public File file;
    //public Scanner scanner;
    public XYChart.Series data;
    public HashMap<String, HashMap<Integer, Double>> values;
    
    
    //load file into read data
    //prepare data using this file
    //export to be used for charts
    
    public ChartData() {
        data = new XYChart.Series();
        values = new HashMap<>();
    }
    
    public void loadFile() {
        /*
        for each row:
            pull party as a string
                get the year column name: put into year
                get the value in the row: put into double support
                push this all into the map
        */
        
        Files.lines(Paths.get("partiesdata.tsv"))
            .map(row -> row.split("/t"))
            .map(parts -> System.out.println(parts[0]));
            //parts[0]] is probably the party? then get each row accordingly, row[0] is probably headers
        
        
    }
    
    public void readData() {
        try {
            File file = new File("partiesdata.tsv");
            Scanner scanner = new Scanner(file);
            //read each line of data
            //split each line
            //push into data
            while(scanner.hasNextLine()) {
                String grab = scanner.nextLine();
                //String[] pieces = grab.split("\t");
                //data.getData().add(new XYChart.Data(2007, 10));
                System.out.println(grab);
            }
            
            //read each line: create a dataset for each line
            //use column 0 for party name that equals dataset
            //get x colummn name, y value for that column along this stream
            //[party_dataset].getData().add(new XYChart.Data(x year, y value));
            //uise Java stream notes for this
            
            Files.lines(Paths.get("partiesdata.tsv"))
                    .map(row -> row.split("/t"))
                    .map(parts -> System.out.println(parts[0] + "," + parts[1]));
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
        }
    }
    
}
