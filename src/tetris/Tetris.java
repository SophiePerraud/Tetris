/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;


import controleur.TetrisControler;
import javax.swing.SwingUtilities;
import modele.Jeu;
import vue.Menu;

import vue.Vue;

/**
 *
 * @author p0909863
 */
public class Tetris {

    /**
     * @param args the command line arguments
     */
 /*   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
                            
				Vue fenetre = new Vue();
				fenetre.setVisible(true);//On la rend visible
			}
		});

    }
*/
    public static void main(String[] args) {
    
     //Instanciation de notre modèle
    Jeu jeu = new Jeu();
 
    //Création du contrôleur
    TetrisControler controler = new TetrisControler(jeu);
    
    //Création de notre fenêtre avec le contrôleur en paramètre
    Vue vue = new Vue(controler, jeu.getGrille(),jeu.getPieceSuivante());
    
    //Ajout de la fenêtre comme observer de notre modèle
    jeu.addObserver(vue);
   // (new Thread(jeu)).start();
    
    
    Menu m=new Menu(jeu,controler,vue);
  }
}