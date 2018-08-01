/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 *
 * @author Arno
 */
public abstract class Personnage 
{
    protected int niveau;
    protected int vie;
    protected int force;
    protected int agilite;
    protected int intelligence;
    
    public Personnage (int niveau, int vie, int force, int agilite, int intelligence)
    {
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }
    
    public abstract void AttaqueBasique ();
    
    public abstract void AttaqueSpeciale ();
}
