
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    
    public static void printInputs(String i) {
            System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        boolean menu = true;
        
        while (menu) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                menu = false;
                break;
            } else {
                inputs.add(input);
            }
        }
        
        if (!inputs.isEmpty()) {
            for (String i: inputs) {
                printInputs(i);
            }
        }

    }
}
