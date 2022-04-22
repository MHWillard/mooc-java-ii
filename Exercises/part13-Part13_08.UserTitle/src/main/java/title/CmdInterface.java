/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package title;

import java.util.Scanner;

/**
 *
 * @author mwillard
 */
public class CmdInterface {
    
    public CmdInterface() {}
    
    public String printCmd() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter title: ");
        String input = scanner.nextLine();
        
        return input;
    }
    
}
