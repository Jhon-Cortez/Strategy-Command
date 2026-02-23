/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author CHALA RAMIREZ
 */
public class MoneyTransferCommand implements Command{
    protected Account account;
    protected double amount;
    protected String sourceCurrency;
    protected conversionContext conversionContext;

    public MoneyTransferCommand(Account account, double amount, String sourceCurrency, conversionContext conversionContext) {
        this.account = account;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.conversionContext = conversionContext;
    }
    
    @Override
    public void execute() {
        double convertedAmount = conversionContext.convert(amount);
        account.transfer(convertedAmount);
        System.out.println("Transferido: " + convertedAmount);
    }

    @Override
    public void undo() {
        double convertedAmount = conversionContext.convert(amount);
        account.revertTransfer(convertedAmount);
        System.out.println("Transferencia revertida: " + convertedAmount);
    }
    
    public double convert() {
        conversionContext.selectStrategy(sourceCurrency);
        return conversionContext.convertToUSD(amount);
    }  
}