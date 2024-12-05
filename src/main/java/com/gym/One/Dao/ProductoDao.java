package com.gym.One.Dao;
import com.gym.One.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProductoDao extends JpaRepository<Producto, UUID>{

}