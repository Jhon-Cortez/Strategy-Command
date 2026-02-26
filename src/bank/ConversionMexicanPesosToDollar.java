/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author jhuan
 */
public class ConversionMexicanPesosToDollar implements IConversionStrategy {
    protected double mxnToUsdRate;
    
    
    
    public ConversionMexicanPesosToDollar(double rate){
        this.mxnToUsdRate = rate;
    }
    
    @Override
    public double convert(double amount) {
        
        return amount * mxnToUsdRate;
        
    }
    
}
