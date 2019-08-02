package com.sales.api.api.service;

import com.sales.api.api.domain.Product;

public interface ProductService {
    Product save(Product product);

    Iterable<Product> saveList(Iterable<Product> list);

    Product findByProduct_id(Integer id);

    Iterable<Product> findAll();

    void deleteById(Integer id);

    Product update(Integer id, Product product);

}
