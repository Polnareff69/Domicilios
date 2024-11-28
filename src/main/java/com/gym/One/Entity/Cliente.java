package com.gym.One.Entity;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.util.UUID;

//Indica al sistema que esta clase es una tabla de base de datos
@Entity
@Table(name="Clientes")

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "clienteid")
    @Id
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "nombre")
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Column(name= "Direccion")
    private String Direccion;

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Column(name = "numpedidos")
    private short NumeroPedidos;

    public short getNumeroPedidos() {
        return NumeroPedidos;
    }

    public void setNumeroPedidos(short numeroPedidos) {
        NumeroPedidos = numeroPedidos;
    }

    @Column(name = "correo")
    private String Correo;

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    @Column(name = "Celular")
    private long Celular;

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long celular) {
        Celular = celular;
    }
}
