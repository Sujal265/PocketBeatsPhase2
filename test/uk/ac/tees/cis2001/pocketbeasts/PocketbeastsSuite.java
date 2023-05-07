/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sujalnagpal
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({uk.ac.tees.cis2001.pocketbeasts.InPlayTest.class, uk.ac.tees.cis2001.pocketbeasts.DeckTest.class, uk.ac.tees.cis2001.pocketbeasts.HandTest.class, uk.ac.tees.cis2001.pocketbeasts.CardTest.class, uk.ac.tees.cis2001.pocketbeasts.MainTest.class, uk.ac.tees.cis2001.pocketbeasts.GraveyardTest.class, uk.ac.tees.cis2001.pocketbeasts.PlayerTest.class})
public class PocketbeastsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
