package com.example.demo.dto;

public class Response {

    private Integer status;
    private String mensaje;
    private Object data;

    public Response(){
        this.status = 0;
        this.mensaje = "";
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
