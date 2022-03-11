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
import java.util.ArrayList;

public class Airport {
    //private String id;
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    
    public Airport() {
        //this.id = id;
        planes = new ArrayList<>();
        flights = new ArrayList<>();
    }
    
    public void addPlane(Plane plane) {
        planes.add(plane);
    }
    
    public ArrayList<Plane> getPlanes() {
        return planes;
    }
    
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
