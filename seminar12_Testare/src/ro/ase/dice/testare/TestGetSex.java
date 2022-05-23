package ro.ase.dice.testare;

import org.junit.Test;
import ro.ase.dice.clase.Persoana;

import static junit.framework.TestCase.assertEquals;

public class TestGetSex {

    @Test
    public void testRight(){
        Persoana persoana = new Persoana("Andrei","5000521123456");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Mihai", "1000521123456");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2!=0 ? "M":"F", persoana.getSex());
    }

    @Test(expected = CNPInvalidException.class)
    public void testError(){
        Persoana persoana = new Persoana("Flori", "h000521123456");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
        persoana.getSex();
    }

    @Test
    public void testFormatGetSex(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
        assertEquals(1, persoana.getSex().length());
    }

    @Test
    public void testRangeGetSex(){
        Persoana persoana = new Persoana("Flori", "9000521123456");
        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExistanceGetSex(){
        Persoana persoana = new Persoana("Flori", null);
        persoana.getSex();

    }

}
