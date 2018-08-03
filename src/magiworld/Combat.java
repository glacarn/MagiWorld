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
public class Combat 
{
    Scanner sc = new Scanner(System.in);
    
    public Combat (Personnage joueur1, Personnage joueur2)
    {
        while (joueur1.getVie()>0 && joueur2.getVie()>0)
        {
            if (joueur1.getVie() <= 0)
            {
                System.out.println("Joueur 1 a perdu !");
            }
            else
            {
                Attaque(joueur1);
            }
            if (joueur2.getVie() <= 0)
            {
                System.out.println("Joueur 2 a perdu !");
            }
            else
            {
                Attaque(joueur2);
            }          
        }
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
