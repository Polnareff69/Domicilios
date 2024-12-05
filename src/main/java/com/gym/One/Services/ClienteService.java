package com.gym.One.Services;
import com.gym.One.Entity.Cliente;

import java.util.List;
import java.util.UUID;


public interface ClienteService {
    public List<Cliente> ObtenerTodosLosClientes();
    public Cliente getReferenceById(UUID id);
}
