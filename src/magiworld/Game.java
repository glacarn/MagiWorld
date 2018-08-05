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
public class Game 
{
    private Scanner sc = new Scanner(System.in);
    private CreationPerso createP = new CreationPerso();
    private Personnage joueur1;
    private Personnage joueur2;

    
    public Game ()
    {
        joueur1 = createP.CreationPerso("Joueur 1", joueur1, joueur2);
        joueur2 = createP.CreationPerso("Joueur 2", joueur2, joueur1);
        joueur1.setJoueurDef(joueur2);
        
        Combat(joueur1, joueur2);
    }
    
    private void Combat (Personnage joueur1, Personnage joueur2)
    {
        while (joueur1.getVie()>0 && joueur2.getVie()>0)
        {
            if (joueur1.getVie()>0)
            { Attaque(joueur1); }
            if (joueur2.getVie()>0 && joueur1.getVie()>0)
            { Attaque(joueur2); }          
        }
        if(joueur1.getVie() <=0 && joueur2.getVie() <=0)
        { System.out.println("Les 2 joueurs ont perdu"); }
        else if (joueur1.getVie()<=0)
        { System.out.println("Joueur 1 a perdu !"); }
        else if (joueur2.getVie()<=0)
        { System.out.println("Joueur 2 a perdu !"); }
    }
    
    
    private void Attaque (Personnage joueurAtk)
    {
        boolean atk = true;
        do
        {        
            System.out.println(joueurAtk.getJoueur()+" ("+joueurAtk.getVie()+" Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            atk = true;
            switch (sc.nextInt()) {
                case 1:
                    joueurAtk.AttaqueBasique();
                    break;
                case 2:
                    joueurAtk.AttaqueSpeciale();
                    break;
                default:
                    System.out.println("Vous devez selectionner 1 ou 2");
                    atk = false;
                    break;
            }
        }
        while (atk != true);
    }
    
    
}
