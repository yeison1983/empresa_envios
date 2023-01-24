/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.dao.ClienteDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.prueba.ingeneo.empresaenvios.modelo.Cliente;
import java.sql.SQLException;
import java.util.Optional;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class ClienteServicio {

    @Autowired
    private ClienteDAO clienteDao;

    public List<Cliente> listarClientes() {
        return clienteDao.findAll();
    }

    public Optional<Cliente> buscarCliente(String cedula) {
        return clienteDao.findById(cedula);
    }

    public void eliminarCliente(String cedula) throws SQLException {
        try {
            clienteDao.deleteById(cedula);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error eliminando el cliente");
        }
    }

    public void insertarCliente(Cliente cliente) throws SQLException {
        try {
            clienteDao.save(cliente);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error insertando el cliente");
        }
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        try {
            clienteDao.save(cliente);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error actualizando el cliente");
        }
    }

}
