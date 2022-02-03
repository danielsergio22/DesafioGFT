package DesafioGFT.desafio1;

public class InvestimentoSemIR extends Investimento{

    public InvestimentoSemIR(double a, double b){
        super(a,b);
        if(valorInicial < 1000){
            System.out.print("O valor Inicial não pode ser menor que R$1000");
        }
    }
    @Override
    public double calcularLucro(int meses){
        if(valorInicial < 1000){
            return 0;
        } 
        double elevacao = 1 + jurosMensais;
        elevacao = Math.pow(elevacao,meses);
        resultado = (valorInicial * elevacao) - valorInicial;
        return resultado;
    }
}