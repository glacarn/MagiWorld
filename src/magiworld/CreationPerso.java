/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import java.util.Scanner;

/**
 *
 * @author Arno
 */
public class CreationPerso {
    
    Scanner sc = new Scanner(System.in);
    /*
    Caracteristique :
        0: classe
        1: niveau
        2: vie
        3: force
        4: agilité
        5: intelligence
    */
    private int [] caracteristique = new int [6];
    
    
    public void CreationPerso (int joueur)
    {
        System.out.println("Création du personnage du Joueur " + joueur);
        boolean classeOk = false;
        do
        {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");        
            caracteristique [0] = sc.nextInt();
            if (caracteristique [0] == 1 || caracteristique [0] == 2 || caracteristique [0] == 3)
            {
                classeOk = true;
            }
            else
            {
                System.out.println("Veuillez choisir entre les 3 propositions");
            }
        }
        while (classeOk != true);
        SelecAllComp();
    }

    
    private void SelectComp (String competence, int comp, int cond)
    {
        boolean compOk = false;
        do
        {
            System.out.println(competence+" du personnage ?");
            caracteristique [comp] = sc.nextInt();
            if (caracteristique [comp] < cond || caracteristique [comp] > 100)
            {
                System.out.println("Vous devez selectionner un chiffre entre "+cond+" et 100");
            }
            else
            {
                compOk = true;
            }
        }
        while (compOk != true);   
    }
    
    
    private void SelecAllComp ()
    {
        boolean selectAllComp = false;
        do
        {
            SelectComp("Niveau", 1, 1);
            caracteristique [2] = caracteristique [1]*5; // vie
            SelectComp("Force", 3, 0);
            SelectComp("Agilité", 4, 0);
            SelectComp("Intelligence", 5, 0);
            if ((caracteristique [3]+caracteristique [4]+caracteristique [5]) !=  caracteristique [1])
            {
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
            }
            else
            {
                selectAllComp = true;
            }
        }
        while (selectAllComp != true);     
    }
    
    
    public int getCaracterisitque (int caract)
    {
        return caracteristique [caract];
    }
}
