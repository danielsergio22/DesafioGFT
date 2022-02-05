package DesafioGFT.desafio3;

import java.util.Scanner;

public class mainteste{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String cargo = "Sênior";
        int starters = 0;
        int juniors = 0;
        int seniors = 0;
        for(int i=0; i<5 ; i++){
            System.out.println("Informe o nome da "+(1+i)+"º pessoa: ");
            String pessoa = scan.nextLine();
                System.out.println("Informe o cargo da "+(1+i)+"º pessoa (Starter,Junior ou Sênior): ");
                cargo = scan.nextLine();
            /*if(!pessoa.equalsIgnoreCase("Starter") || !pessoa.equalsIgnoreCase("Junior") || !pessoa.equalsIgnoreCase("Sênior")){
                cargo = "Sênior";
            }*/
            pessoa usuario = new pessoa(pessoa,cargo);
            //switch(cargo)
            if(cargo == "Starter"){
                    starters++;
                } else
            if(cargo == "Junior"){
                juniors++;
            } else
            if(cargo == "Sênior"){
                seniors++;
            }
                /*case "Starter": 
                starters++;
                return;
                case "Junior": 
                    juniors++;
                return;
                case "Sênior": 
                    seniors++;
                return;
            }*/
        }
        System.out.println("Tolta de pessoas");
        System.out.println("Starter: " + starters);
        System.out.println("Junior: " + juniors);
        System.out.println("Sênior: " + seniors);
    }
}