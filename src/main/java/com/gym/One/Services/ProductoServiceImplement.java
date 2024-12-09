package com.gym.One.Services;
import com.gym.One.Dao.ClienteDao;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Producto;
import com.gym.One.Dao.ProductoDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductoServiceImplement implements ProductoService {
    @Autowired
    private ProductoDao ProductoDao;
    @Override
    @Transactional
    public Producto ObtenerProductoConId(UUID id){ return ProductoDao.getReferenceById(id); }
    @Override
    @Transactional
    public List<Producto> ObtenerProductosConIds(List<UUID> ids){
        List<Producto> Productos = new ArrayList<>();
        for(UUID id: ids){
            Producto producto = ProductoDao.getReferenceById(id);
            Productos.add(producto);
        }
        return Productos;
    }
}
