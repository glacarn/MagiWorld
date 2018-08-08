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
public class GuerrierTest 
{
    
    public GuerrierTest() {
    }

    /**
     * Test of DecrisToi method, of class Guerrier.
     */
    @Test
    public void testDecrisToi_Renvoi_String_Description() 
    {
        System.out.println("DecrisToi");
        Guerrier joueurAtk = new Guerrier(10, 50, 10, 0, 0, "joueur1");
        System.out.println(joueurAtk.DecrisToi());
        assertEquals("Woarg je suis le Guerrier joueur1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilité, 0 d'intelligence !", 
                joueurAtk.DecrisToi());
    }

    /**
     * Test of AttaqueBasique method, of class Guerrier.
     */
    @Test
    public void testAttaqueBasique_Dommages_Egal_Force() 
    {
        System.out.println("AttaqueBasique");
        Guerrier joueurAtk = new Guerrier(10, 50, 10, 0, 0, "joueur1");
        Guerrier joueurDef = new Guerrier(10, 50, 10, 0, 0, "joueur1");
        joueurAtk.AttaqueBasique(joueurDef);
        assertTrue(joueurDef.getVie() == 40);
        
    }

    /**
     * Test of AttaqueSpeciale method, of class Guerrier.
     */
    @Test
    public void testAttaqueSpeciale_Dommages_Egal_2ForcePourDef_05ForcePourAtk() 
    {
        System.out.println("AttaqueSpeciale");
        Guerrier joueurAtk = new Guerrier(10, 50, 10, 0, 0, "joueur1");
        Personnage joueurDef = new Guerrier(10, 50, 10, 0, 0, "joueur1");
        joueurAtk.AttaqueSpeciale(joueurDef);
        assertTrue (joueurDef.getVie() == 30 && joueurAtk.getVie() == 45);
        
    }
    
}
