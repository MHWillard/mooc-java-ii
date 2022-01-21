
import java.util.HashMap;

public class Program {
    
    public static void printKeys(HashMap<String, String> hashmap) {
        //print all hashmap keys given parameter
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        //print keys given parameter which contains string
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);    
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        //print values in hashmap where keys contain the string
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));    
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
hashmap.put("f.e", "for example");
hashmap.put("etc.", "and so on");
hashmap.put("i.e", "more precisely");

printKeys(hashmap);
System.out.println("---");
printKeysWhere(hashmap, "i");
System.out.println("---");
printValuesOfKeysWhere(hashmap, ".e");
    }

}
