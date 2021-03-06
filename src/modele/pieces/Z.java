/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.pieces;

import java.awt.Color;
import modele.Bloc;

/**
 *
 * @author p0909863
 */
public class Z extends Piece {

    public Z ()
    {
        super(0,0);
        matrice = new Bloc[2][3];
        largeur=3;
        longueur=2;

        Bloc block = new Bloc(Color.RED);
        
        for(int y=1; y<3; y++)
        {
            block.setPositionX(1);
            block.setPositionY(y);
            matrice[1][y]=block;
        }    
        for(int y=0; y<2; y++)
        {
            block.setPositionX(0);
            block.setPositionY(y);
            matrice[0][y]=block;
        }         
    }
    
        public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }
}
