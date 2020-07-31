package openClosedPrinciple;

public class Frete implements TipoDeFrete{
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
