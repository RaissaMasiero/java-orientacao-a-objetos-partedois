package model.services;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void geraContrato(Contract contrato, int meses){

        double parcelaBasica = contrato.getValorTotal() / meses;

        for(int i=1; i<=meses; i++){
            LocalDate dataVencimento = contrato.getData().plusMonths(i);

            double juro = onlinePaymentService.juro(parcelaBasica, i);
            double taxa = onlinePaymentService.taxaPagamento(parcelaBasica + juro);
            double cota = parcelaBasica + juro + taxa;

            contrato.getInstallments().add(new Installment(dataVencimento, cota));
        }
    }
}
