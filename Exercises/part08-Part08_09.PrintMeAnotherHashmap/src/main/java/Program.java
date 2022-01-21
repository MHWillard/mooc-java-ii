
import java.util.HashMap;

public class Program {
    
    public static void printValues(HashMap<String,Book> hashmap) {
        //print all values in hashmap give as parameter, use toString method of Book
        for(Book book : hashmap.values()) {
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        //print only books in hashmap with given string
        for(Book book : hashmap.values()) {
            if(book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
