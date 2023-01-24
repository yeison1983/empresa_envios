/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yeison Osorio
 */

@Entity
@Table(name = "tbl_envio")
public class Envio implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "tipo_producto")
    private String tipoProducto;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    @Column(name = "fecha_entrega")
    private Date fechaEntrega;
    @Column(name = "bodega_entrega")
    private int bodegaEntrega;
    @Column(name = "precio_envio")
    private Double precioEnvio;
    @Column(name = "placa")
    private String placa;
    @Column(name = "flota")
    private String flota;
    @Column(name = "guia")
    private String guia;
    @Column(name = "descuento")
    private String descuento;
    @Column(name = "tipo_logistica")
    private int tipoLogistica;
    @Column(name = "cliente")
    private String cliente;
    @Column(name = "descripcion_producto")
    private String descripcionProducto;
    @Column(name = "precio_descuento")
    private Double precioDescuento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getBodegaEntrega() {
        return bodegaEntrega;
    }

    public void setBodegaEntrega(int bodegaEntrega) {
        this.bodegaEntrega = bodegaEntrega;
    }

    public Double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(Double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFlota() {
        return flota;
    }

    public void setFlota(String flota) {
        this.flota = flota;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public int getTipoLogistica() {
        return tipoLogistica;
    }

    public void setTipoLogistica(int tipoLogistica) {
        this.tipoLogistica = tipoLogistica;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(Double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

}
