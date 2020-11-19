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
public class Excavador extends Zombies{
    
    public Excavador(String tipo, int vida, int damage, int velocidad) {
        super(tipo, vida, damage, velocidad);
        this.Tipo = "Excavador";
        this.Vida = 100;
        this.Damage = 80;
        this.Velocidad = 20;
        
    
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

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    
    
    
}
