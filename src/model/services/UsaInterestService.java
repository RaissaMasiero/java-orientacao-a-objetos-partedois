package model.services;

import model.interfaces.InterestService;

public class UsaInterestService implements InterestService {

    private double jurosEmprestimo;

    public UsaInterestService(double jurosEmprestimo) {
        this.jurosEmprestimo = jurosEmprestimo;
    }

    @Override
    public double getJurosEmprestimo() {
        return jurosEmprestimo;
    }
}
