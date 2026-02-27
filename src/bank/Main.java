/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author rikyf
 */
public class Main {

    public static void main(String[] args) {

        // Crear cuentas (Receiver)

        Account cuenta1 = new Account(1, "Jhon", 1000);
        Account cuenta2 = new Account(2, "Brayan", 500);


        // Crear context (Strategy)
        ConversionContext context = new ConversionContext();

        // Crear invoker
        Bank bank = new Bank();

   
        // Crear comandos
        Command depositCommand = new MoneyDepositCommand(cuenta1,100000, "COL",context);

        Command withdrawCommand = new MoneyWithdrawCommand(cuenta1,50000,"COL",context);

        Command transferCommand = new MoneyTransferCommand(cuenta1,cuenta2,20000,"COL",context);


        // Ejecutar comandos
        System.out.println("Estado inicial de la cuenta");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("Deposito");
        bank.executeCommand(depositCommand);

        System.out.println("Retiro");
        bank.executeCommand(withdrawCommand);

        System.out.println("Transeferencia");
        bank.executeCommand(transferCommand);

        // Probar undo manual
        System.out.println("Transferencia revertida");
        transferCommand.undo();

        // 7. Estado final
        System.out.println("Estado de la cuenta");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
