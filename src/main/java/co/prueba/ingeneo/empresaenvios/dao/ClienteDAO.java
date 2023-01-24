/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.dao;

import co.prueba.ingeneo.empresaenvios.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yeison Osorio
 */

public interface ClienteDAO extends JpaRepository<Cliente, String>{

}
