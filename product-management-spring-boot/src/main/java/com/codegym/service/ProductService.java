package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{
    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }
    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        iProductRepository.deleteById(id);
    }
}
