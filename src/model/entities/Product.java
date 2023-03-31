package model.entities;

public class Product implements Comparable<Product>{

    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static void atualizaPrecoEstatico(Product p){
        p.setPreco(p.getPreco() * 1.1);
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preco);
    }

    @Override
    public int compareTo(Product other) {
        return nome.toUpperCase().compareTo(other.getNome().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (!nome.equals(product.nome)) return false;
        return preco.equals(product.preco);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + preco.hashCode();
        return result;
    }
}
