package com.gym.One.DTO;
import java.util.UUID;

public class ProductoDTO {
    private UUID id;
    private String Nombre;
    private int Precio;
    private String Descripcion;

    public ProductoDTO(UUID id, String nombre, int precio, String descripcion) {
        this.id = id;
        Nombre = nombre;
        Precio = precio;
        Descripcion = descripcion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
