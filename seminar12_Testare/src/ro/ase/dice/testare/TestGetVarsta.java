package ro.ase.dice.testare;

import org.junit.Test;
import ro.ase.dice.clase.Persoana;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestGetVarsta {
    @Test
    public void testRightM(){
        Persoana persoana = new Persoana("Andrei", "198120328123");
        assertEquals(23,persoana.getVarsta());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Mihai", "3000101407216");
        assertEquals(222,persoana.getVarsta());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana p = new Persoana("Florina", "6220101072169");
        assertEquals(0,p.getVarsta());
    }
    @Test(expected = CNPInvalidException.class)
    public void testError(){
        Persoana p = new Persoana("Florina", "6230101072169");
        p.getVarsta();
    }
    @Test(timeout = 100)
    public void testPerformanceGetVarsta(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
        persoana.getVarsta();
    }
    @Test
    public void testFormatGetVarsta(){
        Persoana persoana = new Persoana("Flori", "6000521123456");
       // assertEquals(true, persoana.getVarsta()>=0);
        assertTrue(persoana.getVarsta()>=0);
    }

    @Test
    public void testOrderingGetVarsta(){
        Persoana p1 = new Persoana("Marin", "2950521123456");
        Persoana p2 = new Persoana("Marin", "6020521123456");
        assertTrue(p1.getVarsta() > p2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistanceGetVarsta(){
        Persoana p1 = new Persoana("Marin", null);
        p1.getVarsta();
    }
}
