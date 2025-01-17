package com.gym.One.DTO.ClienteDTO;
import java.util.UUID;

public class CreateClienteDTO {
    private UUID id;
    private String nombre;
    private String direccion;

    public CreateClienteDTO(UUID id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
