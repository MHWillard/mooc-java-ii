
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        CustomTacoBox box = new CustomTacoBox(5);
        
        System.out.println(box.tacosRemaining());
        box.eat();
        System.out.println(box.tacosRemaining());
        box.eat();
        box.eat();
        box.eat();
        System.out.println(box.tacosRemaining());
    }
}
