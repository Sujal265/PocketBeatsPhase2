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
import java.util.List;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Graveyard {
    
    private final ArrayList<Card> cards;

    /**
     * Constructs a new, empty graveyard.
     */
    public Graveyard() {
        this.cards = new ArrayList<>();
    }
    
    /**
     * Adds a card to the graveyard.
     *
     * @param card The card to be added to the graveyard.
     */
    public void add(Card card) {
        this.cards.add(card);
    }
    
    /**
     * Returns the number of cards in the graveyard.
     *
     * @return The number of cards in the graveyard.
     */
    public int count() {
        return this.cards.size();
    }
    
    /**
     * Returns a new list containing all the cards in the graveyard.
     *
     * @return A new list containing all the cards in the graveyard.
     */
    public List<Card> getCards() {
        return new ArrayList<>(this.cards);
    }
}
