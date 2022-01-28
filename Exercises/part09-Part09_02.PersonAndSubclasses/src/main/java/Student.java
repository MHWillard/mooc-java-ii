/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Student extends Person {
    private int credits;
    
    //super constructor to extend person
    public Student(String name, String address) {
        super(name, address);
        //super(Person);
        this.credits = 0;
    }
    
    //study(): credits++;
    public void study() {
        this.credits++;
    }
    
    //credits(): print "Study credits" then number, return this
    public int credits() {
        return this.credits;
    }
    
    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  Study credits " + this.credits;
    }
}
