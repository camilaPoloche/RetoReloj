/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.models;
/**
 * Modelo que permite representar un Reloj
 * @author Camila
 * @since 20250513
 * @version 1.0
*/
public class Reloj extends Thread{
    //Atributos
    /**
    * Horas del reloj
    */
    private int horas;
    /**
    * Minutos del reloj
    */
    private int minutos;
    /**
    * Segundos del reloj
    */
    private int segundos;
    /**
    * Indica si se inicio el hilo
    */
    private boolean running = true;

    /**
     * Inicializa los atributos de la clase Reloj
    */
    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    /**
     * Metodo que inicializa el hilo reloj, actualiza las horas, minutos, segundos del reloj
    */
    @Override
    public void run() {
        while (running) {
            System.out.println(horas + ":" + minutos + ":" + segundos);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }
        }
    }

    /**
     * Metodo que detiene que ejecucion del hilo
    */
    public void detener() {
        running = false;
    }
}
