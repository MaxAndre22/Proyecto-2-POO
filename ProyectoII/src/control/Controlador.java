/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import modelo.*;
import vista.Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Gerson
 */
public class Controlador {
    
    private Tablero tablero;

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Controlador() {
        this.tablero=new Tablero();
    }

    
    
}
