/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.TipoProducto;
import co.prueba.ingeneo.empresaenvios.servicio.TipoProductoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yeison Osorio
 */

@RestController
public class TipoProductoControlador {

    @Autowired
    private TipoProductoServicio tipoProducto;

    @GetMapping("/tipoProducto")
    public List<TipoProducto> obtenerTipoProductos() {
        return tipoProducto.listarTipoProductos();
    }

    @DeleteMapping("/tipoProducto/{id}")
    public String eliminarTipoProducto(@PathVariable int id) {
        tipoProducto.eliminarTipoProducto(id);
        return "Tipo de Producto eliminado con exito";
    }

    @PostMapping("/tipoProducto")
    public String insertarTipoProducto(@RequestBody TipoProducto nuevo) {
        tipoProducto.insertarTipoProducto(nuevo);
        return "Tipo de Producto creado con exito";
    }

    @PutMapping("/tipoProducto")
    public String actualizarTipoProducto(@RequestBody TipoProducto nuevo) {
        tipoProducto.actualizarTipoProducto(nuevo);
        return "Tipo de Producto actualizado con exito";
    }

}
