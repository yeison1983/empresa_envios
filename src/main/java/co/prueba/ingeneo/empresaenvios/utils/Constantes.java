/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.prueba.ingeneo.empresaenvios.utils;

/**
 *
 * @author Yeison Osorio
 */

public final class Constantes {

    public static final int TIPO_LOGISTICA_MARITIMO = 2;
    public static final int TIPO_LOGISTICA_TERRESTRE = 1;
    public static final String DESCUENTO_MARITIMO= "3%";
    public static final String DESCUENTO_TERRESTRE= "5%";
    public static final Double VALOR_DESCUENTO_MARITIMO= 0.03;
    public static final Double VALOR_DESCUENTO_TERRESTRE= 0.05;
    public static final String EXPRESION_REGULAR_PLACA= "^(?=.[a-zA-Z].[a-zA-Z].[a-zA-Z])(?=.*\\d.*\\d.*\\d).{6}$";  
    public static final String EXPRESION_REGULAR_FLOTA= "^(?=.[a-zA-Z].[a-zA-Z].[a-zA-Z])(?=.*\\d.*\\d.*\\d.*\\d)(?=[a-zA-Z]).{8}$";
    public static final String ERROR_MATRICULA= "La matricula ingresada es erronea";
    public static final String ERROR_MATRICULA_CODIGO= "90";
    public static final String TRANSACCION_EXITOSA_CODIGO= "200";
    public static final String TRANSACCION_EXITOSA_MENSAJE= "Operacion exitosa";
    public static final String MENSAJE_ERROR_POR_DEFECTO= "Ocurrio un error inesperado";
}
