package com.gym.One.DTO;

import java.util.List;
import java.util.UUID;

public class PedidoDTO {

    private UUID Id;
    private String Descripcion;
    private Double Total;
    private List<ProductoDTO> productos;

    public PedidoDTO(UUID id, String descripcion, Double total, List<ProductoDTO> productos) {
        this.Id = id;
        this.Descripcion = descripcion;
        this.Total = total;
        this.productos = productos;
    }

    public PedidoDTO(UUID id, String Descripcion, List<ProductoDTO> productos){
        Id = id;
        this.Descripcion = Descripcion;
        this.productos = productos;
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

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDTO> productos) {
        this.productos = productos;
    }
}
