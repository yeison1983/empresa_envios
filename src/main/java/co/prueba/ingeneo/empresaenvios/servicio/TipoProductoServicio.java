/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.modelo.TipoProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.prueba.ingeneo.empresaenvios.dao.TipoProductoDAO;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class TipoProductoServicio {
    
    @Autowired
    private TipoProductoDAO tipoProductoDao;
    
    public List<TipoProducto> listarTipoProductos(){
        return tipoProductoDao.findAll();
    }
    
    public void eliminarTipoProducto(int id){
        tipoProductoDao.deleteById(id);
    }
    
    public void insertarTipoProducto(TipoProducto tipoProducto){
        tipoProductoDao.save(tipoProducto);
    }
    
     public void actualizarTipoProducto(TipoProducto tipoProducto){
          tipoProductoDao.save(tipoProducto);
    }
    
}
