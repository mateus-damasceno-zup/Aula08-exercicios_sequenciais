package Aula08;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        double salario;
        double salario_minimo=1212.00;
        double qtd_salario_minimo;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu salario");
        salario=sc.nextDouble();

        qtd_salario_minimo = salario / salario_minimo;

        System.out.printf("voce tem %.2f salarios minimos",qtd_salario_minimo);






    }
}
