package com.example.clientservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;

@Entity
@dataInfo
@NoArgsConstructor
@AllArgsConstructor
public class Client 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;

    private String nom;
    private Float age;
}