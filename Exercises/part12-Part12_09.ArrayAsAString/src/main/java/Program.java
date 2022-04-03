import java.lang.StringBuilder;

public class Program {

    public static void main(String[] args) {
        // Test your method here
int[][] matrix = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        //create a string representation of the array it receives as the parameter and return it.
        
        /*
        
        for each row
            String empty = ""
            for each column
                convert into to string
                append to Empty
            return empty;
        */
        
        StringBuilder row = new StringBuilder("");
        
        for (int i = 0; i < array.length; i++) {
            //String row = "";
            
                for (int j = 0; j < array[i].length; j++) {
                //String add = String.valueOf(array[i][j]);
                    row.append(array[i][j]);
                }
            row.append("\n");
        }
        
        return row.toString();
    }

}
