/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;


/**
 * Game est le corps du jeu, création des personnages et combat
 * 
 * <p>
 * Dans un premier temps, cette classe renvoie à CreationPerso pour la gestion de la création des combattants. 
 * Puis elle gère le combat des personnages définit.
 * </p>
 * 
 * @see CreationPerso
 * @see Personnage
 * @see Combat
 * @see Attaque
 * 
 * @author Arno
 */
public class Game 
{
    /**
     * VerifScanner permet de récupérer les réponses concernant l'attaque choisie
     */
    private VerifScanner scan = new VerifScanner();
    
    /**
     * Initialisation de la classe CreationPerso afin de gérer la création des personnages
     * 
     * @see CreationPerso
     */
    private CreationPerso createP = new CreationPerso();
    
    /**
     * Initialisation du personnage joueur1, il sera définit par CreationPerso
     * 
     * @see CreationPerso
     */
    private Personnage joueur1;
    
    /**
     * Initialisation du personnage joueur2, il sera définit par CreationPerso
     * 
     * @see CreationPerso
     */
    private Personnage joueur2;

    
    /**
     * Gère la création des personnages et du combat
     * 
     * <ul>
     * <li>1 : Créer un personnage pour chaque joueur et envoie la gestion de la création des personnages à CreationPerso</li>
     * <li>2 : Lance le combat via la classe Combat</li>
     * </ul>
     * 
     * @see CreationPerso
     * @see Combat
     */
    public Game ()
    {
        joueur1 = createP.CreationPerso("Joueur 1", joueur1);
        joueur2 = createP.CreationPerso("Joueur 2", joueur2);
        
        Combat(joueur1, joueur2);
    }
    
    
    /**
     * Gère les attaques de chaque joueur à tour de rôle jusqu'a défaite de l'un d'entre eux
     * 
     * @param joueur1
     * @param joueur2 
     * 
     * @see Attaque
     */
    private void Combat (Personnage joueur1, Personnage joueur2)
    {
        while (joueur1.getVie()>0 && joueur2.getVie()>0)
        {
            if (joueur1.getVie()>0)
            { Attaque(joueur1, joueur2); }
            if (joueur2.getVie()>0 && joueur1.getVie()>0)
            { Attaque(joueur2, joueur1); }          
        }
        if(joueur1.getVie() <=0 && joueur2.getVie() <=0)
        { System.out.println("Les 2 joueurs ont perdu"); }
        else if (joueur1.getVie()<=0)
        { System.out.println("Joueur 1 a perdu !"); }
        else if (joueur2.getVie()<=0)
        { System.out.println("Joueur 2 a perdu !"); }
    }
    
    
    /**
     * Récupère le choix du joueur attaquant et lance l'attaque correspondante en fonction de la classe du joueur
     * 
     * @param joueurAtk : joueur attaquant
     * 
     * @see Personnage
     * @see Guerrier
     * @see Rodeur
     * @see Mage
     */
    private void Attaque (Personnage joueurAtk, Personnage joueurDef)
    {
        boolean atk = true;
        do
        {   
            String question = joueurAtk.getJoueur()+" ("+joueurAtk.getVie()+" Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)";
            System.out.println(question);
            atk = true;
            switch (scan.VerifScanner(question)) 
            {
                case 1:
                    joueurAtk.AttaqueBasique(joueurDef);
                    break;
                case 2:
                    joueurAtk.AttaqueSpeciale(joueurDef);
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
