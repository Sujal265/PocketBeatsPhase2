/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import static junit.runner.Version.id;
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
public class CardTest {
    
    public CardTest() {
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
     * Test of getId method, of class Card.
     */
  @Test
    public void testGetId() {
        Card instance = new Card(Card.Rank.ACE, Card.Suit.CLUBS, "001", "PocketBeast", 2, 3, 4);
        String expResult = "001";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetName() {
        Card instance = new Card(Card.Rank.ACE, Card.Suit.CLUBS,"001", "PocketBeast", 2, 3, 4);
        String expResult = "PocketBeast";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetManaCost() {
        Card instance = new Card(Card.Rank.TWO, Card.Suit.SPADES,"001", "PocketBeast", 2, 3, 4);
        int expResult = 2;
        int result = instance.getManaCost();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAttack() {
        Card instance = new Card(Card.Rank.TWO, Card.Suit.SPADES, "001", "PocketBeast", 2, 3, 4);
        int expResult = 3;
        int result = instance.getAttack();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHealth() {
        Card instance = new Card(Card.Rank.THREE, Card.Suit.HEARTS,"001", "PocketBeast", 2, 3, 4);
        int expResult = 4;
        int result = instance.getHealth();
        assertEquals(expResult, result);
    }

    @Test
    public void testDamage() {
        Card instance = new Card(Card.Rank.THREE, Card.Suit.HEARTS, "001", "PocketBeast", 2, 3, 4);
        Card expResult = new Card(Card.Rank.KING, Card.Suit.DIAMONDS,"001", "PocketBeast", 2, 3, 2);
        Card result = instance.damage(2);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getManaCost(), result.getManaCost());
        assertEquals(expResult.getAttack(), result.getAttack());
        assertEquals(expResult.getHealth(), result.getHealth());
    }

    @Test
    public void testToString() {
    Card instance = new Card(Card.Rank.KING, Card.Suit.DIAMONDS, "001", "PocketBeast", 2, 3, 4);
    String formattedManaCost = String.format("%02d", instance.getManaCost());
    String expResult = "PocketBeast (001)[ Mana Cost: " + formattedManaCost + " Attack: " + instance.getAttack() + " Health: " + instance.getHealth() + "]";
    String result = instance.toString();
    assertEquals(expResult, result);
}

    @Test
    public void testCompareTo() {
        Card instance1 = new Card(Card.Rank.QUEEN, Card.Suit.SPADES,"001", "PocketBeast", 2, 3, 4);
        Card instance2 = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS,"002", "PocketBeast", 3, 4, 5);
        int expResult = -1;
        int result = instance1.compareTo(instance2);
        assertEquals(expResult, result);
    }
}

