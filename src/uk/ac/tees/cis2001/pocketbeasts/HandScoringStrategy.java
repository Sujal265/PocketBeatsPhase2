/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sujalnagpal
 */
public interface HandScoringStrategy {
    int calculateScore(List<Card> cards);

    public int calculateScore(ArrayList<Card> cards);
}
