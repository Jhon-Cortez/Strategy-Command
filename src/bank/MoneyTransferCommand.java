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
    protected Account froAccount;
    protected double amount;
    protected Account toAccount;
    protected String sourceCurrency;
    protected conversionContext conversionContext;

    public MoneyTransferCommand(Account froAccount, double amount, Account toAccount, String sourceCurrency, conversionContext conversionContext) {
        this.froAccount = froAccount;
        this.amount = amount;
        this.toAccount = toAccount;
        this.sourceCurrency = sourceCurrency;
        this.conversionContext = conversionContext;
    }
    
    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {
        
    }
    
    public double convert() {
        
    }
    
}
