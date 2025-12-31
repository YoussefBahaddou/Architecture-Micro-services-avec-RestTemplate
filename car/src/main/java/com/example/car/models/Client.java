package com.example.car.models;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;

@dataInfo
@AllArgsConstructor
@NoArgsConstructor
public class Client 
{
    private Long id;
    private String name;
    private Integer age;
}

