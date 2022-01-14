
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //first and second: containers
        //add, move, remove
        int first = 0;
        int second = 0;

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            //split input
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            //switch case: add, move, remove
            switch(command) {
                case "add":
                    if (first + amount >= 100) {
                        first = 100;
                    } else if (amount >= 0) {
                        first = first + amount;
                        System.out.println(first);
                    }
                    break;
                    
                /*
                move amount moves the amount of liquid specified by the parameter from the first container to the second container. 
                The given amount must be specified as an integer. If the program is requested to move more liquid than than the first container 
                currently holds, move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything 
                past that will go to waste.    
                */
                    
                case "move":
                    if (amount >= first) {
                        second += first;
                        first = 0;
                    } else if (second + amount >= 100) {
                        second = 100;
                    } else if (amount >= 0) {
                        first -= amount;
                        second += amount;
                    }
                    break;
                    
                case "remove":
                    if (second - amount <= 0) {
                        second = 0;
                    } else if (amount >= 0) {
                        second -= amount;
                    }
                    break;
            }

        }
    }

}
