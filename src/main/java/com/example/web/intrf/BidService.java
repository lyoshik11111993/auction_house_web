package com.example.web.intrf;

import com.example.web.dto.BidDTO;
import com.example.web.dto.SellerDTO;

import java.sql.SQLException;

public interface BidService {
    void save(BidDTO bid) throws SQLException;
}
