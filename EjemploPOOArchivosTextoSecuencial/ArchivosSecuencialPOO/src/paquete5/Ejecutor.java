/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreArchivo = "data/hospitales.data";
        
        Hospital hospital1 = new Hospital("Hospital Zaruma", 
                100, 100000);
        Hospital hospital2 = new Hospital("Isidro Ayora", 
                200, 200000);
        Hospital hospital3 = new Hospital("Juan Ignacio", 
                300, 300000);

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hospital1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
        
    }
}
