package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getJurosEmprestimo();

    default double pagamento(double valor, int meses){
        if(meses < 1){
            throw new InvalidParameterException("Mês deve ser maior que zero!");
        }
        return valor * Math.pow(1.0 + getJurosEmprestimo() / 100.0, meses);
    }
}
