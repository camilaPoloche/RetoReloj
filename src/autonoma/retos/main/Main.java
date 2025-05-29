/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.main;

import autonoma.retos.models.Reloj;

/**
 * Modelo que permite representar la clase prinicipal - main
 * @author Camila
 * @since 20250513
 * @version 1.0
*/
public class Main {
    public static void main(String[] args) {
        //Atributos
        /**
        * Instancia del hilo Reloj
        */
        Thread reloj = new Thread (new Reloj());
        //Inicializa el hilo
        reloj.start();
    }
}
