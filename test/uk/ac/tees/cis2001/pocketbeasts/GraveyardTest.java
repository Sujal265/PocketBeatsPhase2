/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.ac.tees.cis2001.pocketbeasts.Card.Rank;
import uk.ac.tees.cis2001.pocketbeasts.Card.Suit;

/**
 *
 * @author sujalnagpal
 */
public class GraveyardTest {
    
    public GraveyardTest() {
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
     * Test of add method, of class Graveyard.
     */
     public void testAdd() {
        Graveyard instance = new Graveyard();
    Card card = new Card(Card.Rank.ACE, Card.Suit.CLUBS, "BR", "Barn Rat", 1, 1, 1);
    instance.add(card);
    assertEquals(1, instance.count());
    }

    /**
     * Test of count method, of class Graveyard.
     */
    @Test
    public void testCount() {
        Graveyard instance = new Graveyard();
        assertEquals(0, instance.count());
        Card card = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS, "HT", "Highland Tiger", 5, 4, 4);
        instance.add(card);
        assertEquals(1, instance.count());
    }

    /**
     * Test of getCards method, of class Graveyard.
     */
    @Test
    public void testGetCards() {
        Graveyard instance = new Graveyard();
        assertTrue(instance.getCards().isEmpty());
        Card card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS, "GD", "Guard Dog", 3, 2, 3);
        Card card2 = new Card(Card.Rank.QUEEN, Card.Suit.SPADES, "ARH", "All Round Hound", 3, 3, 3);
        instance.add(card1);
        instance.add(card2);
        List<Card> cards = instance.getCards();
        assertEquals(2, cards.size());
        assertTrue(cards.contains(card1));
        assertTrue(cards.contains(card2));
    }
    
}
