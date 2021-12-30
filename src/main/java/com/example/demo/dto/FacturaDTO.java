package com.example.demo.dto;

import com.example.demo.model.FacturaEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FacturaDTO {

    private int id;
    private int folio;
    private String descripcion;
    private String observacion;
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fechaNacimiento) {
        this.fecha = fecha;
    }

    public FacturaDTO getFacturaDTO(FacturaEntity facturaEntity){
        FacturaDTO facturaDTO = new FacturaDTO();
        facturaDTO.setFolio(facturaEntity.getFolio());
        facturaDTO.setDescripcion(facturaEntity.getDescripcion());
        facturaDTO.setObservacion(facturaEntity.getObservacion());
        facturaDTO.setFecha(facturaEntity.getFecha());

        return facturaDTO;
    }

    public List<FacturaDTO> getFacturaDTOList(List<FacturaEntity> facturaEntityList){
        List<FacturaDTO> facturaDTOList = new ArrayList<>();
        for(FacturaEntity i: facturaEntityList){
            FacturaDTO facturaDTO = new FacturaDTO();
            facturaDTO.setId(i.getId());
            facturaDTO.setFolio(i.getFolio());
            facturaDTO.setObservacion(i.getObservacion());
            facturaDTO.setDescripcion(i.getDescripcion());
            facturaDTO.setFecha(i.getFecha());
            facturaDTOList.add(facturaDTO);
        }

        return facturaDTOList;
    }

    public FacturaEntity getFacturaEntity(FacturaDTO facturaDTO){
        FacturaEntity facturaEntity = new FacturaEntity();
        facturaEntity.setId(facturaDTO.getId());
        facturaEntity.setDescripcion(facturaDTO.getDescripcion());
        facturaEntity.setObservacion(facturaDTO.getObservacion());
        facturaEntity.setFecha(facturaDTO.getFecha());

        return facturaEntity;
    }


}
