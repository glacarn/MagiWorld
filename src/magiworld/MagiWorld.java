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
public class MagiWorld {

    private static CreationPerso createP = new CreationPerso();
    private static Personnage joueur1;
    private static Personnage joueur2;
    private static String J1 = "Joueur 1";
    private static String J2 = "Joueur 2";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        createP.CreationPerso(1);
        joueur1 = ChoixClasse(J1, joueur1, J2, joueur2);
        createP.CreationPerso(2);
        joueur2 = ChoixClasse(J2, joueur2, J1, joueur1);
        joueur1.setJoueurDef(joueur2);
        Combat fight = new Combat (joueur1, joueur2);
    }
   
    
    private static Personnage ChoixClasse (String jAtk, Personnage joueurAtk, String jDef, Personnage joueurDef)
    {
        switch (createP.getCaracterisitque(0)) 
        {
            case 1:
                joueurAtk = new Guerrier(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), jAtk, jDef, joueurDef);
                break;
            case 2:
                joueurAtk = new Rodeur(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), jAtk, jDef, joueurDef);
                break;
            case 3:
                joueurAtk = new Mage(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), jAtk, jDef, joueurDef);
                break;
            default:
                break;
        }
        joueurAtk.DecrisToi();
        return joueurAtk;
    }
}
