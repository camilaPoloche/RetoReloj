/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.main;

import autonoma.retos.models.Hora;
import autonoma.retos.models.Minuto;
import autonoma.retos.models.Segundo;

/**
 *
 * @author Camila
 */
public class Main {
    public static void main(String[] args) {
        Thread hora = new Thread(new Hora());
        Thread minuto = new Thread(new Minuto());
        Thread segundo = new Thread(new Segundo());
        hora.start();
        minuto.start();
        segundo.start();
    }
}
