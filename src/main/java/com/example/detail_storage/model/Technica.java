package com.example.detail_storage.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "technica")
public class Technica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    @Check(constraints = "cost >= 0")
    private Double cost;

    private String brand;

    @ManyToMany
    @JoinTable
    private Set<Detail> details;


}
