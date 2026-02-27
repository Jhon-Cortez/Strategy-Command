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
    private IConversionStrategy strategy;
    public ConversionContext() {
    }

    public void setStrategy(IConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public void selectStrategy(String sourceCurrency) {
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

    public double convert(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No se ha seleccionado estrategia de conversión.");
        }
        return strategy.convert(amount);
    }
}