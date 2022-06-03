/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Edgar Espinoza
 */
public class EscrituraArchivoSecuencial {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registroHospital;
    private ArrayList<Hospital> listaHospital;
    
    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHospital(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaHospital().size() > 0) {
                for (int i = 0; i < obtenerListaHospital().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospital().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void establecerRegistroHospital(Hospital h) {
        registroHospital = h;
    }
    
    public void establecerSalida() {
        try {
            salida.writeObject(registroHospital); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    
    public void establecerListaHospital() {
        LecturaArchivoSecuencial l = 
                new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerHospital();
        listaHospital = l.obtenerHospital();
    }
    
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerListaHospital() {
        return listaHospital;
    }
    
    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    }
    
}
