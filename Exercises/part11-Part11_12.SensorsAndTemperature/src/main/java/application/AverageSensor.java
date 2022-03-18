/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author mwillard
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private boolean masterSwitch;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        masterSwitch = false;
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public boolean isOn() {
        return this.masterSwitch;
    } 
    
    public void setOn() {
        ArrayList<Sensor> filtered = this.sensors
                .stream()
                .filter(s -> s.isOn() == true)
                .collect(Collectors.toCollection(ArrayList::new));
        
        if (filtered.size() == sensors.size()) {
            this.masterSwitch = true;
        }
        
    }      // sets the sensor on
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
        
        masterSwitch = false;
    }
    public int read() {
        //map to each: take read method, all to total
        //then divide total by length
        int tempAvg = sensors.stream()
                .mapToInt(s -> Integer.valueOf(s.read()))
                .average();
    }        
// returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
    
}
