/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujalnagpal
 */
public class HandTest {
    
     public HandTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Hand.
     */
    @Test
    public void testAdd() {
        Card card = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);;
        Hand instance = new Hand();
        instance.add(card);
        assertEquals(1, instance.count());
    }

    /**
     * Test of remove method, of class Hand.
     */
    @Test
    public void testRemove() {
        Card card = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);;
        Hand instance = new Hand();
        instance.add(card);
        instance.remove(card);
        assertEquals(0, instance.count());
    }

    /**
     * Test of removeAll method, of class Hand.
     */
    @Test
    public void testRemoveAll() {
    List<Card> cards = new ArrayList<>();
    Card card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);
    Card card2 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS, "4C", "Four of Clubs", 4, 4, 4);
    cards.add(card1);
    cards.add(card2);

    Hand instance = new Hand();
    instance.addAll(cards);
    instance.removeAll(Arrays.asList(card1, card2));

    assertEquals(0, instance.count());
    }

    /**
     * Test of count method, of class Hand.
     */
    @Test
    public void testCount() {
        Hand instance = new Hand();
        assertEquals(0, instance.count());
        Card card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);
        Card card2 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS, "4C", "Four of Clubs", 4, 4, 4);
        instance.add(card1);
        instance.add(card2);
        assertEquals(2, instance.count());
    }

    /**
     * Test of getCards method, of class Hand.
     */
    @Test
    public void testGetCards() {
        Hand instance = new Hand();
        assertTrue(instance.getCards().isEmpty());
        Card card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);
        Card card2 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS, "4C", "Four of Clubs", 4, 4, 4);
        instance.add(card1);
        instance.add(card2);
        List<Card> cards = instance.getCards();
        assertEquals(2, cards.size());
        assertTrue(cards.contains(card1));
        assertTrue(cards.contains(card2));
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
   Hand instance = new Hand();
    Card card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);
    Card card2 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS, "4C", "Four of Clubs", 4, 4, 4);
    instance.add(card1);
    instance.add(card2);
    String expResult = "[Ace of Spades (AS)[ Mana Cost: 01 Attack: 1 Health: 1] Four of Clubs (4C)[ Mana Cost: 04 Attack: 4 Health: 4]]";
    String result = instance.toString();
    assertEquals(expResult, result);
    }
}
    
