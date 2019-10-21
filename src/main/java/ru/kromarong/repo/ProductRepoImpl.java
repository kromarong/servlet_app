package ru.kromarong.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepoImpl implements ProductRepo {
    private List<Product> productList;


    public ProductRepoImpl() {
        productList = new ArrayList<>();
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void add(Product product) {
        this.productList.add(product);
    }

    @Override
    public Iterable<Product> findAll() {
        return productList;
    }
}
