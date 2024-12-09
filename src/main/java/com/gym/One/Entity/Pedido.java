package com.gym.One.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;
import java.time.LocalDateTime;

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
    @Column(name = "fechapedido")
    private LocalDateTime FechaPedido;
    @ManyToOne
    @JoinColumn(name = "clienteid") // Asegúrate de que la columna coincida con la base de datos
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
            name = "Pedido_Producto",
            joinColumns = @JoinColumn(name = "pedidoid"),
            inverseJoinColumns = @JoinColumn(name = "productoid")
    )
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaPedido() {
        return FechaPedido;
    }
    public void setFechaPedido(LocalDateTime fechaPedido) {FechaPedido = fechaPedido;}
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
