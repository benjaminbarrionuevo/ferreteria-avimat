
package com.avitmat.avitmat.repositorio;

import com.avitmat.avitmat.entidades.Stock;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepositorio extends JpaRepository<Stock, Integer> {
    
    @Query("SELECT l FROM Stock l WHERE l.rubro = :rubro")
    public Stock buscarPorRubro(@Param("rubro") String rubro);
    
    @Query("SELECT l FROM Stock l WHERE l.normbre = :normbre")
    public List<Stock> buscarPorNombre(@Param("normbre") String normbre);
 
    @Query("SELECT l FROM Stock l WHERE l.cantidad = :cantidad")
    public List<Stock> buscarPorCantidad(@Param("cantidad") Integer cantidad);    
    
    
    
    
}
