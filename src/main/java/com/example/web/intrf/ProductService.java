package com.example.web.intrf;

import com.example.web.dto.ProductDTO;
import com.example.web.dto.SellerDTO;

import java.sql.SQLException;

public interface ProductService {
    void save(ProductDTO product) throws SQLException;
}
