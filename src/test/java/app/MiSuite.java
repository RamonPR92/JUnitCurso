package app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Para crear una suite de pruebas es necesario establecer la anotacion @RunWith con Suite.class como valor,
 * ademas agregamos la anotacion @SuiteClasses que recibe como parametros las clases donde estan nuestras pruebas,
 * el orden del arreglo definde el orden de nuestras pruebas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculadoraTest.class,
        CalculadoraParametrizadaTest.class
})
public class MiSuite {
}
