package DesafioGFT.desafio4;

public class mainteste{
    public static void main(String[] args){
        class1 letraA = new class1();
        class2 letraB = new class2();
        class3 letraC = new class3();
        class4 letraD = new class4();
        String palavra = "palavra = ";
        palavra += letraA.testador();
        palavra += letraB.testador();
        palavra += letraC.testador();
        palavra += letraD.testador();
        System.out.println(palavra);
    }
}