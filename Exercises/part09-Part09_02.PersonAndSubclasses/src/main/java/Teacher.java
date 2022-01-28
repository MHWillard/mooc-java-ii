/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Teacher extends Person {
    //properties
    private int salary;
    
    //constructor: super to inherit person constructor
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    //to string: print monthly salary
    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  salary " + this.salary + " euro/month";
    }
}
