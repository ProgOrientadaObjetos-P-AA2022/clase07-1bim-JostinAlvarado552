/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public Hospital (String n, int numC, double pre){
        
        nombre = n;
        numeroCamas = numC;
        presupuesto = pre;
        
    }
    
    public void establecerNombre(String n){
        
        nombre = n;
        
    }
    public void establecerNumeroCamas(int num){
        
        numeroCamas = num;
        
    }
    public void establecerPresupuesto(double pre){
        
       presupuesto = pre;
        
    }
    public String obtenerNombre(){
        
        return nombre;
        
    }
    public int obtenerNumeroCamas(){
        
        return numeroCamas;
        
    }
    public double obtenerPresupuesto(){
        
        return presupuesto ;
        
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s-%s-%s\n", obtenerNombre(), obtenerNumeroCamas(),   
                obtenerPresupuesto());
        return cadena;
    }
}