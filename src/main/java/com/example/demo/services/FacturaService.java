package com.example.demo.services;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.dto.Response;
import com.example.demo.model.FacturaEntity;
import com.example.demo.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Response findAllFacturas(){
        Response response = new Response();
        List<FacturaDTO> facturaDTOList = new FacturaDTO().getFacturaDTOList(facturaRepository.findAll());
        response.setData(facturaDTOList);
        return response;
    }

    public Response findOneFactura(Integer idFactura){
        Response response = new Response();
        FacturaDTO facturaDTO = new FacturaDTO().getFacturaDTO(facturaRepository.findById(idFactura).get());
        response.setData(facturaDTO);
        return response;
    }

    public Response saveFactura(FacturaDTO facturaDTO){
        Response response = new Response();
        FacturaEntity facturaEntity = new FacturaDTO().getFacturaEntity(facturaDTO);
        response.setData(facturaRepository.save(facturaEntity));
        return response;
    }

    public Response updateFactura(FacturaDTO input){
        Response response = new Response();
        FacturaEntity facturaEntity = facturaRepository.findById(input.getId()).get();
        facturaRepository.save(facturaEntity);
        response.setData("ok");
        return response;
    }

    public Response deleteFactura(Integer idFactura){
        Response response = new Response();
        facturaRepository.delete(facturaRepository.getById(idFactura));
        response.setData("ok");
        return response;
    }

}
