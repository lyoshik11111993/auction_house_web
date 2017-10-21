package com.example.web.service;

import com.example.web.dto.ProductDTO;
import com.example.web.intrf.ProductService;
import com.example.web.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void save(ProductDTO product) throws SQLException {
        productRepository.save(product.getName(), product.getSellerId());
    }
}
