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

    int vieMax = vie;
    public Mage(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr, Personnage joueurDef) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr, joueurDef);       
    }

    @Override
    public void DecrisToi() 
    {
        System.out.println("Abracadabra je suis le Mage "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !");
    }
    
    
    @Override
    public void AttaqueBasique() 
    {
        System.out.println(joueurAtkStr+" utilise Boule de Feu et inflige "+ intelligence +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ intelligence +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-intelligence);
    }

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
