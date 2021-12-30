package com.example.demo.dto;

import com.example.demo.model.ProductoEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductoDTO {

    private int id;
    private String nombre;
    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ProductoDTO getProductoDTO(ProductoEntity productoEntity){
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(productoEntity.getId());
        productoDTO.setNombre(productoEntity.getNombre());
        productoDTO.setPrecio(productoEntity.getPrecio());

        return productoDTO;
    }

    public List<ProductoDTO> getProductoDTOList(List<ProductoEntity> productoList){
        List<ProductoDTO> productoDTOList = new ArrayList<>();

        for(ProductoEntity i : productoList){
            ProductoDTO productoDTO = new ProductoDTO();
            productoDTO.setId(i.getId());
            productoDTO.setNombre(i.getNombre());
            productoDTO.setPrecio(i.getPrecio());
            productoDTOList.add(productoDTO);
        }
        return productoDTOList;
    }

    public ProductoEntity getProductoEntity(ProductoDTO productoDTO){
        ProductoEntity productoEntity = new ProductoEntity();
        productoEntity.setId(productoDTO.getId());
        productoEntity.setNombre(productoDTO.getNombre());
        productoEntity.setPrecio(productoDTO.getPrecio());

        return productoEntity;
    }

}
