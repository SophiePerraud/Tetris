/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.ArrayList;
import modele.Jeu;

/**
 *
 * @author Sophie
 */
public class TetrisControler {
  public Jeu jeu;
  protected ArrayList<String> listeEvenement = new ArrayList<String>();
  
  public TetrisControler(Jeu jeu){
  this.jeu = jeu;
    
    this.listeEvenement.add("H");
    this.listeEvenement.add("B");
    this.listeEvenement.add("D");
    this.listeEvenement.add("G");
   }
  
  public void control(String touche) {
    //On notifie le modèle d'une action si le contrôle est bon
    //--------------------------------------------------------
    
    //Si l'opérateur est dans la liste
    if(this.listeEvenement.contains(touche)){
      //Si l'opérateur est = 
      if("B".equals(touche))
        this.jeu.descendrePiece(); //On ordonne au modèle d'afficher le résultat
      
    }
   }
  
}