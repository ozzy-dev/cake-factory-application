package com.springboot.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItemDTO {
    private String title;
    private BigDecimal price;
}
