/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.Test;
import static org.junit.Assert.*;
import tipo.conta.Poupanca;

/**
 *
 * @author SUP08
 */
public class TesteSoma {

    public TesteSoma() {
    }

    @Test

    public void soma() {
        Poupanca p = new Poupanca(1000);

        double rendimento = p.simulacao(5);      
       
        assertEquals(250.0, rendimento, 0);
    }

}
