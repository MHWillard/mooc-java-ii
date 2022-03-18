/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.*;

/**
 *
 * @author mwillard
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Controller {
    private Scanner s;
    
    public Controller() {
        s = new Scanner(System.in);
    }
    
    public Plane createAirplane(String planeID, int capacity) {
        Plane newPlane = new Plane(planeID, capacity);
        return newPlane;
    }
    
    public Flight createFlight(ArrayList<Plane> planes, String airplaneID, String departID, String targetID) {              
        Plane flightPlane = planes.stream()
                .filter(p -> airplaneID.equals(p.getID()))
                .findAny()
                .orElse(null);
        
        Flight newFlight = new Flight(flightPlane, departID, targetID);
        return newFlight;
    }
    
    public void printPlanes(ArrayList<Plane> planes) {
        //for Plane p in planes: system print planeID + capacity (toString)
        for (Plane p : planes) {
            System.out.println(p);
        }
    }
    
    public void printFlights(ArrayList<Flight> flights) {
        //for Flight f in flights: system print plane ddetails, capacity, then joined dest and target airport id
        for (Flight f : flights) {
            System.out.println(f);
        }
    }
    
    public void printDetails(String planeID, ArrayList<Plane> planes) {
        //ask for plane id: if present, print details (toString)
        for (Plane p : planes) {
            if (p.getID().equals(planeID)) {
                System.out.println(p);
            }
        }
    }
}
