/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.dao.BodegaDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.ingeneo.empresaenvios.modelo.Bodega;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class BodegaServicio {
    
    @Autowired
    private BodegaDAO bodegaDao;
    
    public List<Bodega> listarBodegas(){
        return bodegaDao.findAll();
    }
    
    public void eliminarBodega(int id){
        bodegaDao.deleteById(id);
    }
    
    public void insertarBodega(Bodega bodega){
        bodegaDao.save(bodega);
    }
    
     public void actualizarBodega(Bodega bodega){
        bodegaDao.save(bodega);
    }
    
}