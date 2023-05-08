/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.List;

/**
 *
 * @author sujalnagpal
 */
public class FisherYatesShuffleStrategy implements ShuffleStrategy {
    
    @Override
    public void shuffle(List<Card> cards) {
        int n = cards.size();
        for (int i = n - 1; i >= 1; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }
    
}
