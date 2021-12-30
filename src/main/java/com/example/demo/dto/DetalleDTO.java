package com.example.demo.dto;

import com.example.demo.model.DetalleEntity;

import java.util.ArrayList;
import java.util.List;

public class DetalleDTO {

    private int id;
    private int cantidad;
    private int productoId;
    private int facturaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public DetalleDTO getClienteDTO(DetalleEntity detalleEntity){

        DetalleDTO detalleDTO = new DetalleDTO();
        detalleDTO.setId(detalleEntity.getId());
        detalleDTO.setCantidad(detalleEntity.getCantidad());
        detalleDTO.setProductoId(detalleEntity.getProductoId());
        detalleDTO.setFacturaId(detalleEntity.getFacturaId());

        return detalleDTO;
    }

    public List<DetalleDTO> getDetalleDTOList(List<DetalleEntity> detalleEntityList){
        List<DetalleDTO> detalleDTOList = new ArrayList<>();
        for(DetalleEntity i: detalleEntityList){
            DetalleDTO detalleDTO = new DetalleDTO();
            detalleDTO.setId(i.getId());
            detalleDTO.setCantidad(i.getCantidad());
            detalleDTO.setProductoId(i.getProductoId());
            detalleDTO.setFacturaId(i.getProductoId());
            detalleDTOList.add(detalleDTO);
        }
        return detalleDTOList;
    }

    public DetalleDTO getDetalleDTO(DetalleEntity detalleEntity){
        DetalleDTO detalleDTO = new DetalleDTO();
        detalleDTO.setId(detalleEntity.getId());
        detalleDTO.setCantidad(detalleEntity.getCantidad());
        detalleDTO.setProductoId(detalleEntity.getProductoId());
        detalleDTO.setFacturaId(detalleEntity.getFacturaId());

        return detalleDTO;
    }

    public DetalleEntity getDetalleEntity(DetalleDTO detalleDTO){
        DetalleEntity detalleEntity = new DetalleEntity();
        detalleEntity.setId(detalleDTO.getId());
        detalleEntity.setCantidad(detalleDTO.getCantidad());
        detalleEntity.setProductoId(detalleDTO.getProductoId());
        detalleEntity.setFacturaId(detalleDTO.getFacturaId());

        return detalleEntity;
    }


}
