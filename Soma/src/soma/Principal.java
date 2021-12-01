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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poupanca p = new Poupanca(1000);

        double rendimento = p.simulacao(5);
        System.out.println("Redimento " + rendimento);
        

    }

}
