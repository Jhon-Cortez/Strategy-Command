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
        
    }
    
    public void selectStrategy(String sourceCurrency){
        
    }
    
    public double convertToUSD(double amount ){
        
        return amount;
        
    }
    

}
