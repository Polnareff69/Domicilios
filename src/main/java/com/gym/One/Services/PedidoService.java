package com.gym.One.Services;
import com.gym.One.Entity.Pedido;
import java.util.UUID;

public interface PedidoService {

    public Pedido findById(UUID id);

}
