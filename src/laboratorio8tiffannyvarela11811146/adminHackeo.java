/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio8tiffannyvarela11811146;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class adminHackeo {
    private ArrayList<Hackeo> hackeos = new ArrayList();
    private File archivo = null;

    public ArrayList<Hackeo> getHackeos() {
        return hackeos;
    }
    
    public adminHackeo (String path){
        archivo= new File(path);
    }

    public void setHackeos(ArrayList<Hackeo> hackeos) {
        this.hackeos = hackeos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "hackeos=" + hackeos + '}';
    }
    
    public void addHackeos (Hackeo h){
        this.hackeos.add(h);
    }
    
    
    public void cargarArchivo(){
        try {
            hackeos = new ArrayList();
            Hackeo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hackeo) objeto.readObject()) != null) {                        
                        hackeos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hackeo t : hackeos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
