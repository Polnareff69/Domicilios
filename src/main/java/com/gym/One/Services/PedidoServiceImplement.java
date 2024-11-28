package com.gym.One.Services;
import com.gym.One.Dao.PedidoDao;
import com.gym.One.Entity.Pedido;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class PedidoServiceImplement implements PedidoService {
    @Autowired
    private com.gym.One.Dao.PedidoDao PedidoDao;

    @Override
    @Transactional
    public Pedido findById(UUID id) {
        return PedidoDao.findById(id).orElse(null);
    }

}
