/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author sujalnagpal
 */
public class DefaultManaStrategy implements ManaStrategy{
    
    public static final int MAX_MANA = 9;

    private int manaAvailable;
    private int manaTicker;

    @Override
    public int getManaAvailable() {
        return this.manaAvailable;
    }

    public void addMana() {
        if (this.manaTicker < MAX_MANA) {
            this.manaTicker++;
        }
        this.manaAvailable = manaTicker;
    }

    public void useMana(int amount) {
        if (amount > this.manaAvailable) {
            throw new IllegalArgumentException("Insufficient mana");
        }
        this.manaAvailable -= amount;
    }
    
}
