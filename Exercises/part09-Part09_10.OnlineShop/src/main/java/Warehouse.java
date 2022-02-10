/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.*;

public class Warehouse {
    public Map<String, Integer> products;
    public Map<String, Integer> supply;
    
    public Warehouse() {
        products = new HashMap<>();
        supply = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        supply.put(product, stock);
    }
    
    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (supply.containsKey(product)) {
            return supply.get(product);
        }
        return 0;
    }
        
    public boolean take(String product) {
        if (supply.containsKey(product) && supply.get(product) > 0) {
            int replace = supply.get(product);
            replace--;
            supply.put(product, replace);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return products.keySet();
    }
}
