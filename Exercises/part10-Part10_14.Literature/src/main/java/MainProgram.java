
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        
        //HashMap<String, Integer> books = new HashMap<>();
        ArrayList<Book> books = new ArrayList<>();
        boolean menu = true;
        
        while (menu) {
            System.out.print("Imput the name of the book, empty stops: ");
            String name = scanner.nextLine();
        
            if (name.equals("")){
                for (Book x : books) {
                    System.out.println(x);
                }
                menu = false;
                break;
            }
                System.out.print("Input the age recommendation: ");
                int age = scanner.nextInt();
        
                books.add(new Book(name, age));
        }
    }*/
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                
                System.out.println(bookList.size()+ " books in total.");

                System.out.println("Books:");

                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);

                Collections.sort(bookList, comparator);

                bookList.stream()
                        .forEach(Book -> System.out.println(Book));

                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(bookTitle, ageRec));

        }
    }

}
