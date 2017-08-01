/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesUtilidad;

import javax.jws.WebService;

/**
 *
 * @author andre
 */
@WebService(serviceName = "recrutingWSDLService", portName = "recrutingWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.javatestwebservices2.wsdlutilidad.recrutingwsdl.RecrutingWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/JavaTestWebServices2/WSDLUtilidad/recrutingWSDL", wsdlLocation = "WEB-INF/wsdl/recrutingFromWSDL/recrutingWSDL.wsdl")
public class recrutingFromWSDL {

    public int recrutingWSDLOperation(int part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
