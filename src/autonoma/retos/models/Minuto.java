/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.models;

/**
 *
 * @author Camila
 */
public class Minuto extends Thread {
    private int minuto;
    private boolean running = true;

    public Minuto() {
        this.minuto = 0;
    }
    
    @Override
    public void run(){
        while (running) {
            System.out.println("Minuto: "+ this.minuto);
            try {
                Thread.sleep(60000);
                this.minuto ++;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
