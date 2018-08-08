/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arno
 */
public class MageTest {
    
    public MageTest() {
    }
    

    /**
     * Test of DecrisToi method, of class Mage.
     */
    @Test
    public void testDecrisToi_Renvoi_String_Description() {
        System.out.println("DecrisToi");
        Mage joueurAtk = new Mage(10, 50, 0, 0, 10, "joueur1");
        System.out.println(joueurAtk.DecrisToi());
        assertEquals("Abracadabra je suis le Mage joueur1 niveau 10 je possède 50 de vitalité, 0 de force, 0 d'agilité, 10 d'intelligence !", 
                joueurAtk.DecrisToi());
    }

    /**
     * Test of AttaqueBasique method, of class Mage.
     */
    @Test
    public void testAttaqueBasique_Dommages_Egal_Intelligence() {
        System.out.println("AttaqueBasique");
        Mage joueurAtk = new Mage(10, 50, 0, 0, 20, "joueur1");
        Mage joueurDef = new Mage(10, 50, 0, 0, 10, "joueur1");
        joueurAtk.AttaqueBasique(joueurDef);
        assertTrue(joueurDef.getVie() == 30);
        
    }

    /**
     * Test of AttaqueSpeciale method, of class Mage.
     */
    @Test
    public void testAttaqueSpeciale_Soin_Egal_2Intelligence() {
        System.out.println("AttaqueSpeciale");
        Mage joueurAtk = new Mage(10, 50, 0, 0, 10, "joueur1");
        joueurAtk.setVie(20);
        Personnage joueurDef = null;
        joueurAtk.AttaqueSpeciale(joueurDef);
        assertTrue (joueurAtk.getVie() == 40);   
    }
    
    @Test
    public void testAttaqueSpeciale_Soin_Egal_2Intelligence_SansDepasser_VieInitiale() {
        System.out.println("AttaqueSpeciale");
        Mage joueurAtk = new Mage(10, 50, 0, 0, 10, "joueur1");
        joueurAtk.setVie(40);
        Personnage joueurDef = null;
        joueurAtk.AttaqueSpeciale(joueurDef);
        assertTrue (joueurAtk.getVie() == 50);   
    }
    
}
