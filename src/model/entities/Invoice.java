package model.entities;

public class Invoice {

    //Invoice: fatura

    private Double pagamentoBasico;
    private Double imposto;

    public Invoice(){}

    public Invoice(Double pagamentoBasico, Double imposto) {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getTotalPagamento(){
        return getPagamentoBasico() + getImposto();
    }
}
