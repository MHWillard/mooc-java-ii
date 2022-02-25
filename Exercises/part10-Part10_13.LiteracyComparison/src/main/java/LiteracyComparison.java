
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

    
    
    //make array list
    //stream: reach each row, split by column, add to list
    //then for each item in sublist, run a sorted comparing the current one and the next one
    //print in order
    
    ArrayList<String> lit = new ArrayList<>();
    String empty = "";
    
    try {
    Files.lines(Paths.get("literacy.csv"))
        .map(row -> row.split(","))
        .sorted((x, y) -> x[5].compareTo(y[5])) //lamba method
        .map(p -> p[3] + " (" + String.valueOf(p[4]) + "), " + p[2].split(" ")[1].trim() + ", " + String.valueOf(p[5]))
        .forEach(p -> lit.add(p));
    } catch (Exception e) {
        System.out.println("error: " + e.getMessage());
    }
    
        //System.out.println("PAUSE");
    
    for (String i : lit) {
      System.out.println(i);
    }
        
    
    //Create a program that first reads the file literacy.csv and then prints the contents from the lowest to the highest ranked on the literacy rate.
    //first five must be:
    //Niger (2015), female, 11.01572
    //Mali (2015), female, 22.19578
    //Guinea (2015), female, 22.87104
    //Afghanistan (2015), female, 23.87385
    //Central African Republic (2015), female, 24.35549
    //pieces[3] + pieces[4], pieces[2] (percent trimmed), pieces[5]
    //
    
    //split by comma:
    //String string = "Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513";
    //String[] pieces = string.split(",");
    // now pieces[0] equals "Adult literacy rate"
    // pieces[1] equals " population 15+ years"
    // etc.

    // to remove whitespace, use the trim() method:
    //pieces[1] = pieces[1].trim();
    }
    
}
