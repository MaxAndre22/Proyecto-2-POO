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
public abstract class Arma {
    
    public String Nombre;
    public int Rango;     //Alcance
    public int Municion;  //Municion/ cantidad de disparos que podra hacer el jugador 
    public int Damage;    //Daño

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRango() {
        return Rango;
    }

    public void setRango(int Rango) {
        this.Rango = Rango;
    }

    public int getMunicion() {
        return Municion;
    }

    public void setMunicion(int Municion) {
        this.Municion = Municion;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }
    
    
}
