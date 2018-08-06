/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arno
 */
public class CreationPersoTest {
    
    public CreationPersoTest() {
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
     * Test of CreationPerso method, of class CreationPerso.
     */
    @Test
    public void testCreationPerso() 
    {
        System.out.println("CreationPerso");
        String jAtk = "";
        Personnage joueurAtk = null;
        Personnage joueurDef = null;
        CreationPerso instance = new CreationPerso();
        Personnage expResult = null;
        Personnage result = instance.CreationPerso(jAtk, joueurAtk, joueurDef);
        assertEquals(expResult, result);
    }
    
}
