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
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(balance);
    }
    
    public double takeFromWarehouse(double amount) {
        double answer = super.takeFromWarehouse(amount);
        changeHistory.add(balance);
        return answer;
    }
    
    /*
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            //this.balance = getCapacity();
            this.balance = this.capacity;
        }
        changeHistory.add(balance);
    }
    */

    /*
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        changeHistory.add(balance);
        return amount;
    }
    */
    
    public String history() {
        return changeHistory.toString();
    }
}
