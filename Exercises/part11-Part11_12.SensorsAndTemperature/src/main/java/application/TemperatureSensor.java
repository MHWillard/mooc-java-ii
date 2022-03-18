/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;

/**
 *
 * @author mwillard
 */
public class TemperatureSensor implements Sensor {
    //private int temp;
    private boolean turnedOn;
    
    public TemperatureSensor () {
        this.turnedOn = false;
    }
    
    public boolean isOn() {
        return turnedOn;
    }    // returns true if the sensor is on
    public void setOn() {
        this.turnedOn = true;
    }      // sets the sensor on
    public void setOff() {
        this.turnedOn = false;
    }    // sets the sensor off
    public int read() {
        if (turnedOn = false) {
            throw new IllegalArgumentException("Sensor must be on.");
        } else {
            int temp = new Random().nextInt(61);
            return temp - 30;
        }
        
        //return temp;
    }       
// returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
}
