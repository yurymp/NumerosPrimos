/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import org.junit.Test;
import org.junit.Assert;
//

//import static variables.Principal.*;

/**
 *
 * @author Yury
 */
public class PrincipalSpec {

    @Test
    public void esMayorDeEdadVerdaderoCuandoLaPersonaTiene18() {
        Assert.assertTrue(Principal.esMayorDeEdad(18));
    }

    @Test
    public void esMayorDeEdadVerdaderoCuandoLaPersonaTieneMasDe18() {
        Assert.assertTrue(Principal.esMayorDeEdad(19));
    }
    
    @Test
    public void esMayorDeEdadFalsoCuandoLaPersonaTieneMenosDe18() {
        Assert.assertFalse(Principal.esMayorDeEdad(17));
    }
    
    @Test
    public void sumaDeDosValoresEnterosPositivos() {
        Assert.assertEquals(Principal.suma(5,6), 11);
    }
    
    @Test
    public void elValorAbsolutoEsPositivoConArgumentoNegativo(){
        Assert.assertEquals(Principal.valorAbsoluto(-2), 2);
    }
    
    @Test
    public void elValorAbsolutoEsPositivoConArgumentoPositivo(){
        Assert.assertEquals(Principal.valorAbsoluto(2), 2);
    }
    
    @Test
    public void elValorAbsolutoDeCeroEsCero(){
        Assert.assertEquals(Principal.valorAbsoluto(0), 0);
    }
    
    @Test
    public void elValorIngresadoEsNumeroPrimo(){
        Assert.assertTrue(Principal.esNumeroPrimo(7));
    }
    
    @Test
    public void elValorIngresadoNoEsNumeroPrimo(){
        Assert.assertFalse(Principal.esNumeroPrimo(6));
    }
    
    @Test(expected = ArithmeticException.class)
    public void elValorIngresadoLanzaExcepcionCuandoElNumeroNoEsNatural(){
        Principal.esNumeroPrimo(0);
    }
}
