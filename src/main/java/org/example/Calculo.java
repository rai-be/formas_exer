package org.example;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma forma geometrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Hexagono");
        System.out.println("5 - Circulo");

        int escolha = scanner.nextInt();
        FormaGeometrica forma = null;

        if (escolha == 1) {
            System.out.print("Digite o valor do lado do quadrado: ");
            double ladoQuadrado = scanner.nextDouble();
            forma = new Quadrado(ladoQuadrado);
        } else if (escolha == 2) {
            System.out.print("Digite a largura do retangulo: ");
            double larguraRetangulo = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            double alturaRetangulo = scanner.nextDouble();
            forma = new Retangulo(larguraRetangulo, alturaRetangulo);
        } else if (escolha == 3) {
            System.out.print("Digite a base do Triangulo: ");
            double baseTriangulo = scanner.nextDouble();
            System.out.print("Digite a altura do triangulo: ");
            double alturaTriangulo = scanner.nextDouble();
            forma = new Triangulo(baseTriangulo, alturaTriangulo);
        } else if (escolha == 4) {
            System.out.print("Digite o valor do lado do hexagono: ");
            double ladoHexagono = scanner.nextDouble();
            forma = new Hexagono(ladoHexagono);
        } else if (escolha == 5) {
            System.out.print("Digite o valor do raio do circulo: ");
            double raioCirculo = scanner.nextDouble();
            forma = new Circulo(raioCirculo);
        } else {
            System.out.println("Invalido");
            System.exit(0);
        }

        double area = forma.calcularArea();
        System.out.println("A area da forma é: " + area);
    }
}
