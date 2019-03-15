/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio8tiffannyvarela11811146;

import java.io.Serializable;

/**
 *
 * @author tiffa
 */
public class Hackeo implements Serializable{
    String cod;
    int nivel;
    int e;
    String tipo;
    
    public Hackeo() {
    }

    public Hackeo(String cod, int nivel, int e, String tipo) {
        this.cod = cod;
        this.nivel = nivel;
        this.e = e;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
    
    

    private static final long SerialVersionUID=777L;
    
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

    
    
    
}
