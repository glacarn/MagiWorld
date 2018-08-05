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
public class Guerrier extends Personnage{

    public Guerrier(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr, Personnage joueurDef) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr, joueurDef);
    }

        @Override
    public void DecrisToi() 
    {
        System.out.println("Woarg je suis le Guerrier "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !");
    }
    
    @Override
    public void AttaqueBasique() 
    {
        System.out.println(joueurAtkStr+" utilise Coup d'Epée et inflige "+ force +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ force +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-force);
    }

    @Override
    public void AttaqueSpeciale() 
    {
        System.out.println(joueurAtkStr+" utilise Coup de Rage et inflige "+ force*2 +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ force*2 +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-force*2);
        System.out.println(joueurAtkStr+" perd "+ force/2 +" points de vie");
        vie = vie - (force/2);
    }
    
}
