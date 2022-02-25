

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();
        
        String word = "fart";
        String word2 = "aeiou";
        String word3 = "uoiea";
        String word4 = "grrb";
        
        System.out.println(checker.allVowels(word));
        System.out.println(checker.allVowels(word2));
        System.out.println(checker.allVowels(word3));
        System.out.println(checker.allVowels(word4));
                
    }
}
