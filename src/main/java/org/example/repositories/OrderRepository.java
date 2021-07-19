package org.example.repositories;

import org.example.domain.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class OrderRepository {
    private final JdbcTemplate template;
    private final RowMapper<Order> rowMapper = (rs, i) -> new Order(
            rs.getString("userName"),
            rs.getString("password"),
            rs.getString("orderNumber"),
            rs.getLong("amount"),
            rs.getInt("currency"),
            rs.getString("returnURL"),
            rs.getString("dailURL")
    );

    public OrderRepository(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }
}
