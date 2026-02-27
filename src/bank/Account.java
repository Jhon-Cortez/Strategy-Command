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
        if (id == 0) {
            throw new IllegalArgumentException("id es obligatorio.");
        }
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("ownerName es obligatorio.");
        }
        if (balanceUSD < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }

        this.id = id;
        this.ownerName = ownerName;
        this.balanceUSD = balanceUSD;
    }
    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalanceUSD() {
        return balanceUSD;
    }
    private void validatePositiveAmount(double amountUSD, String opName) {
        if (Double.isNaN(amountUSD) || Double.isInfinite(amountUSD)) {
            throw new IllegalArgumentException("Monto inválido en " + opName + ".");
        }
        if (amountUSD <= 0) {
            throw new IllegalArgumentException("El monto debe ser > 0 en " + opName + ".");
        }
    }

    private void validateSufficientFunds(double amountUSD) {
        if (balanceUSD < amountUSD) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
    }
    public void deposit(double amountUSD) {
        validatePositiveAmount(amountUSD, "deposit");
        balanceUSD += amountUSD;
    }

    public void withdraw(double amountUSD) {
        validatePositiveAmount(amountUSD, "withdraw");
        validateSufficientFunds(amountUSD);
        balanceUSD -= amountUSD;
    }
    public void transfer(Account target, double amountUSD) {
        if (target == null) {
            throw new IllegalArgumentException("Cuenta destino es obligatoria.");
        }
        if (target == this) {
            throw new IllegalArgumentException("No se puede transferir a la misma cuenta.");
        }

        validatePositiveAmount(amountUSD, "transfer");
        validateSufficientFunds(amountUSD);

        this.balanceUSD -= amountUSD;
        target.balanceUSD += amountUSD;
    }
    @Override
    public String toString() {
        return "Account{" +"id=" + id + ", ownerName='" + ownerName + '\'' + ", balanceUSD=" + balanceUSD +'}';
    }
}
