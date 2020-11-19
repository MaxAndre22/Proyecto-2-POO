/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author maxim
 */
public class Item {
    public int Sanacion;        //Le dan vida al jugador
    public int Balas;           //Aumentan la municion de armas
    public int experiencia;     //Sirve para aumentar el nivel del jugador 

    public int getSanacion() {
        return Sanacion;
    }

    public void setSanacion(int Sanacion) {
        this.Sanacion = Sanacion;
    }

    public int getBalas() {
        return Balas;
    }

    public void setBalas(int Balas) {
        this.Balas = Balas;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
}
