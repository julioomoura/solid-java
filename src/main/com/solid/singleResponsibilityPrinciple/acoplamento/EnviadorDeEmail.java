package main.com.solid.singleResponsibilityPrinciple.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
