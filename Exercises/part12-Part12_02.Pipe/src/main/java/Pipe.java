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

public class Pipe<T> {
    private ArrayList<T> values;
    
    //forms an ArrayList
    //first in, last out
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        //add onto front
        values.add(value);
    }
    
    public T takeFromPipe() {
        //pull from last entry
        //return value
        //remove from end of list
        //int index = values.size() - 1;
        if (values.isEmpty()) {
            return null;
        } else {
            T value = values.get(0);
            values.remove(0);
            return value;        
        }
        

    }
    
    public boolean isInPipe() {
        //if !pipe.isEmpty() return true
        //else, return false
        if (!values.isEmpty()) {
            return true;
        }
        return false;
    }
    
}
