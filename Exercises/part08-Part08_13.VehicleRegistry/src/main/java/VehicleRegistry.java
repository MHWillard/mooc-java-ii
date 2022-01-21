/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class VehicleRegistry {
    //probably arms a new HashMap
    private HashMap<LicensePlate, String> registry;
    
    //constructor: new HashMap
    public VehicleRegistry() {
        registry = new HashMap<LicensePlate, String>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        /*
        assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. 
        If the license plate doesn't have an owner, the method returns true. If the license already has an owner attached, 
        the method returns false and does nothing.
        */
        
        //check if licensePlate has owner
        //if so, return false
        //if not, add, then return true
        
        //registry.contains(licensePlate)
        
        if (this.registry.get(licensePlate) == null) {
            //add owner to it
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
        
    }
    
    public String get(LicensePlate licensePlate) {
        //returns the owner of the car corresponding to the license plate received as a parameter. 
        //If the car isn't in the registry, the method returns null.
        
        if (this.registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        //removes the license plate and attached data from the registry. The method returns true if removed successfully 
        //and false if the license plate wasn't in the registry.
        
        if (this.registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        //iterate through registry
        //for each item; print licenseplate
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        //arm alreadyPrinted list
        //iterate through registry
        //if owner not in printed list: print, then add name of owner into list
        
        ArrayList<String> printed = new ArrayList<>();
        
        for (String owner : this.registry.values()) {
            if (printed.contains(owner)) {}
            else {
                System.out.println(owner);
                printed.add(owner);
            }
        }
    
    //probably comparison override for equals and hashcodes
    }
    
}
