package main.com.solid.liskovSubstitutivePrinciple;

public class ContaComum {

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        manipuladorDeSaldo.deposita(valor);
    }

    public void rende() {
        manipuladorDeSaldo.rende(0.01);
    }
}
