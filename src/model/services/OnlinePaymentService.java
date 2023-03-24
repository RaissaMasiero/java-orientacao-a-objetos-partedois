package model.services;

public interface OnlinePaymentService {

    double taxaPagamento(double valor);
    double juro(double valor, int meses);

}
