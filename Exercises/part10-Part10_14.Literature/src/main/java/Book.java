/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Book {
    private String name;
    private int age;
    
    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
        public String toString(){
        
        return this.getName() + " (recommended for " + this.getAge() +" year-olds or older)";
    }
}
