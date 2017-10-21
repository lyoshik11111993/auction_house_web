package com.example.web.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BidRepository {
    private final DataSource dataSource;

    public void save(int size, int buyerId, int productId) throws SQLException {
        PreparedStatement preparedStatement =
                dataSource.getConnection()
                        .prepareStatement("INSERT INTO bid (size, buyer_id, product_id) VALUES (?, ?, ?)");
        preparedStatement.setInt(1, size);
        preparedStatement.setInt(2, buyerId);
        preparedStatement.setInt(3, productId);
        preparedStatement.execute();
    }
}
