package openClosedPrinciple;

public class CalculadoraDePrecos {

    private final TabelaDePreco tabelaDePreco;
    private final TipoDeFrete tipoDeFrete;

    private CalculadoraDePrecos(TabelaDePreco tabelaDePreco, TipoDeFrete tipoDeFrete) {
        this.tabelaDePreco = tabelaDePreco;
        this.tipoDeFrete = tipoDeFrete;
    }

    public double calcula(Compra produto) {
        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = tipoDeFrete.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
