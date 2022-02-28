

public class Checker {
    
    public Checker() {}
    
    public boolean isDayOfWeek(String string) {
        
        String regex = "sun|mon|tue|wed|thu|fri|sat"; //put regex here
        
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string) {
        
        if (string.matches("^[aeiou]*")) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string) {
        
        String regex = "\"(?:[01]\\\\d|2[0123]):(?:[012345]\\\\d):(?:[012345]\\\\d)\""; //put regex here
        
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
}
