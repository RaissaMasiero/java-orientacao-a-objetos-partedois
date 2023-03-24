package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double taxaPagamento(double valor) {
        return valor * 0.02;
    }

    @Override
    public double juro(double valor, int meses) {
        return valor * 0.01 * meses;
    }
}
