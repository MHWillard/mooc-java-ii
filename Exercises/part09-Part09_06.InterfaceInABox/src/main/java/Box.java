/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.ArrayList;

public class Box implements Packable {
    //probably an arraylist that takes packable
    private ArrayList<Packable> packables;
    private double capacity;
    //public double weight;
    
    public Box(double capacity) {
        //double doubleCapacity = capacity * 1.0;
        this.capacity = capacity;
        packables = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        //check against capacity
        
        //get current weight
        //check: current weight + packable weight
        //if less than or equal to capacity, add it
        
        double currentWeight = this.weight();
        
        if (currentWeight + packable.weight() <= capacity) {
            packables.add(packable);
        }  
    }
    
    public double weight() {
        //return weight;
        double weight = 0;
        //for each packable item: return weight, check against capacity, add
        for (Packable item : packables) {
            weight += item.weight();
        }
        return weight;
        
    }
    
    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + this.weight() + " kg";
    }
}
