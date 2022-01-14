
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        /*
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());
        
        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
        */
        
        
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
                switch(command) {
                case "add":
                    first.add(amount);
                    break;
                    
                case "move":
                    if (amount >= first.contents) {
                        amount = first.contents;
                    }
                    first.remove(amount);
                    second.add(amount);
                    break;
                    
                case "remove":
                    second.remove(amount);
                    break;
            }
        }
        
    }

}
