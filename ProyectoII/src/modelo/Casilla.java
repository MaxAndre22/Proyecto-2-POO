/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gerson
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Casilla {
    JLabel lblcasilla;
    Color color= new Color (0,152,170);;
    Tipo_Casilla tipo;

    public Casilla() {
        
        this.lblcasilla=new JLabel("");
        this.lblcasilla.setBackground(color);
        this.lblcasilla.setOpaque(true);
        this.tipo=tipo.casilla_libre;
    }
    
    public Casilla(int i) {
        
        this.lblcasilla=new JLabel(i+"");
        this.lblcasilla.setBackground(color);
        this.lblcasilla.setOpaque(true);
        this.tipo=tipo.casilla_libre;
    }
    
    public Casilla(JLabel lblcasilla, Color color) {
        this.lblcasilla = lblcasilla;
        this.color = color;
    }

    public JLabel getLblcasilla() {
        return lblcasilla;
    }

    public void setLblcasilla(JLabel lblcasilla) {
        this.lblcasilla = lblcasilla;
    }
    
    public void set_texto_Lblcasilla(String lblcasilla) {
        this.lblcasilla.setText(lblcasilla);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Casilla #" + lblcasilla.getText()+"\n";
    }

    private void lblcasilla(java.awt.event.MouseEvent evt){
        System.out.println(this.toString());
    }
    
    
    
}
