package app;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private  static Calculadora calculadora;

    /**
     * Se ejecuta una sola vez antes de todas las pruebas
     */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass()");
        calculadora = new Calculadora();
    }

    /**
     * Se ejecuta antes de cada prueba, por cada 10 pruebas se ejecuta 10 veces antes de cada prueba
     */
    @Before
    public void before(){
        System.out.println("Before");
    }

    /**
     * Se ejecuta una sola vez despues de todas las pruebas
     */
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass()");

    }

    /**
     * Se ejecuta despues de cada prueba, por cada 10 pruebas se ejecuta 10 veces despues de cada prueba
     */
    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void sumar() {
        int a = 5, b = 6;
        int esperado = 11;
        int obtenido = calculadora.sumar(a,b);
        assertEquals(esperado, obtenido);//Revisa si el resultado esperado es igual al obtenido
    }

    @Test
    public void dividir(){
        int esperado = 2;
        int resultado = calculadora.dividir(5, 2);
        assertEquals(esperado, resultado);
    }

    /**
     * Se verifica que la prueba arroje una excepcion esperada,
     * si no la arroja entonces la prueba se considera fallida
     */
    @Test( expected = ArithmeticException.class)
    public void dividirEntreCero(){
        int esperado = 0;
        int resultado = calculadora.dividir(5, 0);
        assertEquals(esperado, resultado);
    }

    /**
     * Si al hacer la prueba dura mas del tiempo inficado en timeout, la prueba se considera fallida.
     */
    @Test( timeout = 1000)
    public void operacionLarga(){
        int resultado = calculadora.operacionLarga();
        assertEquals(0, resultado);
    }

    @Test
    public void sumarAns(){
        calculadora.sumar(5, 3);
        int resultado = calculadora.getAns();
        int esperado = 8;
        assertEquals(esperado, resultado);
    }

    @Test
    public void restar() {
        int a = 7, b = 3;
        int esperado = 4;
        int obtenido = calculadora.restar(a,b);
        assertEquals(esperado, obtenido);
    }
}