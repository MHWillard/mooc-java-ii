/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.List;

/**
 *
 * @author mwillard
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    //private boolean masterSwitch;
    private List<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        //masterSwitch = false;
        readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public boolean isOn() {
        boolean isOn = false;

        for (Sensor s : sensors) {
            if (s.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }

        }
        return isOn;
    } 
    
    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }
        
        
    }      // sets the sensor on
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
        
    }
    
    public int read() {
        //map to each: take read method, all to total
        //then divide total by length
        
        if (isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException("Sensor must be on.");
        } else {
        double tempAvg = sensors.stream()
                .mapToInt(s -> Integer.valueOf(s.read()))
                .average()
                .getAsDouble();
        
        readings.add((int)tempAvg);
        return (int)tempAvg;
        }
    }
    
    public List<Integer> readings() {
        return readings;
    }
// returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
    
}
