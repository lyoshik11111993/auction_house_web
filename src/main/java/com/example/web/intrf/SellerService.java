package com.example.web.intrf;

import com.example.web.dto.SellerDTO;

import java.sql.SQLException;

public interface SellerService {
    void save(SellerDTO seller) throws SQLException;
}
