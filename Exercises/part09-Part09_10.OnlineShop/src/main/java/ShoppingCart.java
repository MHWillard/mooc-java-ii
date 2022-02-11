/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gatack
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        //make item
        //if in List: run increaseQuantity
        //otherwise: add it
        if (items.keySet().contains(product)) {
            items.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            items.put(product, item);
        }
    }
    
    public int price() {
        //returns price of all items in cart
        int cartPrice = 0;
        
        for (Item i : items.values()) {
            cartPrice += i.price();
        }
        
        return cartPrice;
    }
    
    public void print() {
        for (Item i : items.values()) {
            System.out.println(i);
        }
    }
}
