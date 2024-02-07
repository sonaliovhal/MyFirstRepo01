package com.example.VkOneToOne.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Policy_Info")
@Data
public class Policy {
    @Id
    @GeneratedValue
    private int policyId;
    private String policyName;
    private String status;
    @OneToOne(mappedBy = "policy")
    private PersonEn personEn;
}
