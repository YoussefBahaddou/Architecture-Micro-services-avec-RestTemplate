package com.example.car.models;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;


@dataInfo
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO 
{
    private Long id;
    private String nom;  
    private Float age;   
}

