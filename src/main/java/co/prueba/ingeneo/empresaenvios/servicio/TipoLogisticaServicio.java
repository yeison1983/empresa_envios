/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.modelo.TipoLogistica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.prueba.ingeneo.empresaenvios.dao.TipoLogisticaDAO;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class TipoLogisticaServicio {
    
    @Autowired
    private TipoLogisticaDAO tipoLogisticaDao;
    
    public List<TipoLogistica> listarTipoLogisticas(){
        return tipoLogisticaDao.findAll();
    }
    
    public void eliminarTipoLogistica(int id){
        tipoLogisticaDao.deleteById(id);
    }
    
    public void insertarTipoLogistica(TipoLogistica tipoLogistica){
        tipoLogisticaDao.save(tipoLogistica);
    }
    
     public void actualizarTipoLogistica(TipoLogistica tipoLogistica){
          tipoLogisticaDao.save(tipoLogistica);
    }
    
}
