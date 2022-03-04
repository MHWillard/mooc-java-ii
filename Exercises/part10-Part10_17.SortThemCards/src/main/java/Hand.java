/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }
    
    public void sort() {
        Collections.sort(hand); 
    }
    

    public void sortBySuit() {
        BySuitInValueOrder BySuitInValueOrderSorter = new BySuitInValueOrder();
        Collections.sort(hand, BySuitInValueOrderSorter);
    }
    
    public int handValue() {
        int value = 0;
        for (Card c : hand) {
            value += c.getValue();
        }
        return value;
    }
    
    public int compareTo(Hand hand) {
        if (this.handValue() > hand.handValue()) {
            return 1;
        } else if (this.handValue() < hand.handValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}
