
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> inputs = new ArrayList<>();
        
        boolean menu = true;
        
        while (menu) {
            Integer input = scanner.nextInt();
            
            if (input < 0) {
                menu = false;
                break;
            } else {
                inputs.add(input);
            }
        }        
        
        if (!inputs.isEmpty()) {
            inputs.stream()
                    .filter(i -> (i >= 1 && i <= 5))
                    .forEach(i -> System.out.println(i));
        }

    }
}
