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
import java.util.Collections;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Deck {
    
    Deck deck = new Deck();
    private final ArrayList<Card> cards;
    


    public Deck(ArrayList<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    Deck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int count() {
        return this.cards.size();
    }

    public Card draw() {
        return this.cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    public void clear() {
        this.cards.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck: [\n");
        for (int i = 0; i < this.cards.size(); i++) {
            sb.append("  ");
            sb.append(this.cards.get(i).toString());
            if (i < this.cards.size() - 1) {
                sb.append(" | ");
            }
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean contains(Card card) {
        return this.cards.contains(card);
    }
}
