package model.interfaces;

public interface OnlinePaymentService {

    double taxaPagamento(double valor);
    double juro(double valor, int meses);

}
