package org.example;

public class Circulo implements FormaGeometrica {
    private double raio;
    private static final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }
}
