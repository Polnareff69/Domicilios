package com.gym.One.DTO.PedidoDTO;
import com.gym.One.DTO.ProductoDTO;
import com.gym.One.Entity.Pedido;

import java.util.List;

public class CreatePedidoDTO extends Pedido {

    private List<ProductoDTO> productos;
}
