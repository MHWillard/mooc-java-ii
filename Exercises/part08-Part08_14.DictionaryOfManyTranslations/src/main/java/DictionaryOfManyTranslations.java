/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gatack
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> listings;
    
    public DictionaryOfManyTranslations() {
        this.listings = new HashMap<>();
    }    
    //public void add(String word, String translation) adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {
        //if contains word: push into translation array of word
        //else, add both to listings
        listings.putIfAbsent(word, new ArrayList<>());
        
        listings.get(word).add(translation);
    }

    //public ArrayList<String> translate(String word) returns a list of the translations added for the word. If the word has no translations, 
    //the method should return an empty list.
    public ArrayList<String> translate(String word) {
        //find word
        //if word exists: print all translations of word
        //if not: print empty list => []
        
        //        for (String name: completedExercises.keySet()) {
         //   System.out.println(name + ": " + completedExercises.get(name));
        //}
        
        ArrayList<String> empty = new ArrayList<>();
        
        return listings.getOrDefault(word, empty);
    }

    //public void remove(String word) removes the word and all its translations from the dictionary.
    public void remove(String word) {
        listings.remove(word);
    }
    
}
