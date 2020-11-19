/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Gerson
 */
public class Tablero {
    
    private ArrayList<Casilla> lista_casilla= new ArrayList <Casilla>();

    public ArrayList<Casilla> getLista_casilla() {
        return lista_casilla;
    }

    public void setLista_casilla(ArrayList<Casilla> lista_casilla) {
        this.lista_casilla = lista_casilla;
    }

    public Tablero() {
    }
    
    public void Agregar_Casilla (Casilla casilla){
        lista_casilla.add(casilla);
    }

    @Override
    public String toString() {
        return "Tablero: " + "\nlista de casillas: " + lista_casilla;
    }
    
    public Casilla Retorna_Casilla(int i){
        for (int j = 0; j < lista_casilla.size(); j++) {
            
            if (i==j){
               return lista_casilla.get(i); 
               
            }
                
            
        }
        System.out.println("No existe Casilla");
        return null;
    }
    
}
