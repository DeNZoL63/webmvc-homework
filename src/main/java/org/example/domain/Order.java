package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String userName;
    private String password;
    private String orderNumber;
    private long amount;
    private int currency;
    private String returnURL;
    private String failURL;
}
