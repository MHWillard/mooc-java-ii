
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> values = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return values;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-1);
        numbers.add(2);
        numbers.add(-2);
        numbers.add(0);
        
        List<Integer> values = new ArrayList<>();
        values = positive(numbers);
        
        System.out.println(values);

    }

}
