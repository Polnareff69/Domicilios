package com.gym.One.Services;
import com.gym.One.Entity.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoService {

    public Pedido findById(UUID id);
    public Pedido CrearPedido(UUID id, List<UUID> productosIds, Pedido pedido);
}
