package com.example.demo.controllers;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.dto.Response;
import com.example.demo.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturas")
@CrossOrigin(origins = "*")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public ResponseEntity<Response> getAllFacturas(){
        Response response = facturaService.findAllFacturas();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getOneFactura(@PathVariable Integer idFactura){
        Response response = facturaService.findOneFactura(idFactura);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Response> postCliente(@RequestBody FacturaDTO facturaDTO){
        Response response = facturaService.saveFactura(facturaDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> putCliente(@PathVariable Integer idFactura, @RequestBody FacturaDTO inputFactura){
        Response response = facturaService.updateFactura(inputFactura);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteCliente(@PathVariable Integer idFactura){
        Response response = facturaService.deleteFactura(idFactura);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
