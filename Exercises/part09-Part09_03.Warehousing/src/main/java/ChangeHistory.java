/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double max = 0;
        
        for (double i: history) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double min = maxValue();
        
        for (double i: history) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
       double total = 0;
        
        for (double i: history) {
            total += i;
        }
        
        double avg = total / history.size();
        
        return avg;    
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}
