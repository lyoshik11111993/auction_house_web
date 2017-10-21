package com.example.web.service;

import com.example.web.dto.BidDTO;
import com.example.web.intrf.BidService;
import com.example.web.repository.BidRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BidServiceImpl implements BidService {
    private final BidRepository bidRepository;

    @Override
    public void save(BidDTO bid) throws SQLException {
        bidRepository.save(bid.getSize(), bid.getBuyerId(), bid.getProductId());
    }
}
