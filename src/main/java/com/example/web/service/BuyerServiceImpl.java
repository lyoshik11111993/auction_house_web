package com.example.web.service;

import com.example.web.dto.BuyerDTO;
import com.example.web.intrf.BuyerService;
import com.example.web.repository.BuyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BuyerServiceImpl implements BuyerService {
    private final BuyerRepository buyerRepository;

    @Override
    public void save(BuyerDTO buyer) throws SQLException {
        buyerRepository.save(buyer.getName());
    }
}
