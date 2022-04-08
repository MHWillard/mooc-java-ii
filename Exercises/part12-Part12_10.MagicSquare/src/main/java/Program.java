
import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        //MagicSquareFactory msFactory = new MagicSquareFactory();
        //MagicSquare square = msFactory.createMagicSquare(2);
        //System.out.println(msFactory.createMagicSquare(5));
        
        TestSquare square = new TestSquare();
        
        square.populateSquare();
        
        System.out.println(square);
        
    }
    
    public static ArrayList<Integer> sumsOfRows(int[][] square) {
        ArrayList<Integer> rowList = new ArrayList<>();
        
        
        for (int row = 0; row < square.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < square[row].length; col++) {
                rowSum += square[row][col];
            }
            rowList.add(rowSum);
        }
        
        return rowList;
        /*
        int rowSum = 0;
        for each row:
            rowSum += row.value;
        add to rowList
        
        finally: return rowList;
        */
    }

    public static ArrayList<Integer> sumsOfColumns(int[][] square) {
        ArrayList<Integer> colList = new ArrayList<>();
        
        for (int row = 0; row < square.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < square[row].length; col++) {
                rowSum += square[col][row];
            }
            colList.add(rowSum);
        }
        
        return colList;
        
        /*
        
        for (int col = 0; col < square.length; col++) {
            int colSum = 0;
            for (int row = 0; row < square[col][row]; row++) {
                colSum += square[col][row];
            }
            colList.add(colSum);
         
        }
        */
        
        //return colList;
        
    }
}
