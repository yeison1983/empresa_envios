/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.Ciudad;
import co.prueba.ingeneo.empresaenvios.servicio.CiudadServicio;
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
public class CiudadControlador {
    
    @Autowired
    private CiudadServicio ciudad;

    @GetMapping("/ciudad")
    public List<Ciudad> obtenerCiudades() {
        return ciudad.listarCiudades();
    }
    
    @DeleteMapping("/ciudad/{id}")
    public String eliminarCiudad(@PathVariable int id){
        ciudad.eliminarCiudad(id);
        return "Ciduad eliminada con exito";
    }
    
    @PostMapping("/ciudad")
    public String insertarCiudad(@RequestBody Ciudad nueva){
       ciudad.insertarCiudad(nueva);
       return "Ciudad creada con exito";
    }
    
    @PutMapping("/ciudad")
    public String actualizarCiudad(@RequestBody Ciudad nueva){
       ciudad.actualizarCiudad(nueva);
       return "Ciudad actualizada con exito";
    }
    
    
}
