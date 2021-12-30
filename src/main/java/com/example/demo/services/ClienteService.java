package com.example.demo.services;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.dto.Response;
import com.example.demo.model.ClienteEntity;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Response findAllClientes(){
        Response response = new Response();
        List<ClienteDTO> clienteDTOList = new ClienteDTO().getClienteDtoList(clienteRepository.findAll());
        response.setData(clienteDTOList);
        return response;
    }

    public Response findOneCliente(Integer idCliente){
        Response response = new Response();
        ClienteDTO clienteDTO = new ClienteDTO().getClienteDTO(clienteRepository.findById(idCliente).get());
        response.setData(clienteDTO);
        return response;
    }

    public Response saveCliente(ClienteDTO clienteDTO){
        Response response = new Response();
        ClienteEntity clienteEntity = new ClienteDTO().getClienteEntity(clienteDTO);
        response.setData(clienteRepository.save(clienteEntity));
        return response;
    }

    public Response updateCliente(ClienteDTO input){
        Response response = new Response();
        ClienteEntity clienteEntity = clienteRepository.findById(input.getId()).get();
        clienteRepository.save(clienteEntity);
        response.setData("ok");
        return response;
    }

    public Response deleteCliente(Integer idCliente){
        Response response = new Response();
        clienteRepository.delete(clienteRepository.getById(idCliente));
        response.setData("ok");
        return response;
    }



}
