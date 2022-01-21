
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class IOU {
    //probably a hashmap
    private HashMap<String, Double> owed;
    
    public IOU() {
        //new hashmap
        this.owed = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        //add to hashmap
        //int trueAmount = this.owed.getOrDefault(toWhom, 0);
        //this.owed.put(toWhom, trueAmount); 
        owed.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        //returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
        return owed.getOrDefault(toWhom, 0.0);
    }
}
