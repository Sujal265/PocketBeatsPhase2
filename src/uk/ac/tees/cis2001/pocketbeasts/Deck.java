/*
 * This file is part of PocketBeasts.
 *
 * PocketBeasts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PocketBeasts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Deck {

 private final List<Card> cards;
    private final ShuffleStrategy shuffleStrategy;

    /**
     * Constructs a new deck of cards.
     * 
     * @param cards the list of cards in the deck
     * @param shuffleStrategy the shuffle strategy to use when shuffling the deck
     */
    public Deck(List<Card>  cards, ShuffleStrategy shuffleStrategy) {
        this.cards = new ArrayList<>(cards);
        this.shuffleStrategy = shuffleStrategy;
    }
    
    /**
     * Constructs a new deck of cards with an empty list of cards and a default shuffle strategy.
     */
    public Deck() {
        this.cards = new ArrayList<>();
        this.shuffleStrategy = new FisherYatesShuffleStrategy();
    }



  

    /**
     * Returns the number of cards in the deck.
     * 
     * @return the number of cards in the deck
     */
    public int count() {
        return this.cards.size();
    }

    /**
     * Draws a card from the top of the deck.
     * 
     * @return the card drawn from the deck
     */
    public Card draw() {
        return this.cards.remove(0);
    }

    /**
     * Shuffles the cards in the deck.
     */
    public void shuffle() {
        this.shuffleStrategy.shuffle(this.cards);
    }

    /**
     * Adds a card to the bottom of the deck.
     * 
     * @param card the card to add to the deck
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * Removes a specific card from the deck.
     * 
     * @param card the card to remove from the deck
     */
    public void removeCard(Card card) {
        this.cards.removeIf(c -> Objects.equals(c, card));
    }

    /**
     * Removes all cards from the deck.
     */
    public void clear() {
        this.cards.clear();
    }

    /**
     * Returns a string representation of the deck.
     * 
     * @return a string representation of the deck
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Returns true if the deck contains the specified card, false otherwise.
     * 
     * @param card the card to check for in the deck
     * @return true if the deck contains the specified card, false otherwise
     */
    public boolean contains(Card card) {
        return this.cards.contains(card);
    }
}
