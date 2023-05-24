package Aula08;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double peso;
        double excesso ;
        double multa;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o peso dos peixes: ");
        peso = sc.nextDouble();

        excesso = peso - 50.000;

        //calculo para retornar 0 se for numeros negativos
        excesso = (Math.abs(excesso) + excesso)/2;
        System.out.println("o excesso foi de: " + excesso);

        multa = excesso *4.00;

        System.out.println("a multa foi de: " + multa);






    }
}
