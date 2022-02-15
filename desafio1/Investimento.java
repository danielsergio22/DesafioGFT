package DesafioGFT.desafio1;
import java.lang.Math;

public abstract class Investimento {
    double valorInicial;
    double jurosMensais;
    double resultado;
    public Investimento(double a, double b){
        valorInicial = a;
        jurosMensais = b;
    }
    public double calcularLucro(int meses){
        double elevacao = 1 + jurosMensais;
        elevacao = Math.pow(elevacao,meses);
        resultado = (valorInicial * elevacao) - valorInicial;
        return resultado;
    }
}
