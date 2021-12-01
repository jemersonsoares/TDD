/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma;

/**
 *
 * @author SUP08
 */
public class Poupanca {
    private double saldo=0;
    private int tempoMes=0;
    private double rendimento=0.05;
    
    /**
     * @param tempo 
     * @return simulacao do rendimento
     */
     
    public double simulacao(int tempo){
        this.saldo=saldo;
        this.tempoMes=tempo;
        
        return saldo* (rendimento*tempo);
        
    }

    /**
     * @param saldo
     */
    public Poupanca(double saldo) {
        this.saldo=saldo;
    }
    
    
}
