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
public class AnotherInPlayScoringStrategy implements InPlayScoringStrategy{
    
      @Override
    public int calculateScore(List<Card> cards) {
        // another implementation of calculating the score
        if (cards.isEmpty()) {
    return 0;
}
        else{
            throw new IllegalArgumentException("No cards provided");
        }
     
    }
}
