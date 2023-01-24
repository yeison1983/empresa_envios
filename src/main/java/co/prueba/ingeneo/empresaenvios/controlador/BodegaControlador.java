/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.Bodega;
import co.prueba.ingeneo.empresaenvios.servicio.BodegaServicio;
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
public class BodegaControlador {

    @Autowired
    private BodegaServicio bodega;

    @GetMapping("/bodega")
    public List<Bodega> obtenerBodegas() {
        return bodega.listarBodegas();
    }

    @DeleteMapping("/bodega/{id}")
    public String eliminarBodega(@PathVariable int id) {
        bodega.eliminarBodega(id);
        return "Bodega eliminada con exito";
    }

    @PostMapping("/bodega")
    public String insertarBodega(@RequestBody Bodega nueva) {
        bodega.insertarBodega(nueva);
        return "Bodega creada con exito";
    }

    @PutMapping("/bodega")
    public String actualizarBodega(@RequestBody Bodega nueva) {
        bodega.actualizarBodega(nueva);
        return "Bodega actualizada con exito";
    }

}
