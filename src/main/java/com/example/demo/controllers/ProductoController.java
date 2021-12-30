package com.example.demo.controllers;

import com.example.demo.dto.ProductoDTO;
import com.example.demo.dto.Response;
import com.example.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<Response> getAllProductos(){
        Response response = productoService.findAllProductos();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getOneProducto(@PathVariable Integer id){
        Response response = productoService.findOneProducto(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Response> postProducto(@RequestBody ProductoDTO productoDTO){
        Response response = productoService.saveProducto(productoDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> updateProducto(@PathVariable Integer id, @RequestBody ProductoDTO input){
        Response response = productoService.updateProducto(input);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteProducto(@PathVariable Integer id) {
        Response response = productoService.deleteProducto(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
