/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.controlador;

import co.prueba.ingeneo.empresaenvios.modelo.Cliente;
import co.prueba.ingeneo.empresaenvios.servicio.ClienteServicio;
import java.util.List;
import java.util.Optional;
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
public class ClienteControlador {

    @Autowired
    private ClienteServicio cliente;

    @GetMapping("/cliente")
    public List<Cliente> obtenerClientes() {
        return cliente.listarClientes();
    }

    @GetMapping("/cliente/{cedula}")
    public ResponseEntity buscarCliente(@PathVariable String cedula) {
        try {
            Optional<Cliente> clienteEncontrado = cliente.buscarCliente(cedula);
            return new ResponseEntity(clienteEncontrado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("Ocurrio un error buscando el cliente", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/cliente/{cedula}")
    public ResponseEntity eliminarCliente(@PathVariable String cedula) {
        try {
            cliente.eliminarCliente(cedula);
        } catch (Exception ex) {
            return new ResponseEntity("Ocurrio un error eliminando el cliente", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Cliente eliminado con exito", HttpStatus.OK);
    }

    @PostMapping("/cliente")
    public ResponseEntity insertarCliente(@RequestBody Cliente nuevo) {
        try {
            cliente.insertarCliente(nuevo);
        } catch (Exception ex) {
            return new ResponseEntity("Ocurrio un error actualizando el cliente", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Cliente actualizado con exito", HttpStatus.OK);
    }

    @PutMapping("/cliente")
    public ResponseEntity actualizarCliente(@RequestBody Cliente nuevo) {
        try {
            cliente.actualizarCliente(nuevo);
        } catch (Exception ex) {
            return new ResponseEntity("Ocurrio un error actualizando el cliente", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Cliente actualizado con exito", HttpStatus.OK);
    }

}
