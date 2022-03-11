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
public class FlightID {
    //private String planeID;
    private String departureID;
    private String destinationID;
    
    public FlightID(String departureID, String destinationID) {
        //this.planeID = planeID;
        this.departureID = departureID;
        this.destinationID = destinationID;
    }
}
