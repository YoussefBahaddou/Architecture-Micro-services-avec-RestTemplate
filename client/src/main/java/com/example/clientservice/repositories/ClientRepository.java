package com.example.clientservice.repositories;

import com.example.clientservice.entities.Client;
import org.springframework.dataInfo.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  
public interface ClientRepository extends JpaRepository<Client, Long> 
{
    
}