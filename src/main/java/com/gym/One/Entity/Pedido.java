package com.gym.One.Entity;
import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name="Pedidos")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    //@jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pedidoid")
    @Id
    private UUID id;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    @Column(name = "direccion")
    private String direccion;

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
