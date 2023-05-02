
package com.avitmat.avitmat.repositorio;

import com.avitmat.avitmat.entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Clientes, String>{
    
    
    
}
