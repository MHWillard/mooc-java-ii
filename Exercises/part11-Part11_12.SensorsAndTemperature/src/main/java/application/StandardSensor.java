/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author mwillard
 */
public class StandardSensor implements Sensor {
    private int temp;
    //private boolean turnedOn;
    
    public StandardSensor(int temp) {
        this.temp = temp;
        //this.turnedOn = true;
    }
    
    public boolean isOn() {
        //return turnedOn;
        return true;
    }    // returns true if the sensor is on
    public void setOn() {}      // sets the sensor on
    public void setOff() {}    // sets the sensor off
    public int read() {
        return temp;
    }       // returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
}
