package com.hack.Hackathon.enities;


import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Order {


    private Long id;
    private Long stockId;
    private String name;
    private Long quantity;
    private OrderType OrderType;
    private BigDecimal price;
    private OrderStatus orderStatus;
    private LocalDate orderData;
    private LocalDateTime lastUpdateTs;

}
