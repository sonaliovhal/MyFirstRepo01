package com.example.VkOneToOne.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PersonEn")
@Data
public class PersonEn {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int Id;
    private String name;
    private String lastname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="policyId")
    private Policy policy;
}
