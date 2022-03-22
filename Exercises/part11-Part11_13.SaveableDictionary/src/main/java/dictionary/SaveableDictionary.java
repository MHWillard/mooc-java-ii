/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;

/**
 *
 * @author mwillard
 */
public class SaveableDictionary {
    HashMap<String, String> dict;
    
    public SaveableDictionary() {
        dict = new HashMap<>();
    }
    
    public void add(String words, String translation) {
        //add word to dictionary; if already exists, nothing happens
        if (!dict.containsKey(words)) {
            dict.put(words, translation);
        }
    }
    
    public String translate(String word) {
        
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        
        if (dict.containsValue(word)) {
            for (String s : dict.keySet()) {
                if (dict.get(s).equals(word)) {
                    return s;
                }
            }
        }
        
        return null;
    }
    
    public void delete(String word) {
        if (dict.containsKey(word)) {
            dict.remove(word);
        }
        
        if (dict.containsValue(word)) {
            for (String s : dict.keySet()) {
                if (dict.get(s).equals(word)) {
                    dict.remove(s);
                }
            }
        }
    }
}
