package singleResponsibilityPrinciple.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcaoAposGerarNotaFiscal> lista;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNotaFiscal> acaoAposGerarNotaFiscalList) {
        this.lista = acaoAposGerarNotaFiscalList;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (AcaoAposGerarNotaFiscal acaoAposGerarNotaFiscal : lista) {
            acaoAposGerarNotaFiscal.executa(nf);
        }


        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}

