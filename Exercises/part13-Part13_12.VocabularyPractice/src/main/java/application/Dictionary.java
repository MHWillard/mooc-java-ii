/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;

/**
 *
 * @author mwillard
 */
public class Dictionary {
    //needs a key/value pair word list: arraylist? Hash? Probably hasp
    //get word pair from hashmap
    private HashMap<String, String> dictionary;
    
    public Dictionary() {
        dictionary = new HashMap<>();
    }
    
    //public void addWordPair (String word, String translation)
    public void addWordPair(String word, String translation) {
        dictionary.put(word, translation);
    }
    
    //public String getTranslation(String word)
    
    //public boolean checkTranslation(String word, String input)
}
