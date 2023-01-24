/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.TipoLogistica;
import co.prueba.ingeneo.empresaenvios.servicio.TipoLogisticaServicio;
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
public class TipoLogisticaControlador {

    @Autowired
    private TipoLogisticaServicio tipoLogistica;

    @GetMapping("/tipoLogistica")
    public List<TipoLogistica> obtenerTipoLogisticas() {
        return tipoLogistica.listarTipoLogisticas();
    }

    @DeleteMapping("/tipoLogistica/{id}")
    public String eliminarTipoLogistica(@PathVariable int id) {
        tipoLogistica.eliminarTipoLogistica(id);
        return "Tipo de Logistica eliminada con exito";
    }

    @PostMapping("/tipoLogistica")
    public String insertarTipoLogistica(@RequestBody TipoLogistica nueva) {
        tipoLogistica.insertarTipoLogistica(nueva);
        return "Tipo de Logistica creada con exito";
    }

    @PutMapping("/tipoLogistica")
    public String actualizarTipoLogistica(@RequestBody TipoLogistica nueva) {
        tipoLogistica.actualizarTipoLogistica(nueva);
        return "Tipo de logistica actualizada con exito";
    }

}
