
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Write your program here
        
        boolean end = false;
        
        System.out.println("Input numbers, type \"end\" to stop.");
                
        while (!end) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                end = true;
                break;
            } else {
                int number = Integer.parseInt(input);
                numbers.add(number);
            }
        }
        
        if (!numbers.isEmpty()) {
            double total = numbers.stream()
                    .mapToInt(i -> Integer.valueOf(i))
                    .average()
                    .getAsDouble();
            
            System.out.println("average of the numbers: " + total);
        }

    }
}
