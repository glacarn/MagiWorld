/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Arno
 */
public class VerifScannerTest 
{
    
    public VerifScannerTest() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {System.setOut(new PrintStream(outContent));}
    
    @After
    public void tearDown() {System.setOut(System.out);}
    
    
    /**
     * Test of VerifScanner method, of class VerifScanner.
     */
    @Test
    public void testVerifScanner_Sortie_Int() 
    {
        System.out.println("VerifScanner");
        String question = "";
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        VerifScanner scan = new VerifScanner();
        assertEquals(1, scan.VerifScanner(question));
    }
    
    @Test
    public void testVerifScanner_Sortie_NonInt_MessageErreur() 
    {
        String question = "Sans chiffre!!!";
        System.setIn(new ByteArrayInputStream("a".getBytes()));
        VerifScanner scan = new VerifScanner();
        scan.VerifScanner(question);
        assertEquals(outContent.toString().replace("\r\n", "\n"), "(Veuillez saisir un chiffre) " + question +"\n");
    }
    
}
