/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author CHALA RAMIREZ
 */
public class MoneyTransferCommand implements Command {

    private Account fromAccount;
    private Account toAccount;
    private double amount;
    private String sourceCurrency;
    private ConversionContext conversionContext;
    private double convertedAmount;

    public MoneyTransferCommand(Account fromAccount,Account toAccount,double amount,String sourceCurrency,ConversionContext conversionContext) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.conversionContext = conversionContext;
    }

    @Override
    public void execute() {
        conversionContext.selectStrategy(sourceCurrency);
        convertedAmount = conversionContext.convert(amount);
        fromAccount.transfer(toAccount, convertedAmount);
        System.out.println("Transferido: " + convertedAmount);
    }

    @Override
    public void undo() {
        toAccount.transfer(fromAccount, convertedAmount);
        System.out.println("Transferencia revertida: " + convertedAmount);
    }
}