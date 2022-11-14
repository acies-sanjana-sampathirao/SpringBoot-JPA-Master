package com.example.PropertyManagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Property_Table")
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Property_Title",nullable = false)
    private String title;
    private String description;
    @Column(name = "Name",nullable = false)
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;
}
