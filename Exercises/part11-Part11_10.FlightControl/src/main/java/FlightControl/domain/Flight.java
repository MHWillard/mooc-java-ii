/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author mwillard
 */
import java.util.HashMap;

public class Flight {
    //The flight information consists of the used airplane, the departure airport id (e.g. HEL), and the destination airport ID (e.g. BAL).
    //private HashMap<Plane, FlightID> flight;
    
    //public Flight() {
        //flight = new HashMap<>();
    //}
    private Plane plane;
    private String departureID;
    private String destinationID;
    
    public Flight(Plane plane, String departureID, String destinationID) {
        //based on planeID; assign existing plane to it
        this.plane = plane;
        this.departureID = departureID;
        this.destinationID = destinationID;
    }
    
        @Override
    public String toString() {
        return this.plane + "(" + departureID + "-" + destinationID + ")";
    }
}
