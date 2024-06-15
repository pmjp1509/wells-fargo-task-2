package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Portfolio> portfolios;

    // Constructor
    public Client(String name, String email, Financial_advisor advisor) {
        this.name = name;
        this.email = email;
        this.advisor = advisor;
    }

    // Default constructor for JPA
    public Client() {}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Financial_advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Financial_advisor advisor) {
        this.advisor = advisor;
    }

    public Set<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Set<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
