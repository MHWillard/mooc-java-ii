/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gatack
 */
import java.util.*;

public class Item {
    public String name;
    public int qty;
    public int price;
    
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.price = unitPrice;
    }
    
    public int price() {
        return qty * price;
    }
    
    public void increaseQuantity() {
        qty++;
    }
    
    public String toString() {
        return name + ": " + qty;
    }
}
