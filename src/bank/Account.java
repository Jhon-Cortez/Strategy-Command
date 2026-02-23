/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Asus
 */
public class Account {
    private int id;
    private String ownerName;
    private double balanceUSD;

    public Account(int id, String ownerName, double balanceUSD) {
       if (id == null || id.trim().isEmpty()) throw new IllegalArgumentException("id es obligatorio.");
       if (ownerName == null || ownerName.trim().isEmpty()) throw new IllegalArgumentException("ownerName es obligatorio.");
       if (initialBalance < 0) throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
       
        this.id = id;
        this.ownerName = ownerName;
        this.balanceUSD = balanceUSD;
    }
    
       public double getBalanceUSD() {
        return balanceUSD;
    }

    public String getId() {
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
}
