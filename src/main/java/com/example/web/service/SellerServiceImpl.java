package com.example.web.service;

import com.example.web.dto.SellerDTO;
import com.example.web.intrf.SellerService;
import com.example.web.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SellerServiceImpl implements SellerService {
    private final SellerRepository sellerRepository;

    @Override
    public void save(SellerDTO seller) throws SQLException {
        sellerRepository.save(seller.getName());
    }
}
