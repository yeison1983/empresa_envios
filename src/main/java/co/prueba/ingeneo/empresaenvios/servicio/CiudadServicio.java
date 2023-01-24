/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.modelo.Ciudad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.prueba.ingeneo.empresaenvios.dao.CiudadDAO;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class CiudadServicio {
    
    @Autowired
    private CiudadDAO ciudadDao;
    
    public List<Ciudad> listarCiudades(){
        return ciudadDao.findAll();
    }
    
    public void eliminarCiudad(int id){
        ciudadDao.deleteById(id);
    }
    
    public void insertarCiudad(Ciudad ciudad){
        ciudadDao.save(ciudad);
    }
    
     public void actualizarCiudad(Ciudad ciudad){
        ciudadDao.save(ciudad);
    }
    
}
