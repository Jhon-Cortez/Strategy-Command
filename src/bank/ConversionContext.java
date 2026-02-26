/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author jhuan
 */
public class ConversionContext {
    protected IConversionStrategy strategy;
    protected String baseCurrency;
    
    
    public ConversionContext(){
        
    }
    
    public void setStratey(IConversionStrategy strategy){
        this.strategy = strategy;
    }
    
    public void selectStrategy(String sourceCurrency){
        switch (sourceCurrency.toUpperCase()) {
        case "MXN":
            this.strategy = new ConversionMexicanPesosToDollar(0.058);
            break;
        case "COL":
            this.strategy = new ConversionColombianPesosToDollar(0.00027); 
            break;
        case "EUR":
            this.strategy = new ConversionEuroToDollar(1.18);
            break;
        default:
            throw new IllegalArgumentException("Moneda no soportada: " + sourceCurrency);
        }
    }
    
    public double convertToUSD(double amount ){
        
        return amount;
        
    }

    double convert(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
