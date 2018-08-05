/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;


/**
 * Gère l'intégralité de la création d'un joueur
 * 
 * <p>
 * Gère le choix de la classe choisi par le joueur et les compétences qu'il aura (Niveau, Force, Agilité, Intelligence)
 * </p>
 * 
 * @see ChoixClasse
 * @see SelectAllComp
 * 
 * @author Arno
 */
public class CreationPerso {
    
    /**
    * VerifScanner permet de récupérer les choix du joueur concernant la création de son personnage
    * 
    * @see VerifScanner
     */
    private VerifScanner scan = new VerifScanner();
    
    /**
     * 
     * Caracteristique recueille toutes les caractéristiques du personnage à créer :
     * <ul>
     *   <li>0: classe</li>
     *   <li>1: niveau</li>
     *   <li>2: vie</li>
     *   <li>3: force</li>
     *   <li>4: agilité</li>
     *   <li>5: intelligence</li>
     * </ul>
     * 
     * @see Personnage
     */
    private int [] caracteristique = new int [6];
    
    /**
     * Gère le choix de la classe et des compétences
     * 
     * <ul>
     * <li>1 : Envoie la gestion de la création de la classe à ChoixClasse.</li>
     * <li>2 : Envoie la gestion de la selection des compétences à SelectAllComp.</li>
     * </ul>
     * 
     * @param jAtk      : "joueur 1" ou "joueur 2"
     * @param joueurAtk : personnage du joueur à créer
     * @param joueurDef : personnage du joueur adverse
     * 
     * @return Personnage à créer
     * 
     * @see ChoixClasse
     * @see SelectAllComp
     */
    public Personnage CreationPerso (String jAtk, Personnage joueurAtk, Personnage joueurDef)
    {
        System.out.println("Création du personnage du " + jAtk);
        ChoixClasse();
        SelectAllComp();
        return ChoixClasse(jAtk,joueurAtk, joueurDef);
    }

    /**
     * Gère la selection de la classe choisi par le joueur (Guerrier, Rodeur ou Mage), 
     * remplit caracteristique [0]
     * 
     * @see caracteristique
     */
    private void ChoixClasse ()
    {        
        boolean classeOk = false;
        do
        {
            String question = "Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)";
            System.out.println(question);        
            caracteristique [0] = scan.VerifScanner(question);
            if (caracteristique [0] == 1 || caracteristique [0] == 2 || caracteristique [0] == 3)
            {
                classeOk = true;
            }
            else
            {
                System.out.println("Veuillez choisir entre les 3 propositions");
            }
        }
        while (classeOk != true);
    }
    
    /**
     * Gère la selection de toutes les compétences par l'intermédiaire de SelectComp
     * 
     * @see caracteristique
     * @see SelectComp
     */
    private void SelectAllComp ()
    {
        boolean selectAllComp = false;
        do
        {
            SelectComp("Niveau", 1, 1);
            caracteristique [2] = caracteristique [1]*5; // vie
            SelectComp("Force", 3, 0);
            SelectComp("Agilité", 4, 0);
            SelectComp("Intelligence", 5, 0);
            if ((caracteristique [3]+ caracteristique [4]+caracteristique [5]) !=  caracteristique [1])
            {
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
            }
            else
            {
                selectAllComp = true;
            }
        }
        while (selectAllComp != true);     
    }
    
    /**
     * Gère la question et la réponse pour chaque compétences du personnage
     * 
     * <p>
     * Remplit le tableau caracteristique [i] avec toutes la compétence
     * </p>
     * 
     * @param competence    : nom de la compétence à choisir
     * @param comp          : numero de la compétence
     * @param cond          : condition inférieur (1 pour le niveau, 0 pour le reste)
     * 
     * @see caracteristique
     * @see SelectAllComp
     */
    private void SelectComp (String competence, int comp, int cond)
    {
        boolean compOk = false;
        do
        {
            String question = competence+" du personnage ?";
            System.out.println(question);
            caracteristique [comp] = scan.VerifScanner(question);
            if (caracteristique [comp] < cond || caracteristique [comp] > 100)
            {
                System.out.println("Vous devez selectionner un chiffre entre "+cond+" et 100");
            }
            else
            {
                compOk = true;
            }
        }
        while (compOk != true);   
    }
    
    
    /**
     * Choisi la classe en fonction de caracteristique [0] et créer le personnage choisi. 
     * Renvoi la phrases du personnage le décrivant
     * 
     * @param jAtk      : joueur en train de créer son personnage
     * @param joueurAtk : joueur en train de créer son personnage
     * @param joueurDef : joueur advserse
     * 
     * @return joueurAtk : personnage à créer suite aux réponses du joueur
     * 
     * @see ChoixClasse
     * @see Personnage
     */
    private Personnage ChoixClasse (String jAtk, Personnage joueurAtk, Personnage joueurDef)
    {
        switch (caracteristique[0]) 
        {
            case 1:
                joueurAtk = new Guerrier(caracteristique[1], caracteristique[2],
                        caracteristique[3],caracteristique[4],caracteristique[5], jAtk, joueurDef);
                break;
            case 2:
                joueurAtk = new Rodeur(caracteristique[1], caracteristique[2],
                        caracteristique[3],caracteristique[4],caracteristique[5], jAtk, joueurDef);
                break;
            case 3:
                joueurAtk = new Mage(caracteristique[1], caracteristique[2],
                        caracteristique[3],caracteristique[4],caracteristique[5], jAtk, joueurDef);
                break;
            default:
                break;
        }
        joueurAtk.DecrisToi();
        return joueurAtk;
    }
}
