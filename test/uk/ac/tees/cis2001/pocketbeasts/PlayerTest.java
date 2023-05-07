/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.ac.tees.cis2001.pocketbeasts.Player;

/**
 *
 * @author sujalnagpal
 */
public class PlayerTest {
    
  private Player player;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", new Deck(), new Hand(), new InPlay(), new Graveyard());
    }

    @Test
    public void testGetName() {
        assertEquals("TestPlayer", player.getName());
    }

    @Test
    public void testGetManaAvailable() {
        assertEquals(0, player.getManaAvailable());
    }

    @Test
    public void testGetHealth() {
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testGetDeck() {
        assertNotNull(player.getDeck());
    }

    @Test
    public void testGetHand() {
        assertNotNull(player.getHand());
    }

    @Test
    public void testGetInPlay() {
        assertNotNull(player.getInPlay());
    }

    @Test
    public void testGetGraveyard() {
        assertNotNull(player.getGraveyard());
    }

    @Test
    public void testNewGame() {
        player.newGame();
        assertEquals(30, player.getHealth());
        assertEquals(0, player.getManaAvailable());
        assertNotNull(player.getDeck());
        assertNotNull(player.getHand());
        assertNotNull(player.getInPlay());
        assertNotNull(player.getGraveyard());
    }

    @Test
    public void testAddMana() {
        player.addMana();
        assertEquals(1, player.getManaAvailable());
    }

    @Test
    public void testUseMana() {
        player.addMana();
        player.useMana(1);
        assertEquals(0, player.getManaAvailable());
    }

    @Test
    public void testDrawCard() {
        int initialHandSize = player.getHand().getSize();
        player.drawCard();
        assertEquals(initialHandSize + 1, player.getHand().getSize());
    }

    @Test
    public void testDamage() {
        assertTrue(player.damage(10));
        assertEquals(20, player.getHealth());
        assertFalse(player.damage(100));
        assertEquals(0, player.getHealth());
    }

}