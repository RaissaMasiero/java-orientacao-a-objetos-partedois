package model.entities;

public class Employee implements Comparable<Employee> {

    private String nome;
    private String email;
    private Double salario;

    public Employee(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Employee(String nome, String email, Double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // compara um objeto com outro
    @Override
    public int compareTo(Employee outro) {
        return nome.compareTo(outro.getNome());
    }
}
