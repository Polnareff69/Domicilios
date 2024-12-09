package com.gym.One.Services;
import com.gym.One.Dao.ClienteDao;
import com.gym.One.Dao.PedidoDao;
import com.gym.One.Dao.ProductoDao;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Pedido;
import com.gym.One.Entity.Producto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PedidoServiceImplement implements PedidoService {
    @Autowired
    private com.gym.One.Dao.PedidoDao PedidoDao;
    @Autowired
    private com.gym.One.Services.ClienteService ClienteService;
    @Autowired
    private com.gym.One.Dao.ClienteDao ClienteDao;
    @Autowired
    private ProductoDao ProductoDao;
    @Autowired
    private ProductoServiceImplement ProductoServiceImplement;

    @Override
    @Transactional
    public Pedido findById(UUID id) {
        return PedidoDao.findById(id).orElse(null);
    }

    public Pedido CrearPedido(UUID clienteId, List<UUID> productosIds, Pedido pedido) {
        Cliente cliente = ClienteDao.getReferenceById(clienteId);
        List<Producto> productos = ProductoServiceImplement.ObtenerProductosConIds(productosIds);
        pedido.setCliente(cliente);
        pedido.setProductos(productos);

        return PedidoDao.save(pedido);
    }
}
