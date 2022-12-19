package com.rapidtech.demospringboot.singleton;

public class Product {

    private static Product product;
    public static Product getInstance(){
        if (product == null) {
            product = new Product();
        }
        return product;
    }
}
