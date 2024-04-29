package com.dev.api.adacoinapi.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
public class CurrencyQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String currencyCode;

    @Column(nullable = false)
    private String currencyName;

    @Column(nullable = false)
    private BigDecimal bid;

    @Column(nullable = false)
    private BigDecimal ask;

    @Column(nullable = false)
    private Instant timestamp;
}