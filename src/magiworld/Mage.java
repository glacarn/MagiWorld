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
public class Mage extends Personnage {

    public Mage(int niveau, int vie, int force, int agilite, int intelligence) 
    {
        super(niveau, vie, force, agilite, intelligence);
    }

    @Override
    public void AttaqueBasique() 
    {
        System.out.println("Joueur X utilise Boule de Feu et inflige "+ intelligence +" dommages");
        System.out.println("Joueur X perd "+ intelligence +" points de vie");
    }

    @Override
    public void AttaqueSpeciale() 
    {
        System.out.println("Joueur X utilise Soin et gagne "+ vie*2 +" vitalité");
        //A modifier en fonction des pts de vie du départ
    }
    
}
