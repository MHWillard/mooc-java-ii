/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class Cat extends Animal implements NoiseCapable {
    public Cat() {
        super("Cat");
    }
    
    public Cat(String name) {
        super(name);
    }
    
    public void purr() {
        String name = super.getName();
        System.out.println(name + " purrs");
    }
    
    @Override
    public void makeNoise() {
        this.purr();
    }
    
}
