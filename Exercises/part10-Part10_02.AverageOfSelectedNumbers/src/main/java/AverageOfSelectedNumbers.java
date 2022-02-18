
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // toteuta ohjelmasi tänne
        
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
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        double average = 0.0;
        
        switch (option) {
            case "n":
                //if s isn't positive: add to total, then average
                //could add it to new arraylist
                average = numbers.stream()
                        .mapToInt(i -> Integer.valueOf(i))
                        .filter(i -> i < 0)
                        .average()
                        .getAsDouble();
                System.out.println("average of the negative numbers: " + average);
                break;
            case "p":
                average = numbers.stream()
                        .mapToInt(i -> Integer.valueOf(i))
                        .filter(i -> i >= 0)
                        .average()
                        .getAsDouble();
                System.out.println("average of the positive numbers: " + average);
                break;
            }

    }
}
