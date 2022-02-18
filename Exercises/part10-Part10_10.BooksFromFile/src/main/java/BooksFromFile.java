
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        //new list for books
        //grab the file
        //for each row: split it into four parts by comma for part[0]-part[3] with map
        //map: take each set of parts and make a book:
        //new Book(part[0], Integer.valueOf(part[1]), Integer.valueOf(part[2]), part[3])
        
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
            .map(row -> row.split(","))
            .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]),parts[3]))
            .forEach(book -> books.add(book));         
        } catch (Exception e) {
            System.out.println("File could not be opened: " + e.getMessage());
        }
        
        return books;
        
        /*
                List<String> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("File could not be opened: " + e.getMessage());
        }
        
        return rows;
        */
    }

}
