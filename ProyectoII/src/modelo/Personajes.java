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
public abstract class Personajes {
    public String Nombre;
    public int Vida;
    public int Damage;
    public int Nivel;
    public double Velocidad;
    
    public Personajes(String nombre, int vida, int damage, int velocidad){
        this.Nombre = nombre;
        this.Vida = vida;
        this.Damage = damage;
        this.Velocidad = velocidad;
        Nivel = 1;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
    
    public int getVida() {
        return Vida;            
        
    }
    
    public void setVida(int vida){
        this.Vida = vida;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    
                
    public void modificarVida(int num, int opcion){  //La opcion 1 Resta y la opcion 2 Suma, Modificador del int vida
        if (opcion !=0){ 
            if (opcion % 2 == 0){       
                this.Vida = Vida +num;
            }
            else{
                    this.Vida = Vida - num;
            }
        }    
    }    
}
