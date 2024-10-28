package br.com.alura.models;

import java.time.LocalDate;

public class PerishableProduct extends Products {
    private final LocalDate expirationDate;

    public PerishableProduct(String name, double price, int amount, LocalDate expirationDate) {
        super(name, price, amount);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s\nPreço: R$ %.2f\nQuantidade: %d\nData de validade: %s", getName(), getPrice(), getAmount(), this.expirationDate);
    }
}
