/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Asus
 */
import java.lang.IllegalArgumentException;
public class Account {
    private int id;
    private String ownerName;
    private double balanceUSD;

    public Account(int id, String ownerName, double balanceUSD) {
       if (id == 0) throw new IllegalArgumentException("id es obligatorio.");
       if (ownerName == null || ownerName.trim().isEmpty()) throw new IllegalArgumentException("ownerName es obligatorio.");
       if (balanceUSD < 0) throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
       
        this.id = id;
        this.ownerName = ownerName;
        this.balanceUSD = balanceUSD;
    }
    
    public double getBalanceUSD() {
        return balanceUSD;
    }

    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    private void validatePositiveAmount(double amountUSD, String opName) {
        if (Double.isNaN(amountUSD) || Double.isInfinite(amountUSD)) {
            throw new IllegalArgumentException("Monto inválido en " + opName + ".");
        }
        if (amountUSD <= 0) {
            throw new IllegalArgumentException("El monto debe ser > 0 en " + opName + ".");
        }
    }

    @Override
    public String toString() {
        return "Account{id='" + id + "', ownerName='" + ownerName + "', balanceUSD=" + balanceUSD + "}";
    }

    void transfer(double convertedAmount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deposit(double convertedAmount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void withdraw(double convertedAmount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void revertTransfer(double convertedAmount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
