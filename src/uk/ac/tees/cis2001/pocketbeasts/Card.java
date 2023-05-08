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

import java.util.UUID;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Card implements Comparable<Card> {

     public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }

    private final Rank rank;
    private final Suit suit;
    private final String id;
    private final String name;
    private final int manaCost;
    private AttackStrategy attackStrategy;
    private int health;
    private int value;

    public Card(Rank rank, Suit suit, String id, String name, int manaCost, AttackStrategy attackStrategy, int health) {
        this.rank = rank;
        this.suit = suit;
        this.id = id;
        this.name = name;
        this.manaCost = manaCost;
        this.attackStrategy = attackStrategy;
        this.health = health;
    }

    public Card(Card card) {
        this.rank = card.rank;
        this.suit = card.suit;
        this.id = card.id;
        this.name = card.name;
        this.manaCost = card.manaCost;
        this.attackStrategy = card.attackStrategy;
        this.health = card.health;
    }

    public Card(Rank rank, Suit suit) {
        this(rank, suit, UUID.randomUUID().toString(), rank.toString() + " of " + suit.toString(), rank.ordinal() + 1, new NormalAttackStrategy(), rank.ordinal() + 1);
    }

    
    public Rank getRank() {
        return this.rank;
    }
 

    public Suit getSuit() {
        return this.suit;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
     public int getValue() {
        return this.value;
    }

   

    public int getManaCost() {
        return this.manaCost;
    }

    public int getAttack() {
        return this.attackStrategy.attack(this.rank.ordinal() + 1);
    }

    public int getHealth() {
        return this.health;
    }

    public Card damage(int amount) {
        return new Card(this.rank, this.suit, this.id, this.name, this.manaCost, this.attackStrategy, this.health - amount);
    }
    

    @Override
    public String toString() {
        String formattedManaCost = String.format("%02d", this.manaCost);
        return this.name + " (" + this.id + ")[ Mana Cost: " + formattedManaCost + " Attack: " + this.getAttack() + " Health: " + this.health + "]";
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getManaCost(), o.getManaCost());
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }
   
   }
