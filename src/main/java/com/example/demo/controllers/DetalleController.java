package com.example.demo.controllers;

import com.example.demo.dto.Response;
import com.example.demo.services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalles")
@CrossOrigin(origins = "*")
public class DetalleController {

    @Autowired
    private DetalleService detalleService;

    @GetMapping
    public ResponseEntity<Response> getAllDetalles(){
        Response response = detalleService.findAllDetalles();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getOneDetalle(@PathVariable Integer idDetalle){
        Response response = detalleService.findOneDetalle(idDetalle);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
