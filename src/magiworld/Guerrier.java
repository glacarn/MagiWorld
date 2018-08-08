/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 * Définit les spécifications du Personnage Guerrier 
 * 
 * <ul>
 * <li>1 : phrase de description du Guerrier Créé</li>
 * <li>2 : Attaque basique</li>
 * <li>3 : Attaque Spéciale</li>
 * </ul>
 * 
 * @see Personnage
 * @see CreationPerso
 * 
 * @author Arno
 */
public class Guerrier extends Personnage{

    /**
     * Reprend les attributs de Personnage
     * 
     * @param niveau        : niveau du Guerrier
     * @param vie           : vie du Guerrier
     * @param force         : force du Guerrier
     * @param agilite       : agilite du Guerrier
     * @param intelligence  : intelligence du Guerrier
     * @param joueurAtkStr  : joueur1 ou joueur2
     * 
     * @see Personnage
     */
    public Guerrier(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr);
    }

    
    /**
     * Renvoie un String décrivant le Personnage Guerrieur créer avec ses attributs
     * 
     * @return : phrase de description
     * 
     * @see Personnage
     */
        @Override
    public String DecrisToi() 
    {
        return "Woarg je suis le Guerrier "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !";
    }
    
    
    /**
     * <ul>
     * <li>Attaque basique du Guerrier : Coup d'épée.</li>
     * <li>Inflige en dégats l'équivalent de sa force.</li>
     * </ul>
     * 
     * @param joueurDef : joueur adverse
     * 
     * @see force
     */
    @Override
    public void AttaqueBasique(Personnage joueurDef) 
    {
        System.out.println(joueurAtkStr+" utilise Coup d'Epée et inflige "+ force +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ force +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-force);
    }

    
    /**
     * <ul>
     * <li>Attaque spéciale du Guerrier : Coup de rage.</li>
     * <li>Inflige en dégats l'équivalent de sa force*2.</li>
     * <li>Perd vie l'équivalent de sa force/2.</li>
     * </ul>
     * 
     * @param joueurDef : joueur adverse
     * 
     * @see force
     * @see vie
     */
    @Override
    public void AttaqueSpeciale(Personnage joueurDef) 
    {
        System.out.println(joueurAtkStr+" utilise Coup de Rage et inflige "+ force*2 +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ force*2 +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-force*2);
        System.out.println(joueurAtkStr+" perd "+ force/2 +" points de vie");
        vie = vie - (force/2);
    }
    
}
