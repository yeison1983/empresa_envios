/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.dao;

import co.prueba.ingeneo.empresaenvios.modelo.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Yeison Osorio
 */


public interface EnvioDAO extends JpaRepository<Envio, Integer>{

    @Query("SELECT e FROM Envio e WHERE e.guia=?1")
    Envio findByEnvio(String guia);
}
