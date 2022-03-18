/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;
import FlightControl.logic.Controller;
import FlightControl.domain.*;

/**
 *
 * @author mwillard
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UI {
    //get scanner
    //set while loop
    public void createUI() {
        Scanner s = new Scanner(System.in);
        Controller c = new Controller();
        Airport airport = new Airport();
        
        boolean assetMenu = true;
        
        while (assetMenu) {
            String input = "";
            
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control ");
            System.out.print("> ");
            input = s.nextLine();
            
            switch(input) {
                case "1": 
                    System.out.print("Give the airplane id: ");
                    String planeID = s.nextLine();
                    System.out.print("Give the airplane capacity: ");
                    int capacity = s.nextInt();
                    
                    Plane newPlane = c.createAirplane(planeID, capacity);
                    airport.addPlane(newPlane);
                    break;
                case "2":
                        System.out.print("Give the airplane id: ");
                        String airplaneID = s.nextLine();
                        System.out.print("Give the departure airport id: ");
                        String departID = s.nextLine();
                        System.out.print("Give the target airport id: ");
                        String targetID = s.nextLine();
                    
                        ArrayList<Plane> planes = airport.getPlanes();
                        Flight newFlight = c.createFlight(planes, airplaneID, departID, targetID);
                        airport.addFlight(newFlight);
                    break;
                case "x":
                    assetMenu = false;
                    break;
            }
        }
        
        boolean flightMenu = true;
        
        while (flightMenu) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit ");
            System.out.print("> ");
            String input = s.nextLine();
            
            switch(input) {
                case "1": 
                    c.printPlanes(airport.getPlanes());
                    break;
                case "2":
                    c.printFlights(airport.getFlights());
                    break;
                case "3":
                    System.out.print("Give the airplane id:");
                    String inputID = s.nextLine();
                    c.printDetails(inputID, airport.getPlanes());
                    break;
                case "x":
                    flightMenu = false;
                    break;
            }
        }
    }
}
