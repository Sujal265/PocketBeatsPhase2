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
public class SimpleInPlayScoringStrategy implements InPlayScoringStrategy{
    
    @Override
    public int calculateScore(List<Card> cards) {
        int score = 0;
        for (Card card : cards) {
            score += card.getValue();
        }
        return score;
    }
    
}
