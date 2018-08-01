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
    
    private int classe;
    private int niveau;
    private int force;
    private int agilite;
    private int intelligence;
    Scanner sc = new Scanner(System.in);
    
    public void CreationPerso (int joueur)
    {
        System.out.println("Création du personnage du Joueur " + joueur);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        classe = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        niveau = sc.nextInt();
        VerifLvl(niveau);
        System.out.println("Force du personnage ?");
        force = sc.nextInt();
        VerifComp(force);
        System.out.println("Agilite du personnage ?");
        agilite = sc.nextInt();
        VerifComp(agilite);
        System.out.println("Intelligence du personnage ?");
        intelligence = sc.nextInt();
        VerifComp(intelligence);
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
        if ((force+agilite+intelligence) !=  niveau)
        {
            System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
        }
    }
}
