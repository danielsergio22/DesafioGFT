package DesafioGFT.desafio1;

public class InvestimentoComIR extends Investimento{

    public InvestimentoComIR(double a, double b){
        super(a,b);
    }

    @Override
    public double calcularLucro(int meses){
        double elevacao = 1 + jurosMensais;
        elevacao = Math.pow(elevacao,meses);
        resultado = (valorInicial * elevacao) - valorInicial;

        if(meses < 6){
            resultado -= (resultado * 0.225);
        } else if(meses >= 6 && meses < 12){
            resultado -= (resultado * 0.2);
        } else if(meses >= 12 && meses < 24){
            resultado -= (resultado * 0.175);
        } else if(meses >= 24){
            resultado -= (resultado * 0.15);
        }
        return resultado;
    }
}