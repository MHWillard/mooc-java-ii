
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean menu = true;
        ArrayList<Integer> values = new ArrayList<>();
        //int average numbers list
        
        while (menu) {
            int input = scanner.nextInt();
            
            if (input == 0) {
                if (values.isEmpty()) {
                    System.out.println("Cannot calculate the average");
                    menu = false;
                    break;
                } else {
                    int sum = 0;
                    for (int value: values) {
                        sum += value;
                    }
                    float avg = (float) sum / values.size();
                    System.out.println(avg);
                    menu = false;
                    break;
                }
            }
                //check for positive numbers
                //add all avg list numbers together then divide by array length
                
            if (input >= 1) {
                //only add number to list if positive
                values.add(input);
            }
        }

    }
}
