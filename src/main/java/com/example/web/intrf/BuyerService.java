package com.example.web.intrf;

import com.example.web.dto.BuyerDTO;
import com.example.web.dto.SellerDTO;

import java.sql.SQLException;

public interface BuyerService {
    void save(BuyerDTO buyer) throws SQLException;
}
