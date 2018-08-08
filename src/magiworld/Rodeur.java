/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 * Définit les spécifications du Personnage Rodeur 
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
public class Rodeur extends Personnage 
{

    /**
     * Reprend les attributs de Personnage
     * 
     * @param niveau        : niveau du Rodeur
     * @param vie           : vie du Rodeur
     * @param force         : force du Rodeur
     * @param agilite       : agilite du Rodeur
     * @param intelligence  : intelligence du Rodeur
     * @param joueurAtkStr  : joueur1 ou joueur2
     * 
     * @see Personnage
     */
    public Rodeur(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr);
    }

    
    /**
     * Renvoie un String décrivant le Personnage Rodeur créer avec ses attributs
     * 
     * @return : phrase de description
     * 
     * @see Personnage
     */
    @Override
    public String DecrisToi() 
    {
        return "Chuuut je suis le Rodeur "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !";
    }
    
    
    /**
     * <ul>
     * <li>Attaque basique du Rodeur : Tir à l'arc.</li>
     * <li>inflige en dégats l'équivalent de son agilité.</li>
     * </ul>
     * 
     * @param joueurDef : joueur adverse
     * 
     * @see agilite
     */
    @Override
    public void AttaqueBasique(Personnage joueurDef) 
    {
        System.out.println(joueurAtkStr+" utilise Tir à l'Arc et inflige "+ agilite +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ agilite +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-agilite);
    }

    
    /**
     * <ul>
     * <li>Attaque spéciale du Rodeur : concentration.</li>
     * <li>augmente son agilité d'un équivalent de : niveau/2.</li>
     * </ul>
     * 
     * @param joueurDef : joueur adverse
     * 
     * @see niveau
     * @see agilite
     */
    @Override
    public void AttaqueSpeciale(Personnage joueurDef) {
        System.out.println(joueurAtkStr+" utilise Concentration, son agilité augmente de " + niveau/2);
        agilite = agilite + (niveau/2);
        System.out.println(joueurAtkStr+" a désormais une agilité de "+agilite);
    }
    
}
