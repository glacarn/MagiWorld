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
        Attaque(joueur1, joueur2);
    }
    
    
    private void Attaque (Personnage joueurAtk, Personnage joueurDef)
    {
        boolean atk = true;
        do
        {        
            System.out.println(joueurAtk.getJoueur()+" ("+joueurAtk.getVie()+" Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            if (sc.nextInt() == 1)
            {
                joueurAtk.AttaqueBasique();
            }
            else if (sc.nextInt() ==2 )
            {
                joueurAtk.AttaqueSpeciale();
            }
            else
            {
                System.out.println("Vous devez selectionner 1 ou 2");
                atk = false;
            }
        }
        while (atk != true);
    }
}
