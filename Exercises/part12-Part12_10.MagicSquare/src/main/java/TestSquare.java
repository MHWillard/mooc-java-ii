/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
public class TestSquare {
    private int[][] square;
    private int row;
    private int column;
    
    public TestSquare() {
        row = 2;
        column = 3;
        square = new int[row][column];
    }
    
    // test square to test method
        
    public void populateSquare() {  
        int rowLength = square.length;
        int colLength = square[0].length;
        int squareNum = 1;
        int endNum = rowLength * colLength;
        int startRow = 0;
        int startColumn = colLength / 2;
        
        square[startRow][startColumn] = squareNum;
        squareNum++;
        
        while (squareNum < endNum) {
        
             if (startRow - 1 < 0) {
                startRow = rowLength - 1;
            } else {
                startRow++;
            }
            
            if (startColumn + 1 < colLength) {
                startColumn = 0;
            } else {
                startColumn++;
            }
        
            /*
            if (square[startRow][startColumn] != 0) {
                
                if (startRow - 1 < 0) {
                    startRow = rowLength - 1;
                } else {
                    startRow--;
                }
                
                startRow--;
            }
*/
        
            square[startRow][startColumn] = squareNum;
            squareNum++;
        
        }
    }
        
    
}
