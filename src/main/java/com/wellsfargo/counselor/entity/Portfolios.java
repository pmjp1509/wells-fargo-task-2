package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Security> securities;

    private Float totalValue;

    // Constructor
    public Portfolio(Client client, Float totalValue) {
        this.client = client;
        this.totalValue = totalValue;
    }

    // Default constructor for JPA
    public Portfolio() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }

    public Float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Float totalValue) {
        this.totalValue = totalValue;
    }
}
