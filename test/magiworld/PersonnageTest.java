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
public class PersonnageTest 
{
    
    public PersonnageTest() {
    }


    /**
     * Test of getVie method, of class Personnage.
     */
    @Test
    public void testGetVie() 
    {
        System.out.println("getVie");
        Personnage perso = new Guerrier (10, 50, 10, 0, 0, "joueur1");
        assertEquals(50, perso.getVie());
    }

    /**
     * Test of setVie method, of class Personnage.
     */
    @Test
    public void testSetVie() 
    {
        System.out.println("setVie");
        int vie = 0;
        Personnage perso = new Guerrier (10, 50, 10, 0, 0, "joueur1");
        perso.setVie(30);
        assertEquals(30, perso.getVie());
    }

    /**
     * Test of getJoueur method, of class Personnage.
     */
    @Test
    public void testGetJoueur() 
    {
        System.out.println("getJoueur");
        Personnage perso = new Guerrier (10, 50, 10, 0, 0, "joueur1");
        assertEquals("joueur1", perso.getJoueur());
    }
    
}
