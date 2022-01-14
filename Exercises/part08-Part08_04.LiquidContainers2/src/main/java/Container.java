/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Container {
    public int contents;
   
    public Container() {
        contents = 0;
    }
    
    public int contains() {
        return contents;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if (amount + contents >= 100) {
                contents = 100;
            } else {
                contents += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (contents - amount <= 0) {
                contents = 0;
            } else {
                contents -= amount;
            }
        }
    }
    
    public String toString() {
        return contents + "/100";
    }
}
