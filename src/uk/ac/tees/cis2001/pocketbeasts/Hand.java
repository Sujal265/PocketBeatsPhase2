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
import java.util.List;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Hand {

private final ArrayList<Card> cards;
    private final HandScoringStrategy scoringStrategy;

    public Hand(HandScoringStrategy scoringStrategy) {
        this.cards = new ArrayList<>();
        this.scoringStrategy = scoringStrategy;
    }

    public void add(Card card) {
        this.cards.add(card);
        this.sort();
    }

    public void addAll(List<Card> cards) {
        this.cards.addAll(cards);
        this.sort();
    }

    public void remove(Card card) {
        this.cards.remove(card);
    }

    public void removeAll(List<Card> cards) {
        this.cards.removeAll(cards);
    }

    public int count() {
        return this.cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    public int calculateScore() {
        return this.scoringStrategy.calculateScore(this.cards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < cards.size(); i++) {
            sb.append(cards.get(i).toString());
            if (i < cards.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void sort() {
        Collections.sort(this.cards);
    }

}
