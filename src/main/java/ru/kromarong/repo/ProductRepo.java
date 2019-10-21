package ru.kromarong.repo;

public interface ProductRepo {
    Product findById(int id);
    void add(Product product);
    Iterable<Product> findAll();
}
