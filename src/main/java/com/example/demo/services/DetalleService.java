package com.example.demo.services;

import com.example.demo.dto.DetalleDTO;
import com.example.demo.dto.Response;
import com.example.demo.model.DetalleEntity;
import com.example.demo.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    public Response findAllDetalles(){
        Response response = new Response();
        List<DetalleDTO> detalleDTOList = new DetalleDTO().getDetalleDTOList(detalleRepository.findAll());
        response.setData(detalleDTOList);
        return response;
    }

    public Response findOneDetalle(Integer idDetalle){
        Response response = new Response();
        DetalleDTO detalleDTO = new DetalleDTO().getDetalleDTO(detalleRepository.findById(idDetalle).get());
        response.setData(detalleDTO);
        return response;
    }

    public Response saveDetalle(DetalleDTO detalleDTO){
        Response response = new Response();
        DetalleEntity detalleEntity = new DetalleDTO().getDetalleEntity(detalleDTO);
        response.setData(detalleRepository.save(detalleEntity));
        return response;
    }

    public Response updateDetalle(DetalleDTO input){
        Response response = new Response();
        DetalleEntity detalleEntity = detalleRepository.findById(input.getId()).get();
        detalleRepository.save(detalleEntity);
        response.setData("ok");
        return response;
    }

    public Response deleteDetalle(Integer idDetalle){
        Response response = new Response();
        detalleRepository.delete(detalleRepository.getById(idDetalle));
        response.setData("ok");
        return response;
    }

}
