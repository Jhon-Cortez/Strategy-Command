/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author jhuan
 */
public class ConversionEuroToDollar implements IConversionStrategy{
    
    protected double eurToUsdRate;
    

    public ConversionEuroToDollar(double rate){
        
    }
    
     @Override
    public double convert(double amount) {
        
        return amount * 1.18;
 
    }

    
}
