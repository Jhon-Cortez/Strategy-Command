/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Bank {
    private ArrayList<Command> command;
    
    public Bank(ArrayList<Command> command) {
        this.command = command;
    }
    
    public void execute(ArrayList<Command> command) {
        System.out.println("Comando: " + command);
    }
    
    public void addToQueue(ArrayList<Command> command) {
        System.out.println("Comando: " + command);
    }

    public void executeQueue() {
        System.out.println("Comando: " + command);
    }
}
