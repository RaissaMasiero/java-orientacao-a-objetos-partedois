package model.services;

public class BrazilInterestService implements InterestService{

    private double jurosEmprestimo;

    public BrazilInterestService(double jurosEmprestimo) {
        this.jurosEmprestimo = jurosEmprestimo;
    }

    @Override
    public double getJurosEmprestimo() {
        return jurosEmprestimo;
    }
}
