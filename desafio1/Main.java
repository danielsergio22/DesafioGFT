package DesafioGFT.desafio1;

public class Main{
    public static void main(String[] args){
        InvestimentoComIR calculoComIR = new InvestimentoComIR(4000d,0.012d);
        InvestimentoSemIR calculoSemIR = new InvestimentoSemIR(2000d,0.007d);
        System.out.println(calculoComIR.calcularLucro(17));
        System.out.println(calculoSemIR.calcularLucro(10));
    }
}