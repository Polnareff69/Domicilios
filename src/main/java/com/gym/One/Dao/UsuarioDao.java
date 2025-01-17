package com.gym.One.Dao;
import com.gym.One.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioDao extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findById(UUID Id);
}
