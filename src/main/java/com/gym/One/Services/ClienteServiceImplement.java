package com.gym.One.Services;
import com.gym.One.Dao.ClienteDao;
import com.gym.One.Entity.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteServiceImplement implements ClienteService{
    @Autowired
    private com.gym.One.Dao.ClienteDao ClienteDao;
    @Override
    @Transactional
    public Cliente findById(UUID id){
        return ClienteDao.findById(id).orElse(null);
    }
    public List<Cliente> ObtenerTodosLosClientes() { return ClienteDao.findAll(); }
}
