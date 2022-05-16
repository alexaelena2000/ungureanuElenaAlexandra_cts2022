package ro.ase.dice.testare;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.dice.clase.Matematica;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

//    @Test
//    public void testNou(){
//        fail("Testul a picat");
//    }

    private Matematica matematica;

    //se apeleaza inaintea fiecarui test
    @Before
    public void creeazaObiectMatematica(){
        this.matematica = Matematica.getInstantaMatematica();
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Test
    public void testSumaCorecta(){
        assertEquals(8,matematica.suma(3,5));
    }
    @Test
    public void testSumaNrIdentice(){
        int nr=3;
        assertEquals(6,matematica.suma(nr,nr));
    }

    @Test
    public void testRaportCorect(){
        assertEquals(6,matematica.raport(36,6),0.01);
    }

    @Test
    public void testRaportCuRezultatNumarReal(){
        assertEquals(2.5, matematica.raport(5,2),0.001);
    }

    @Test
    public void testRaportShhouldThrowException(){
        try{
            matematica.raport(56,0);
            fail("Metoda raport nu arunca exceptie");
        } catch(IllegalArgumentException exception){
           // assertTrue(true);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRaportThrowException(){
        matematica.raport(49,0);
    }

    @Test
    public void testVerificaPar(){
        assertTrue(matematica.estePar(2));
        assertFalse(matematica.estePar(3));
        assertTrue(matematica.estePar(-2));
        assertTrue(matematica.estePar(0));
        assertFalse(matematica.estePar(-5));
    }

    @Test
    public void returneazaListaNrPare(){
        assertEquals(4, matematica.nNumerePare(4).size());
    }

    @Test
    public void testListaNumere(){
        List<Integer> lista = matematica.nNumerePare(4);
        for(int i=0;i<4;i++){
           // assertTrue(lista.get(i)%2==0);
            assertTrue(matematica.estePar(lista.get(i)));
        }
    }

    @Test
    public void testListaNrCrescatoare(){
        List<Integer> lista = matematica.nNumerePare(4);
        for(int i=0;i<lista.size()-1;i++){
            assertTrue(lista.get(i) < lista.get(i+1));
        }
    }

    @Test
    public void testListaNull(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaNegative(){
        matematica.nNumerePare(-3);
    }

    @Test
    public void testSingleton(){
        Matematica m = Matematica.getInstantaMatematica();
        assertSame(matematica,m);
    }
}