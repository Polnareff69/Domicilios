package com.gym.One.Services;
import com.gym.One.Entity.Cliente;

import java.util.List;
import java.util.UUID;


public interface ClienteService {
    public Cliente findById(UUID id);
    public List<Cliente> ObtenerTodosLosClientes();
}
