/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author mwillard
 */
public class Dictionary {
    //needs a key/value pair word list: arraylist? Hash? Probably hasp
    //get word pair from hashmap
    public HashMap<String, String> dictionary;
    public Random rand;
    public ArrayList<String> keys;
    
    public Dictionary() {
        dictionary = new HashMap<>();
        rand = new Random();
        keys = new ArrayList<>();
    }
    
    //public void addWordPair (String word, String translation)
    public void addWordPair(String word, String translation) {
        dictionary.put(word, translation);
    }
    
    public void setWordList() {
        keys.clear();
        
        for (String s: dictionary.keySet()) {
            keys.add(s);
        }
    }
    
    public String getPracticeWord() {
            int roll = rand.nextInt(keys.size());
            String practiceWord = keys.get(roll);
            return practiceWord;
    }
    
    //public String getTranslation(String word)
    
    public boolean checkTranslation(String word, String input) {
        if (dict.get()) {}
        return false;
    }
}
