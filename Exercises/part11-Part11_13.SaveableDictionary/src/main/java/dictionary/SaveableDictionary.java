/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

/**
 *
 * @author mwillard
 */
public class SaveableDictionary {
    private HashMap<String, String> dict;
    private String file;
    
    public SaveableDictionary() {
        dict = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        dict = new HashMap<>();
        this.file = file;
        //run load using file argument then add to HashMap
    }
    
    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] parts = line.split(":");
                
                add(parts[0],parts[1]);
                //split
                //add to dict
            }
        } catch (Exception e) {
            return false;
        }
        return true;
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
        String translation = translate(word);
        
        dict.remove(word);
        dict.remove(translation);
        
    }
    
    public boolean save() throws Exception {
        //write file using filewriter class
        //try catch, return false if exception; otherwise throw true
        //overwrite, don't use append
        
        //take all words in dict
        //for each word: write to existing file using PrintWriter, using it as a text string
        //end with close
        
        PrintWriter writer = new PrintWriter(file);
        writer.p
        
        return true;
    }
}
