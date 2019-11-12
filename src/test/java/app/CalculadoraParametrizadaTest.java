package app;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

/**
 *Por medio de la anotacion @RunWith indicamos que las pruebas van a ser parametrizadas con Parameterized.class,
 * debemos declarar un metodo que cargue las lista de parametros, requiere la anotacion @Parameters y cumplir con la firma
 * public static Iterable<Object>[cualquier nombre], se retorna una lista de parametros que cumplan con los parametros del
 * constructor de la clase, cada elemento de la lista es una prueba
 */
@RunWith(Parameterized.class)
public class CalculadoraParametrizadaTest {

    private int a;
    private int b;
    private  int esperado;

    @Parameters
    public static Iterable<Object> runWith(){
        return Arrays.asList(new Object[][]{
                {3,4,7}, {5, 7, 12}, {2, 9, 11}
        });
    }

    public CalculadoraParametrizadaTest(int a, int b, int esperado){
        this.a = a;
        this.b = b;
        this.esperado = esperado;
    }

    @Test
    public void suma(){
        Calculadora calculadora = new Calculadora();
        assertEquals(esperado, calculadora.sumar(a, b));
    }
}
