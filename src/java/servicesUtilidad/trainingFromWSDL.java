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
@WebService(serviceName = "trainingWSDLService", portName = "trainingWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.javatestwebservices.wsdlutilidad.trainingwsdl.TrainingWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/JavaTestWebServices/WSDLUtilidad/trainingWSDL", wsdlLocation = "WEB-INF/wsdl/trainingFromWSDL/trainingWSDL.wsdl")
public class trainingFromWSDL {

    public boolean trainingWSDLOperation(java.lang.String skill) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
