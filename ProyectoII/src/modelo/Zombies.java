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
public abstract class Zombies {
    public String Tipo;
    public int Vida;
    public int Damage;
    public int Velocidad;
   
    
    public Zombies(String tipo, int vida, int damage, int velocidad){
        this.Tipo = tipo;
        this.Vida = vida;
        this.Damage = damage;
        this.Velocidad = velocidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }
    
    public void modificarVidaZ(int num, int opcion){  //La opcion 1 Resta y la opcion 2 Suma, Modificador del int vida
        if (opcion != 0){
            if (opcion % 2 == 0){       
            this.Vida = Vida +num;
            }
            else{
                this.Vida = Vida - num;
            }
        }
    }    
    
    
    
    
}
