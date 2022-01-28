/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Person {
    //attributes
    private String name;
    private String address;
    
    //constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    //to String
    public String toString() {
        return this.name + "\n  " + this.address;
    }
    
}
