/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rodrigo
 */
@WebService(serviceName = "WebServiceA")
public class WebServiceA {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "verApto")
    public String verApto(@WebParam(name = "valor") String valor) {
        int newValor = Integer.parseInt(valor);
        
        return "";
    }
}
