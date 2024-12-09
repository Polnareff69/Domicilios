package com.gym.One.Services;

import com.gym.One.Entity.Producto;

import java.util.List;
import java.util.UUID;

public interface ProductoService {
    public Producto ObtenerProductoConId(UUID id);
    public List<Producto> ObtenerProductosConIds(List<UUID> ids);
}
