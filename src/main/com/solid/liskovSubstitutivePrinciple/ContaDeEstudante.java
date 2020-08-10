package main.com.solid.liskovSubstitutivePrinciple;

public class ContaDeEstudante {
    private ManipuladorDeSaldo manipuladorDeSaldo;
    private int milhas;

    public ContaDeEstudante() {
        manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public void rende() {
        throw new RuntimeException("Não pode render");
    }
}
