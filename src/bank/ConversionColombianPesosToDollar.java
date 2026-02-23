/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author jhuan
 */
public class ConversionColombianPesosToDollar implements IConversionStrategy {
    protected double copToUsdRate;
    
    @Override
    public double convert(double amount) {
        
        return amount * 0.00027;
        
    }
    
    
    
}
