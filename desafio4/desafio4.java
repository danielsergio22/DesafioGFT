package DesafioGFT.desafio4;

import java.util.*;
import java.util.stream.Stream;

public class desafio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine();
        ArrayList < Double > numeros = new ArrayList < > ();
        double soma = 0;


        String arrayEntrada[] = entrada.split(" ");

        for (int i = 0; i < arrayEntrada.length; i++) {
            numeros.add(Double.parseDouble(arrayEntrada[i]));
        }

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        System.out.println("O maior número é: " + Collections.max(numeros));

        System.out.println("A soma dos números é: " + soma);

        scan.close();
    }



}