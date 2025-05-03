/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retos.models;

/**
 *
 * @author Camila
 */
public class Segundo extends Thread{
    private int segundo;
    private boolean running = true;

    public Segundo () {
        this.segundo = 0;
    }
    
    @Override
    public void run(){
        while (running) {
            System.out.println("Segundo: "+ this.segundo);
            try {
                Thread.sleep(1000);
                this.segundo ++;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
