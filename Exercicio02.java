package Aula08;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu peso em quilos");
        peso = sc.nextDouble();

        System.out.println("digite sua altura em metros");
        altura = sc.nextDouble();

        imc = peso /Math.pow(altura,altura);

        System.out.printf("seu IMC é de: %.3f", imc);

    }
}
