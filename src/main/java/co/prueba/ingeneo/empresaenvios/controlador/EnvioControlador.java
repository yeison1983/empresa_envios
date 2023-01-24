/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.Envio;
import co.prueba.ingeneo.empresaenvios.servicio.EnvioServicio;
import co.prueba.ingeneo.empresaenvios.utils.Constantes;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class EnvioControlador {

    @Autowired
    private EnvioServicio envio;

    @GetMapping("/envio")
    public List<Envio> obtenerEnvios() {
        return envio.listarEnvios();
    }

    @GetMapping("/envio/{guia}")
    public ResponseEntity buscarEnvio(@PathVariable String guia) {
        try {
            Envio envioEncontrado = envio.buscarEnvio(guia);
            return new ResponseEntity(envioEncontrado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("Ocurrio un error buscando el envio", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/envio/{id}")
    public ResponseEntity eliminarEnvio(@PathVariable int id) {
        try {
            envio.eliminarEnvio(id);
        } catch (Exception ex) {
            return new ResponseEntity("Ocurrio un error eliminando el envio", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Envio eliminado con exito", HttpStatus.OK);
    }

    @PostMapping("/envio")
    public ResponseEntity insertarEnvio(@RequestBody Envio nuevo) {
        try {
           String respuesta = envio.insertarEnvio(nuevo);
            switch (respuesta) {
                case Constantes.ERROR_MATRICULA_CODIGO:
                    return new ResponseEntity(Constantes.ERROR_MATRICULA, HttpStatus.OK);
                case Constantes.TRANSACCION_EXITOSA_CODIGO:
                    return new ResponseEntity(Constantes.TRANSACCION_EXITOSA_MENSAJE, HttpStatus.OK);
            }
        } catch (SQLException ex) {
            return new ResponseEntity("Ocurrio un error creando el envio", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(Constantes.MENSAJE_ERROR_POR_DEFECTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/envio")
    public ResponseEntity actualizarEnvio(@RequestBody Envio nuevo) {
        try {
            envio.actualizarEnvio(nuevo);
        } catch (Exception ex) {
            return new ResponseEntity("Ocurrio un error actualizando el envio", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Envio actualizado con exito", HttpStatus.OK);
    }

}
