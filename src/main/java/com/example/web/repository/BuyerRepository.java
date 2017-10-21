package com.example.web.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BuyerRepository {
    private final DataSource dataSource;

    public void save(String name) throws SQLException {
        PreparedStatement preparedStatement =
                dataSource.getConnection().prepareStatement("INSERT INTO Buyer (name) VALUES (?)");
        preparedStatement.setString(1, name);
        preparedStatement.execute();
    }
}
