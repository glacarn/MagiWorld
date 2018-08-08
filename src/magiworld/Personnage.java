/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 * Personnage est une classe abstraite permettant l'héritage pour les classes Guerrier, Rodeur, Mage
 * 
 * <p>
 * Cette classe permet de définir les grandes lignes des classes de combattant : attributs du personnage et methode attaque
 * </p>
 * 
 * @see Guerrier
 * @see Rodeur
 * @see Mage
 * @see CreationPerso
 * 
 * @author Arno
 */
public abstract class Personnage 
{
    /**
     * niveau du personnage entre 0 et 100
     */
    protected int niveau;
    
    /**
     * vie du personnage = niveau*5
     * @see niveau
     */
    protected int vie;
    
    /**
     * force du personnage entre 1 et 100
     */
    protected int force;
    
    /**
     * agilite du personnage entre 0 et 100
     */
    protected int agilite;
    
    /**
     * intelligence du personnage entre 0 et 100
     */
    protected int intelligence;
    
    /**
     * nom du joueur : joueur1 ou joueur2
     */
    protected String joueurAtkStr;
    
    
    /**
     * Creation du personnage avec les attributs
     * 
     * @param niveau        : niveau du Personnage
     * @param vie           : vie du Personnage
     * @param force         : force du Personnage
     * @param agilite       : agilite du Personnage
     * @param intelligence  : intelligence du Personnage
     * @param joueurAtkStr  : joueur1 ou joueur2
     * 
     * @see niveau
     * @see vie
     * @see force
     * @see agilite
     * @see intelligence
     * @see joueurAtkStr
     */
    public Personnage (int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr)
    {
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.joueurAtkStr = joueurAtkStr;
    }
    
    
    public abstract void AttaqueBasique (Personnage joueurDef);
    
    public abstract void AttaqueSpeciale (Personnage joueurDef);
    
    public abstract String DecrisToi ();
    
    
    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public String getJoueur() {
        return joueurAtkStr;
    }

}
