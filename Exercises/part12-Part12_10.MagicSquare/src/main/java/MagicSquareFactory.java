
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        /*
        
        do a REAL SMALL SQUARE: 2 rows, 3 columns
        
        variable to track square position
        
        number 1: row 1, centermost column
        then: move up 1 row and 1 column right (-1 row +1col) and place number 2
            repeat for each number
        
        if cell already has number: INSTEAD, take one step down (+1 row, same col)
        
        if -1 row > square.length
            set current row to max row number, then do +1 col
        
        if +1 col > square[row].length
            set current column to min col number
        
        
        */
        
        
        
        
        return square;
    }

}
