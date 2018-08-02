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
        joueur1 = ChoixClasse(joueur1, J1);
        createP.CreationPerso(2);
        joueur2 = ChoixClasse(joueur2, J2);
        Combat fight = new Combat (joueur1, joueur2);
    }
    
    private static Personnage ChoixClasse (Personnage joueur, String J0)
    {
        switch (createP.getCaracterisitque(0)) 
        {
            case 1:
                joueur = new Guerrier(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), J0);
                break;
            case 2:
                joueur = new Rodeur(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), J0);
                break;
            case 3:
                joueur = new Mage(createP.getCaracterisitque(1), createP.getCaracterisitque(2),
                        createP.getCaracterisitque(3),createP.getCaracterisitque(4),createP.getCaracterisitque(5), J0);
                break;
            default:
                break;
        }
        joueur.DecrisToi();
        return joueur;
    }
}
