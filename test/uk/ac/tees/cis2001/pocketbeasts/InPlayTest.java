/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.Collection;
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
public class InPlayTest {
    
    private InPlay instance;
    private Card card1;
    private Card card2;
    
    public InPlayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new InPlay();
        card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS, "AS", "Ace of Spades", 1, 1, 1);
        card2 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS, "4C", "Four of Clubs", 4, 4, 4);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetCards() {
        instance.add(card1);
        instance.add(card2);
        List<Card> expResult = List.of(card1, card2);
        List<Card> result = instance.getCards();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCard() {
        instance.add(card1);
        instance.add(card2);
        Card expResult = card1;
        Card result = instance.getCard(0);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd() {
        instance.add(card1);
        assertTrue(instance.getCards().contains(card1));
    }

    @Test
    public void testRemove() {
        instance.add(card1);
        instance.remove(card1);
        assertFalse(instance.getCards().contains(card1));
    }

    @Test
    public void testRemoveAll() {
        instance.add(card1);
        instance.add(card2);
        Collection<Card> cardsToRemove = List.of(card1, card2);
        instance.removeAll(cardsToRemove);
        assertTrue(instance.getCards().isEmpty());
    }

    @Test
    public void testCount() {
        instance.add(card1);
        instance.add(card2);
        int expResult = 2;
        int result = instance.count();
        assertEquals(expResult, result);
    }
    
}
