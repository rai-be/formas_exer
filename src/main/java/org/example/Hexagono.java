package org.example;

public class Hexagono implements FormaGeometrica {
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}
