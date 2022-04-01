
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        
        int[] numbers = {3, -1, 8, 4};

System.out.println(sum(numbers, 0, 0, 0, 0));
System.out.println(sum(numbers, 0, 0, 0, 10));
System.out.println(sum(numbers, 0, 1, 0, 10));
System.out.println(sum(numbers, 0, 1, -10, 10));
System.out.println(sum(numbers, -1, 999, -10, 10));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        //upper and lower limits: index positions
        //smallest and largest: numbers must be between these ranges
        int totalSum = 0;
        
        int startIndex = fromWhere;
        int endIndex = toWhere;
        
        if (fromWhere < 0) {
            startIndex = 0;
        }
        
        if (toWhere > array.length) {
            endIndex = array.length;
        }

        while (startIndex < endIndex) {
            if (array[startIndex] >= smallest && array[startIndex] <= largest) {
                totalSum += array[startIndex];
                startIndex++;
            }
        }        
        
        return totalSum;
    }

}
