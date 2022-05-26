package DesafioGFT.desafio2;

import java.util.*;

public class desafio2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Integer> numeros = new ArrayList <> ();
            List<Integer> numeros10 = new ArrayList <> ();
            List<Integer> numeros50 = new ArrayList <> ();

            for (int i = 0; i < 10; i++) {
                int numero = scan.nextInt();
                if(!numeros.contains(numero)){
                    numeros.add(numero);
                }
            }

            for (int i = 0; i < numeros.size(); i++) {
                
                if(numeros.get(i) > 10) {
                    numeros10.add(numeros.get(i));
                }
                
                if(numeros.get(i) > 50) {
                    numeros50.add(numeros.get(i));
                }
                
            }
            Collections.sort(numeros10);
            Collections.sort(numeros50);

            int max = Collections.max(numeros);
            int min = Collections.min(numeros);
            System.out.println("o maior é: " + max);
            System.out.println("o menor é: " + min);
            

            System.out.println("tem " + numeros10.size() + " maiores de 10");
            System.out.println("tem " + numeros50.size() + " maiores de 50");
            System.out.println("Os maiores de 10 são: " +  numeros10);
            System.out.println("Os maiores de 50 são: " + numeros50);

    }
}