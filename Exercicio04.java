package Aula08;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int ano, mes,dia, calcDias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos anos voce possui");
        ano = sc.nextInt();
        System.out.println("Digite quantos meses voce possui");
        mes = sc.nextInt();
        System.out.println("Digite quantos dias voce possui");
        dia = sc.nextInt();

        calcDias = (ano * 365) + (mes * 30) + dia;

        System.out.println("sua idade em dias é "+ calcDias);

    }
}
