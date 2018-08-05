/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 * Définit les spécifications du Personnage Mage 
 * 
 * <ul>
 * <li>1 : phrase de description du Mage Créé</li>
 * <li>2 : Attaque basique</li>
 * <li>3 : Attaque Spéciale</li>
 * </ul>
 * 
 * @see Personnage
 * @see CreationPerso
 * 
 * @author Arno
 */
public class Mage extends Personnage {

    /**
     * Enregistre la vie intiale du Mage pour l'attaque spéciale
     * 
     * @see AttaqueSpeciale
     */
    int vieMax = vie;
    
    /**
     * Reprend les attributs de Personnage
     * 
     * @param niveau        : niveau du Mage
     * @param vie           : vie du Mage
     * @param force         : force du Mage
     * @param agilite       : agilite du Mage
     * @param intelligence  : intelligence du Mage
     * @param joueurAtkStr  : joueur1 ou joueur2
     * @param joueurDef     : joueur adverse
     * 
     * @see Personnage
     */
    public Mage(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr, Personnage joueurDef) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr, joueurDef);       
    }

    
    /**
     * Renvoie un String décrivant le Personnage Mage créer avec ses attributs
     * 
     * @see Personnage
     */
    @Override
    public void DecrisToi() 
    {
        System.out.println("Abracadabra je suis le Mage "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !");
    }
    
    
    /**
     * <ul>
     * <li>Attaque basique du Mage : Boule de feu.</li>
     * <li>Inflige en dégats l'équivalent de son intelligence.</li>
     * </ul>
     * 
     * @see intelligence
     */
    @Override
    public void AttaqueBasique() 
    {
        System.out.println(joueurAtkStr+" utilise Boule de Feu et inflige "+ intelligence +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ intelligence +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-intelligence);
    }

    
    /**
     * <ul>
     * <li>Attaque spéciale du Mage : Soin.</li>
     * <li>Le joueur se soigne d'une équivalence intelligence*2.</li>
     * </ul>
     * 
     * @see intelligence
     * @see vie
     * @see vieMax
     */
    @Override
    public void AttaqueSpeciale() 
    {
        System.out.println(joueurAtkStr+" utilise Soin et gagne "+ intelligence*2 +" vitalité");
        vie = vie + (intelligence*2);
        if (vie >= vieMax)
        {
            vie = vieMax;
        }
    }

}
