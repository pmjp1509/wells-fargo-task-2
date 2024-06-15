package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Financial_advisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Client> clients;

    // Constructor
    public financial_advisor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Default constructor for JPA
    public financial_advisor() {}

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

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
