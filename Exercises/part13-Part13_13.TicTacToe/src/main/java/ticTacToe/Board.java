/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author Gatack
 */
public class Board {
    private String[][] board;
    
    public Board() {
        this.board = new String[2][2];
    }
    
    public void addToBoard(int col, int row, String value) {
        board[col][row] = value;
    }
    
    public boolean checkWin(String t) {
        if (checkRow(t) || checkCol(t) || checkLeftDiag(t) || checkRightDiag(t)) {
            return true;
        }
        return false;
    }
    
    public boolean checkRow(String currentTurn) {
        for (int col = 0; col <= 2; col++) {      
            if (board[col][0].equals(currentTurn) && board[col][1].equals(currentTurn) && board[col][2].equals(currentTurn)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkCol(String currentTurn) {
        for (int row = 0; row <= 2; row++) {      
            if (board[0][row].equals(currentTurn) && board[1][row].equals(currentTurn) && board[2][row].equals(currentTurn)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkLeftDiag(String currentTurn) {
        if (board[0][0].equals(currentTurn) && board[1][1].equals(currentTurn) && board[2][2].equals(currentTurn)) {
                return true;
            }
        return false;
    }
    
    public boolean checkRightDiag(String currentTurn) {
        if (board[2][0].equals(currentTurn) && board[1][1].equals(currentTurn) && board[0][2].equals(currentTurn)) {
                return true;
            }
        return false;
    }
    
}
