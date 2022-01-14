/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.HashMap;

public class Abbreviations {
    //abbreviations hashmap
    private HashMap<String, String> list;
    
    public Abbreviations() {
        //arm new hashmap
        this.list = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explaination) {
        //add to hashmap
        if (this.list.containsKey(abbreviation)) {
            System.out.println("Already in list");
        } else {
            list.put(abbreviation, explaination);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        //find abbreviation in hashmap
        //checks if an abbreviation has already been added; returns true if it has and false if it has not.
        if (this.list.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        //find value or return null
        String explain = list.get(abbreviation);
        return explain;
    }
}
