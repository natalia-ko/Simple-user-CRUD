package com.thisproject.springtest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users", schema = "test")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
