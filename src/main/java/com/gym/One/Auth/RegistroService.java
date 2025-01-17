package com.gym.One.Auth;

import com.gym.One.Dao.ClienteDao;
import com.gym.One.Dao.UsuarioDao;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Rol;
import com.gym.One.Entity.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;



@Service
public class RegistroService {

    @Autowired
    private ClienteDao clienteRepository;  // Repositorio para la tabla clientes

    @Autowired
    private UsuarioDao usuarioRepository;  // Repositorio para la tabla usuarios

    @Transactional  // Asegura que ambas operaciones se realicen como una transacción
    public Usuario registrarClienteYUsuario(String nombre, String direccion, String correo, String password) {
        // Crear un nuevo cliente
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setNumeroPedidos((short) 0);  // Asumimos que un cliente nuevo tiene 0 pedidos
        clienteRepository.save(cliente);  // Guarda al cliente

        // Crear el usuario
        Usuario usuario = new Usuario();
        usuario.setCliente(cliente);  // Asocia el cliente con el usuario
        usuario.setCorreo(correo);
        usuario.setNombre(nombre);
        usuario.setDireccion(direccion);
        usuario.setPassword(password);  // Debes cifrar la contraseña
        usuario.setRol(Rol.USER);  // Asignamos un rol por defecto
        usuarioRepository.save(usuario);  // Guarda al usuario

        return usuario;
    }

 }

