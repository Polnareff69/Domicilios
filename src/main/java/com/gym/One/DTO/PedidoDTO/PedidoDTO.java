package com.gym.One.DTO.PedidoDTO;

import java.util.List;
import java.util.UUID;

import com.gym.One.DTO.ProductoDTO;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Pedido;

public class PedidoDTO extends Pedido {

    private UUID Id;
    private String Descripcion;
    private Double Total;
    private List<ProductoDTO> productos;

    private Cliente cliente;

    public PedidoDTO(UUID id, String descripcion, Double total, List<ProductoDTO> productos) {
        this.Id = id;
        this.Descripcion = descripcion;
        this.Total = total;
        this.productos = productos;
    }

    public PedidoDTO(UUID id, String Descripcion, List<ProductoDTO> productos, Cliente cliente){
        Id = id;
        this.Descripcion = Descripcion;
        this.productos = productos;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }

    public List<ProductoDTO> getProductosDTO() {
        return productos;
    }
    public void setProductosDTO(List<ProductoDTO> productos) {
        this.productos = productos;
    }
}
