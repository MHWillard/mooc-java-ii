/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Book implements Packable {
    public String author;
    public String name;
    public double weight;
    
    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
}
