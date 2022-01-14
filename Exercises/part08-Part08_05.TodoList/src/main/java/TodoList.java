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

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            int num = i + 1;
            System.out.println(num + ": " + list.get(i));
        }
    }
    
    public void remove(int number) {
        if (number != 0) {
            list.remove(number - 1);
        }
    }
}
