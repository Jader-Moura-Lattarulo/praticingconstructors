package br.com.alura.models;

public class Products {
    private final String name;
    private double price;
    private int amount;

    public Products(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s\nPreço: R$ %.2f\nQuantidade: %d", this.name, this.price, this.amount);
    }
}
