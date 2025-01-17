package com.gym.One.Controller;
import com.gym.One.Entity.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gym.One.DTO.ClienteDTO.CreateClienteDTO;
import java.util.*;


@RestController
@RequestMapping("/api/v1")

public class ClienteController {
    @Autowired
    private com.gym.One.Services.ClienteService ClienteService;
    @GetMapping(value="/cliente/")
    public ResponseEntity<Object> ObtenerTodosLosClientes(){
        try {
            List<Cliente> data = ClienteService.ObtenerTodosLosClientes();
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        }
        catch (Exception e){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Transactional
    @GetMapping(value="/cliente/{id}")
    public ResponseEntity<Object> GetReferenceById(@PathVariable UUID id){
        try{
            Cliente data = ClienteService.getReferenceById(id);
            CreateClienteDTO CreateClienteDTO = new CreateClienteDTO(data.getId(), data.getNombre(), data.getDireccion());
            return new ResponseEntity<Object>(CreateClienteDTO, HttpStatus.OK);
        }
        catch (Exception e){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

