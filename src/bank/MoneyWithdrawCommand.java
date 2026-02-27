/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author CHALA RAMIREZ
 */
public class MoneyWithdrawCommand implements Command {
    protected Account account;
    protected double amount;
    protected String sourceCurrency;
    protected ConversionContext conversionContext;
    private double convertedAmount;
    public MoneyWithdrawCommand(Account account, double amount,
                                String sourceCurrency,
                                ConversionContext conversionContext) {
        this.account = account;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.conversionContext = conversionContext;
    }

    @Override
    public void execute() {
        convertedAmount = conversionContext.convert(amount);
        account.withdraw(convertedAmount);
        System.out.println("Retirado: " + convertedAmount);
    }

    @Override
    public void undo() {
        account.deposit(convertedAmount);
        System.out.println("Retiro revertido: " + convertedAmount);
    }
}
