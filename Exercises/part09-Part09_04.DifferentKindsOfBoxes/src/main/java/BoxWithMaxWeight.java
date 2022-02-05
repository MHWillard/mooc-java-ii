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

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        //check to confirm item weight isn't over max capacity
        //if it's fine: add to the hashmap
        
        if (item.getWeight() <= capacity) {
            items.add(item);
            capacity -= item.getWeight();
            //current += item.getWeight();
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        //look for item in items hashmap
        //if found: return true
        //else: return false
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
