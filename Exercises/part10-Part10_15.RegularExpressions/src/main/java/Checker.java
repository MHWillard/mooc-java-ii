

public class Checker {
    
    public Checker() {}
    
    public boolean isDayOfWeek(String string) {
        //take string
        //compare against regex
        //if good: return true
        //else: return false
        //sun, mon, tue, wed, thu, fri, sat
        
        String regex = "sun|mon|tue|wed|thu|fri|sat"; //put regex here
        
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
    
        public boolean allVowels(String string) {
        //take string
        //compare against regex
        //if good: return true
        //else: return false
        //a,e,i,o,u
        
        //String regex = "[aeiou]"; //put regex here
        
        if (string.matches("{aeiou}+")) {
            return true;
        }
        return false;
    }
}
