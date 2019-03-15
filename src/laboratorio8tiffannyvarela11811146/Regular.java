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
public class Regular extends Hackeo{
    int exitosos;

    public Regular() {
    }

    public Regular(int exitosos) {
        this.exitosos = exitosos;
    }

    public Regular(int exitosos, String cod, int nivel, int e, String tipo) {
        super(cod, nivel, e, tipo);
        this.exitosos = exitosos;
    }


    public int getExitosos() {
        return exitosos;
    }

    public void setExitosos(int exitosos) {
        this.exitosos = exitosos;
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
