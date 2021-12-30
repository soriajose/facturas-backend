package com.example.demo.services;

import com.example.demo.dto.ProductoDTO;
import com.example.demo.dto.Response;
import com.example.demo.model.ProductoEntity;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Response findAllProductos(){
        Response response = new Response();
        List<ProductoDTO> productoDTOList = new ProductoDTO().getProductoDTOList(productoRepository.findAll());
        response.setData(productoDTOList);
        return response;
    }

    public Response findOneProducto(Integer idProducto){
        Response response = new Response();
        ProductoDTO productoDTO = new ProductoDTO().getProductoDTO(productoRepository.findById(idProducto).get());
        response.setData(productoDTO);

        return response;
    }

    public Response saveProducto(ProductoDTO productoDTO){
        Response response = new Response();
        ProductoEntity productoEntity = new ProductoDTO().getProductoEntity(productoDTO);
        response.setData(productoRepository.save(productoEntity));
        return response;
    }

    public Response updateProducto(ProductoDTO input){
        Response response = new Response();
        ProductoEntity productoEntity = productoRepository.findById(input.getId()).get();
        productoRepository.save(productoEntity);
        response.setData("ok");
        return response;
    }

    public Response deleteProducto(Integer idProducto){
        Response response = new Response();
        productoRepository.delete(productoRepository.getById(idProducto));
        response.setData("ok");
        return response;
    }




}
