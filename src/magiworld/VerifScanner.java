/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * VerifScanner permet de vérifier que l'entrée est bien de type int
 * 
 * <p>
 * Vérification de l'entrée de type int et repose de la question initialement posé en rajoutant "Veuillez saisir un chiffre" en boucle jusqu'à obtention d'un int
 * </p>
 * 
 * @see Game
 * @see CreationPerso
 * 
 * @author Arno
 */
public class VerifScanner {
    
    /**
    * Scanner permet de récupérer les choix du joueur
    */
    private Scanner sc = new Scanner(System.in);
    
    /**
     * Vérification d'une entrée int par le joueur
     * 
     * @param question : question posé initialement au joueur
     * 
     * @return int répondu par le joueur
     */
    public int VerifScanner (String question)
    {
        Boolean scanOk = false;
        int scan = 0;
        do
        {
            try
            {
                scan = sc.nextInt();
                scanOk = true;
            }
            catch (InputMismatchException e)
            {
                sc.next();
                System.out.println("(Veuillez saisir un chiffre) " + question);
            }
        }
        while (!scanOk);
        return scan;
    }
}
