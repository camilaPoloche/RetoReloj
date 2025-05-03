/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.models;

import javax.swing.SwingUtilities;

/**
 *
 * @author Camila
 */
public class Hora extends Thread{
    private int hora;
    private boolean running = true;

    public Hora() {
        this.hora = 0;
    }
    
    @Override
    public void run(){
        while (running) {
            System.out.println("Hora: "+ this.hora);
            try {
                Thread.sleep(3600000);
                this.hora ++;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
