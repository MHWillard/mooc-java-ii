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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {

        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {

        ArrayList<String> empty = new ArrayList<>();
        
        return storage.getOrDefault(storageUnit, empty);
    }
    
    public void remove(String storageUnit, String item) {

        storage.get(storageUnit).remove(item);
        if (storage.get(storageUnit) == null) {
            storage.remove(storageUnit);
        }        
    }
    
    public ArrayList<String> storageUnits() {
        
        ArrayList<String> keys = new ArrayList<>();
        
        for (String i : storage.keySet() ) {
            if (!storage.get(i).isEmpty()) {
                keys.add(i);
            }
        }
        return keys;
    }
}