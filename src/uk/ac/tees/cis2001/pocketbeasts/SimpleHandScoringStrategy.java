/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sujalnagpal
 */
public class SimpleHandScoringStrategy implements HandScoringStrategy {
    
    @Override
    public int calculateScore(List<Card> cards) {
        int score = 0;
        for (Card card : cards) {
            score += card.getValue();
        }
        return score;
    }

    @Override
    public int calculateScore(ArrayList<Card> cards) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
