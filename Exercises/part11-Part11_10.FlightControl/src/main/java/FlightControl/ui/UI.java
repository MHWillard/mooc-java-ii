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
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control\n> ");
            String input = s.nextLine();
            
            switch(input) {
                case "1": 
                    Plane newPlane = c.createAirplane();
                    airport.addPlane(newPlane);
                    break;
                case "2":
                    ArrayList<Plane> planes = airport.getPlanes();
                    Flight newFlight = c.createFlight(planes);
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
            System.out.println("[x] Quit\n> ");
            String input = s.nextLine();
            
            switch(input) {
                case "1": 
                    
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "x":
                    flightMenu = false;
                    break;
            }
        }
    }
}
