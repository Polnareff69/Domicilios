package com.gym.One.Services;

import com.gym.One.Entity.Producto;

import java.util.UUID;

public interface ProductoService {
    public Producto ObtenerProductoConId(UUID id);
}
