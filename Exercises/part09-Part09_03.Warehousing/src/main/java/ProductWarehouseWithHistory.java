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
    //private double balance;
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity, balance);
        balance += initialBalance;
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }
    
    public String history() {
        return changeHistory.toString();
    }
}
