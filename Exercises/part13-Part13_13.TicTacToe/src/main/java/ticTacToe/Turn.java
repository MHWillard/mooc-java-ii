/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author mwillard
 */
public class Turn {
    private String currentTurn;
    
    public Turn() {
        this.currentTurn = "X";
    }
    
    public void changeTurn() {
        if (currentTurn.equals("X")) {
            this.currentTurn = "O";
        } else {
            this.currentTurn = "X";
        }
    }
    
    public String getTurn() {
        return this.currentTurn;
    }
}
