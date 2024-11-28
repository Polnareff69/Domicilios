package com.gym.One.Services;
import com.gym.One.Entity.Cliente;
import java.util.UUID;


public interface ClienteService {
    public Cliente findById(UUID id);
}
