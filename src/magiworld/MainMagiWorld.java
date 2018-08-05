/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import java.util.Scanner;

/**
 * Classe Main du jeux MagiWorld
 * 
 * <p>
 * Jeu de rôle et de combat entre 2 joueurs. 
 * Chaque joueur définit sa classe (Guerrier, Rodeur ou Mage) son niveau et ses compétences (Force, Agilité, Intelligence).
 * </p>
 * 
 * <p>
 * Cette renvoie vers le corps du jeu : classe Game.
 * Elle offre la possibilité de rejouer après la fin d'une partie.
 * </p>
 * 
 * @see Game
 * @see CreationPerso
 * @see Personnage
 * @see Guerrier
 * @see Rodeur
 * @see Mage
 * 
 * @author Arno
 */
public class MainMagiWorld {

    /**
     * Scanner permet d'obtenir la réponse de l'utilisateur sur l'envie de recommancer une partie
     */
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * rejouer offre la possibilité de recommencer une partie si == 'O'.
     * 
     * @see Scanner
     */
    private static char rejouer;
    
    
    /**
     * Point d'entrée du jeux renvoyant vers le corps du jeu, et offrant la possibilité de rejouer.
     * 
     * @param args the command line arguments
     * 
     * @see Game
     */
    public static void main(String[] args) 
    {
        do
        {
            Game jeux = new Game();
            rejouer = 'f';
            do 
            {
                System.out.println("Voulez-vous rejouer? O/N");
                rejouer = sc.next().charAt(0);
            }
            while (rejouer != 'O' && rejouer != 'N');
        }
        while (rejouer == 'O');   
    }
}
