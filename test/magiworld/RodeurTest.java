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
public class RodeurTest 
{
    
    public RodeurTest() {
    }


    /**
     * Test of DecrisToi method, of class Rodeur.
     */
    @Test
    public void testDecrisToi_Renvoi_String_Description() 
    {
        System.out.println("DecrisToi");
        Rodeur joueurAtk = new Rodeur(10, 50, 0, 10, 0, "joueur1");
        System.out.println(joueurAtk.DecrisToi());
        assertEquals("Chuuut je suis le Rodeur joueur1 niveau 10 je possède 50 de vitalité, 0 de force, 10 d'agilité, 0 d'intelligence !", 
                joueurAtk.DecrisToi());
    }

    /**
     * Test of AttaqueBasique method, of class Rodeur.
     */
    @Test
    public void testAttaqueBasique_Dommages_Egal_Intelligence() 
    {
        System.out.println("AttaqueBasique");
        Rodeur joueurAtk = new Rodeur(10, 50, 0, 10, 0, "joueur1");
        Rodeur joueurDef = new Rodeur(5, 25, 0, 10, 0, "joueur1");
        joueurAtk.AttaqueBasique(joueurDef);
        assertTrue(joueurDef.getVie() == 15);
        
    }

    /**
     * Test of AttaqueSpeciale method, of class Rodeur.
     */
    @Test
    public void testAttaqueSpeciale_Agilite_augmente_05Niveau() 
    {
        System.out.println("AttaqueSpeciale");
        Rodeur joueurAtk = new Rodeur(10, 50, 0, 10, 0, "joueur1");
        Rodeur joueurDef = new Rodeur(10, 50, 0, 0, 10, "joueur1");
        joueurAtk.AttaqueSpeciale(joueurDef);
        joueurAtk.AttaqueBasique(joueurDef);
        assertTrue (joueurDef.getVie() == 35);
        
    }
    
}
