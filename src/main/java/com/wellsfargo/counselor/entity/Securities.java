package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Securities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolios portfolios;

    private String name;
    private String category;
    private LocalDate purchaseDate;
    private BigDecimal purchasePrice;
    private Integer quantity;

    // Constructor
    public Securities(String name, String category, LocalDate purchaseDate, BigDecimal purchasePrice, Integer quantity, Portfolios portfolios) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolios = portfolios;
    }

    // Default constructor for JPA
    public Securities() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Portfolios getPortfolio() {
        return portfolios ;
    }

    public void setPortfolio(Portfolios portfolio) {
        this.portfolios = portfolio;
    }
}
