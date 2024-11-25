package org.example;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FormaGeometricaTest {

    @Test
    public void testQuadrado() {
        Quadrado quadrado = new Quadrado(2);
        double resultado = quadrado.calcularArea();
        assertEquals(4, resultado, 0.01);
    }

    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo(3, 4);
        double resultado = retangulo.calcularArea();
        assertEquals(12, resultado, 0.01);
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo(4, 5);
        double resultado = triangulo.calcularArea();
        assertEquals(10, resultado, 0.01);
    }

    @Test
    public void testHexagono() {
        Hexagono hexagono = new Hexagono(2);
        double resultado = hexagono.calcularArea();
        assertEquals(10.392304845413264, resultado, 0.01);
    }


    @Test
    public void testCirculo() {
        Circulo circulo = new Circulo(3);
        double resultado = circulo.calcularArea();
        assertEquals(28.26, resultado, 0.01);
    }
}
