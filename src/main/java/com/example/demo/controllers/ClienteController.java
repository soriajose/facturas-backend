package com.example.demo.controllers;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.dto.Response;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Response> getAllClientes(){
        Response response = clienteService.findAllClientes();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getOneCliente(@PathVariable Integer idCliente){
        Response response = clienteService.findOneCliente(idCliente);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Response> postCliente(@RequestBody ClienteDTO clienteDTO){
        Response response = clienteService.saveCliente(clienteDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> putCliente(@PathVariable Integer idCliente, @RequestBody ClienteDTO inputCliente){
        Response response = clienteService.updateCliente(inputCliente);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteCliente(@PathVariable Integer idCliente){
        Response response = clienteService.deleteCliente(idCliente);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
