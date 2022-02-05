
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
Set<String> names = new HashSet<>();
names.add("first");
names.add("first");
names.add("second");
names.add("second");
names.add("second");

System.out.println(returnSize(names));
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
        public static int returnSize(Set list) {
            return list.size();
    }
}
