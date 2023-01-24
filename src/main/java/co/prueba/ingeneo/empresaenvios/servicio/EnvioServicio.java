/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.servicio;

import co.prueba.ingeneo.empresaenvios.dao.EnvioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.prueba.ingeneo.empresaenvios.modelo.Envio;
import co.prueba.ingeneo.empresaenvios.utils.Constantes;
import java.sql.SQLException;
import java.util.Optional;

/**
 *
 * @author Yeison Osorio
 */

@Service
public class EnvioServicio {

    @Autowired
    private EnvioDAO envioDao;

    public List<Envio> listarEnvios() {
        return envioDao.findAll();
    }

    public Envio buscarEnvio(String guia) {
        return envioDao.findByEnvio(guia);
    }

    public void eliminarEnvio(int id) throws SQLException {
        try {
            envioDao.deleteById(id);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error eliminando el envio");
        }
    }
    
    public String insertarEnvio(Envio envio) throws SQLException {
        try {
            boolean matriculaValida = false;
            if (envio.getTipoLogistica() == Constantes.TIPO_LOGISTICA_TERRESTRE) {
                matriculaValida = validarPlaca(envio.getPlaca());
            } else if (envio.getTipoLogistica() == Constantes.TIPO_LOGISTICA_MARITIMO) {
                matriculaValida = validarFlota(envio.getFlota());
            }
            if (matriculaValida) {
                Envio nuevo = this.validarDescuento(envio);
                envioDao.save(nuevo);
            } else {
                return Constantes.ERROR_MATRICULA_CODIGO;
            }
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error insertando el envio");
        }
        return Constantes.TRANSACCION_EXITOSA_MENSAJE;
    }

    public void actualizarEnvio(Envio envio) throws SQLException {
        try {
            envioDao.save(envio);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un error actualizando el envio");
        }
    }
/**
 * Metodo que realiza la validacion de aplicar descuento de acuerdo a la
 * cantidad de productos y al tipo de logistica.
 * @param envio
 * @return 
 */
    private Envio validarDescuento(Envio envio) {
        if (envio.getCantidad() >= 10 && envio.getTipoLogistica() == Constantes.TIPO_LOGISTICA_TERRESTRE) {
            Double precioDescuento = envio.getPrecioEnvio() - (envio.getPrecioEnvio() * Constantes.VALOR_DESCUENTO_TERRESTRE);
            envio.setPrecioDescuento(precioDescuento);
            envio.setDescuento(Constantes.DESCUENTO_TERRESTRE);
        } else if (envio.getCantidad() >= 10 && envio.getTipoLogistica() == Constantes.TIPO_LOGISTICA_MARITIMO) {
            Double precioDescuento = envio.getPrecioEnvio() - (envio.getPrecioEnvio() * Constantes.VALOR_DESCUENTO_MARITIMO);
            envio.setPrecioDescuento(precioDescuento);
            envio.setDescuento(Constantes.DESCUENTO_MARITIMO);
        }
        return envio;
    }
/**
 * Metodo que realiza la validacion del tipo de matricula (Placa) segun formato indicado para este caso
 * @param placa
 * @return 
 */
    private Boolean validarPlaca(String placa) {
        return placa.matches(Constantes.EXPRESION_REGULAR_PLACA);
    }
/**
 * Metodo que realiza la validacion del tipo de matricula (Flota) segun formato indicado para este caso
 * @param flota
 * @return 
 */
    private Boolean validarFlota(String flota) {
        return flota.matches(Constantes.EXPRESION_REGULAR_FLOTA);
    }

}
