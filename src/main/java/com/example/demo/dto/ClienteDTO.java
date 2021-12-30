package com.example.demo.dto;

import com.example.demo.model.ClienteEntity;

import java.util.ArrayList;
import java.util.List;

public class ClienteDTO {

    private int id;
    private String nombre;
    private String apellido;
    private String email;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClienteDTO getClienteDTO(ClienteEntity clienteEntity){

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(clienteEntity.getId());
        clienteDTO.setNombre(clienteEntity.getNombre());
        clienteDTO.setApellido(clienteEntity.getApellido());
        clienteDTO.setEmail(clienteEntity.getEmail());

        return clienteDTO;
    }

    public List<ClienteDTO> getClienteDtoList(List<ClienteEntity> clienteEntityList){

        List<ClienteDTO> clienteDTOList = new ArrayList<>();

        for(ClienteEntity i: clienteEntityList){
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setId(i.getId());
            clienteDTO.setNombre(i.getNombre());
            clienteDTO.setApellido(i.getApellido());
            clienteDTO.setEmail(i.getEmail());
            clienteDTOList.add(clienteDTO);
        }

        return clienteDTOList;
    }

    public ClienteEntity getClienteEntity(ClienteDTO clienteDTO){
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setId(clienteDTO.getId());
        clienteEntity.setNombre(clienteDTO.getNombre());
        clienteEntity.setApellido(clienteDTO.getApellido());
        clienteEntity.setEmail(clienteDTO.email);

        return clienteEntity;
    }


}
