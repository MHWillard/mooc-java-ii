/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    /*
    The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.
The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.
The commmand list prints all the tasks on the to-do list.
The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should 
    be removed from the list of tasks.
    */
    
    public void start() {
        boolean menu = true;
        
        while(menu) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            switch(command) {
                case "add":
                    System.out.println("To add: ");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int number = scanner.nextInt();
                    list.remove(number);
                    break;
                case "list":
                    list.print();
                    break;
                case "stop":
                    menu = false;
                    break;
            }
        }
    }
    
}
