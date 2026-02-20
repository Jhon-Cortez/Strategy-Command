/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author CHALA RAMIREZ
 */
public class MoneyDepositCommand implements Command {
    protected Account account;
    protected double amount;
    protected String sourceCurrency;
    protected ConversionContext conversionContext;

    public MoneyDepositCommand(Account account, double amount, String sourceCurrency, ConversionContext conversionContext) {
        this.account = account;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.conversionContext = conversionContext;
    }
    
    @Override
    public void execute() {
        double amountUSD = convert();
        account.deposit(amountUSD);
    }

    @Override
    public void undo() {
        double amountUSD = convert();
    }
    
    public double convert() {
        conversionContext.selectStrategy(sourceCurrency);
        return conversionContext.convertToUSD(amount);
    }
}
