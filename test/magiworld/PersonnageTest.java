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
public class PersonnageTest {
    
    public PersonnageTest() {
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
     * Test of AttaqueBasique method, of class Personnage.
     */
    @Test
    public void testAttaqueBasique() {
        System.out.println("AttaqueBasique");
        Personnage instance = null;
        instance.AttaqueBasique();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AttaqueSpeciale method, of class Personnage.
     */
    @Test
    public void testAttaqueSpeciale() {
        System.out.println("AttaqueSpeciale");
        Personnage instance = null;
        instance.AttaqueSpeciale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DecrisToi method, of class Personnage.
     */
    @Test
    public void testDecrisToi() {
        System.out.println("DecrisToi");
        Personnage instance = null;
        instance.DecrisToi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVie method, of class Personnage.
     */
    @Test
    public void testGetVie() {
        System.out.println("getVie");
        Personnage instance = null;
        int expResult = 0;
        int result = instance.getVie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVie method, of class Personnage.
     */
    @Test
    public void testSetVie() {
        System.out.println("setVie");
        int vie = 0;
        Personnage instance = null;
        instance.setVie(vie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoueur method, of class Personnage.
     */
    @Test
    public void testGetJoueur() {
        System.out.println("getJoueur");
        Personnage instance = null;
        String expResult = "";
        String result = instance.getJoueur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJoueurDef method, of class Personnage.
     */
    @Test
    public void testSetJoueurDef() {
        System.out.println("setJoueurDef");
        Personnage joueurDef = null;
        Personnage instance = null;
        instance.setJoueurDef(joueurDef);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonnageImpl extends Personnage {

        public PersonnageImpl() {
            super(0, 0, 0, 0, 0, "", null);
        }

        public void AttaqueBasique() {
        }

        public void AttaqueSpeciale() {
        }

        public void DecrisToi() {
        }
    }
    
}
