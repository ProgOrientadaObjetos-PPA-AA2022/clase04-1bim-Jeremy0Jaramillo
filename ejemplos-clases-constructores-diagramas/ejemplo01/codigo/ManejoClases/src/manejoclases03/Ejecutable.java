/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal = new Computadora(32);
        Computadora computadoraPersonal2 = new Computadora("AMD");
        Computadora computadoraPersonal3 = new Computadora("Intel", 48);
        
        
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
      /*  String procesador = "Intel";
        double memoria = 8.2; // se asume que está expresada en GB
        computadoraPersonal.establecerTipoProcesador(procesador);
        computadoraPersonal.establecerMemoria(memoria);
        */
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        computadoraPersonal.establecerTipoProcesador("Ryzen 13");
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());
        
        computadoraPersonal2.establecerMemoria(16);
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal2.obtenerTipoProcesador(),
                computadoraPersonal2.obtenerMemoria());
        
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal3.obtenerTipoProcesador(),
                computadoraPersonal3.obtenerMemoria());
        
    }
}
