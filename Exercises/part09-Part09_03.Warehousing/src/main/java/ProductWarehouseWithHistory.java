/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private double balance;
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        balance = initialBalance;
        changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        double change = super.getBalance();
        changeHistory.add(change);
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double answer = super.takeFromWarehouse(amount);
        double change = super.getBalance();
        changeHistory.add(change);
        return answer;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
        
    }
    
    public String history() {
        return changeHistory.toString();
    }
}
