package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
@Component
@Proxy(lazy = false)
@Table(name = "users")
public class User {

/*    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;*/

    @Id
    //@Column(unique = true)
    private String username;

    @Column(nullable = false)
    private String name;
    private String lastName;
    private int idDocNumber;
    private String address;
    private int zipCode;
    private String state;
    private String city;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    boolean enable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private Set<Authority> authority;

    public User() {

    }

    public User(String username, String name, String lastName, int idDocNumber, String address, int zipCode,
                String state, String city, String password, boolean enable, Set<Authority> authority) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.idDocNumber = idDocNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.password = password;
        this.enable = enable;
        this.authority = authority;
    }
}
