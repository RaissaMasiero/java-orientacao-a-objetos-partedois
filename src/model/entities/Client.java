package model.entities;

import java.util.Objects;

public class Client {

    private String nome;
    private String email;

    public Client(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(nome, client.nome) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
