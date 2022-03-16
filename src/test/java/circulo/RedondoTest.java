/**
 * Probas para a clase Circulo
 * @author profesor
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author profesor
 */
public class RedondoTest {
    
    public RedondoTest() {
    }
    
    /**
     * Test of setCoordenadaX method, of class Redondo.
     */
    @Test
    public void testSetCoordenadaX() {
        System.out.println("establecerX");
        int valorX = 0;
        Redondo instance = new Redondo();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test of getCoordenadaX method, of class Redondo.
     */
    @Test
    public void testObterX() {
        System.out.println("obterX");
        Redondo instance = new Redondo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoordenadaY method, of class Redondo.
     */
    @Test
    public void testSetCoordenadaY() {
        System.out.println("establecerY");
        int valorY = 0;
        Redondo instance = new Redondo();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test of getCoordenadaY method, of class Redondo.
     */
    @Test
    public void testGetCoordenadaY() {
        System.out.println("obterY");
        Redondo instance = new Redondo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRadio method, of class Redondo.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Redondo instance = new Redondo();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of getRadio method, of class Redondo.
     */
    @Test
    public void testObterRadio() {
        System.out.println("obterRadio");
        Redondo instance = new Redondo(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Redondo.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Redondo instance = new Redondo(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Redondo.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Redondo instance = new Redondo(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterSuperficie method, of class Redondo.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Redondo instance = new Redondo(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Redondo.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Redondo instance = new Redondo();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
