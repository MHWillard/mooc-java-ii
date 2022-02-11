/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd() {
        herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
            
    public void move(int dx, int dy) {
        //iterate + move each herd member
        //for each: call its Movable method?
        for (Movable m : herd) {
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        //for each movable item: call its tostring
        String text = "";
        for (Movable m : herd) {
            text = text.concat(m.toString() + "\n");
        }
        return text;
    }
}
