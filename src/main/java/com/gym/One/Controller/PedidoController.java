package com.gym.One.Controller;
import com.gym.One.Entity.Pedido;
import com.gym.One.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1")
public class PedidoController {

    @Autowired
    private com.gym.One.Services.PedidoService PedidoService;
    @GetMapping(value="/pedido/{id}")
    public ResponseEntity<Object> getById(@PathVariable UUID id){
        try {
            Pedido data  = PedidoService.findById(id);
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        }
        catch (Exception e) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/{clienteId}/pedidos")
    public Pedido crearPedido(@PathVariable UUID clienteId,
                              @RequestParam List<UUID> productosIds,
                              @RequestBody Pedido pedido) {
        return PedidoService.CrearPedido(clienteId, productosIds, pedido);
    }
}
