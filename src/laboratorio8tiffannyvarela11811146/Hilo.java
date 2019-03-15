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

import javax.swing.JProgressBar;
public class Hilo extends Thread{
    private JProgressBar progBar;
    int tam;
    int duracion;
    int result;
    private boolean avanzar;
    private boolean vive;

    public Hilo(JProgressBar progBar, int tam, int duracion) {
        this.progBar = progBar;
        this.vive=true;
        this.avanzar=true;
        this.tam = tam;
        this.duracion = duracion;
        this.result=duracion*tam;
    }

    
    
    
    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    
    @Override
    public void run() {
        progBar.setValue(0);
        int temp=0;
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue()+duracion/2);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }
}
