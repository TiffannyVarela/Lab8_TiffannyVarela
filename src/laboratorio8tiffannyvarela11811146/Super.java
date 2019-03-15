/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio8tiffannyvarela11811146;

/**
 *
 * @author tiffa
 */
public class Super extends Hackeo{
    int fallido;

    public Super() {
    }

    public Super(int fallido) {
        this.fallido = fallido;
    }

    public Super(int fallido, String cod, int nivel, int e, String tipo) {
        super(cod, nivel, e, tipo);
        this.fallido = fallido;
    }

    

    public int getFallido() {
        return fallido;
    }

    public void setFallido(int fallido) {
        this.fallido = fallido;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public String toString() {
        return cod;
    }
    
}
