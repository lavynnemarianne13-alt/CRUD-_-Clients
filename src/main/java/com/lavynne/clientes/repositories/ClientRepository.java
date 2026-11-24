package com.lavynne.clientes.repositories;
import com.lavynne.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
