package com.hack.Hackathon.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExecuteOrderDTO {

    public String stockName;
    public Long executionQuantity;
    public BigDecimal price;

}
