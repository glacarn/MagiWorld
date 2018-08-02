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
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        caracteristique [0] = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        caracteristique [1] = sc.nextInt();
        VerifLvl(caracteristique [1]);
        caracteristique [2] = caracteristique [1]*5;
        System.out.println("Force du personnage ?");
        caracteristique [3] = sc.nextInt();
        VerifComp(caracteristique [3]);
        System.out.println("Agilite du personnage ?");
        caracteristique [4] = sc.nextInt();
        VerifComp(caracteristique [4]);
        System.out.println("Intelligence du personnage ?");
        caracteristique [5] = sc.nextInt();
        VerifComp(caracteristique [5]);
        VerifTotal();
    }
    
    private void VerifLvl(int niveau) 
    {
        if (niveau < 1 || niveau > 100)
        {
            System.out.println("Vous devez selectionner un chiffre entre 1 et 100");
        }
    }
    
    private void VerifComp(int comp)
    {
        if (comp < 0 || comp > 100)
        {
            System.out.println("Vous devez selectionner un chiffre entre 0 et 100");
        }
    }
    
    private void VerifTotal ()
    {
        if ((caracteristique [3]+caracteristique [4]+caracteristique [5]) !=  caracteristique [1])
        {
            System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
        }
    }
    
    public int getCaracterisitque (int caract)
    {
        
        return caracteristique [caract];
    }
}
