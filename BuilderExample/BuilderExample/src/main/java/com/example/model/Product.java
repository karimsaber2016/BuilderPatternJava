package com.example.model;

public class Product {
    private final String name;
    private final double price;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static class ProductBuilder {
        private String name;
        private double price;

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
