package DesafioGFT.desafio3;

public class pessoa {
    private String nome;
    private String cargo;
    
    public pessoa(String nome, String cargo){
        this.setNome(nome);
        this.setCargo(cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}