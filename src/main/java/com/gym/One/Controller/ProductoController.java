package com.gym.One.Controller;
import com.gym.One.Entity.Producto;
import com.gym.One.Services.ProductoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gym.One.DTO.ProductoDTO;
import java.util.*;

@RestController
@RequestMapping("/api/Productos/")
public class ProductoController {
    @Autowired
    private ProductoService ProductoService;
    @GetMapping(value="{id}")
    public ResponseEntity<Object> ObtenerProductoConId(@PathVariable UUID id) {
        try{
            Producto data = ProductoService.ObtenerProductoConId(id);
            ProductoDTO ProductoDTO = new ProductoDTO(data.getId(),data.getNombre(), data.getPrecio(), data.getDescripcion());
            return new ResponseEntity<Object>(ProductoDTO, HttpStatus.OK);
        }
        catch (Exception e){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
