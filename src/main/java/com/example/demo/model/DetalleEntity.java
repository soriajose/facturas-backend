package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle", schema = "app_facturas", catalog = "")
public class DetalleEntity {
    private int id;
    private int cantidad;
    private int productoId;
    private int facturaId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "producto_id")
    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Basic
    @Column(name = "factura_id")
    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleEntity that = (DetalleEntity) o;
        return id == that.id &&
                cantidad == that.cantidad &&
                productoId == that.productoId &&
                facturaId == that.facturaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad, productoId, facturaId);
    }
}
