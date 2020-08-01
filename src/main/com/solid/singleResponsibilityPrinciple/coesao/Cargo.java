package main.com.solid.singleResponsibilityPrinciple.coesao;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new DezOuVintePorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());

    private RegraDeSalario regra;

    Cargo(RegraDeSalario regra) {
        this.regra = regra;
    }

    public RegraDeSalario getRegra() {
        return regra;
    }
}
