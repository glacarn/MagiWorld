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
public class Rodeur extends Personnage 
{

    public Rodeur(int niveau, int vie, int force, int agilite, int intelligence, String joueurAtkStr, Personnage joueurDef) 
    {
        super(niveau, vie, force, agilite, intelligence, joueurAtkStr, joueurDef);
    }

    @Override
    public void DecrisToi() 
    {
        System.out.println("Chuuut je suis le Rodeur "+joueurAtkStr+" niveau "+niveau+" je possède "+vie+" de vitalité, "+force+" de force, "+agilite+" d'agilité, "+intelligence+" d'intelligence !");
    }
    
    @Override
    public void AttaqueBasique() 
    {
        System.out.println(joueurAtkStr+" utilise Tir à l'Arc et inflige "+ agilite +" dommages");
        System.out.println(joueurDef.getJoueur()+" perd "+ agilite +" points de vie");
        joueurDef.setVie(joueurDef.getVie()-agilite);
    }

    @Override
    public void AttaqueSpeciale() {
        System.out.println(joueurAtkStr+" utilise Concentration, son agilité augmente de " + niveau/2);
        agilite = agilite + (niveau/2);
        System.out.println(joueurAtkStr+" a désormais une agilité de "+agilite);
    }
    
}
