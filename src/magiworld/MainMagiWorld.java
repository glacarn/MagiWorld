/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

import java.util.Scanner;

/**
 *
 * @author Arno
 */
public class MainMagiWorld {

    private static char rejouer;
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        do
        {
            Game jeux = new Game();
            rejouer = 'f';
            do 
            {
                System.out.println("Voulez-vous rejouer? O/N");
                rejouer = sc.next().charAt(0);
            }
            while (rejouer != 'O' && rejouer != 'N');
        }
        while (rejouer == 'O');   
    }
}
