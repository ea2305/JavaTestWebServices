/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesUtilidad;

import javax.jws.WebService;

/**
 *
 * @author gerem
 */
@WebService(serviceName = "isActiveWSDLService", portName = "isActiveWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.javatestwebservices2.java.isactivewsdl.IsActiveWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/JavaTestWebServices2/java/isActiveWSDL", wsdlLocation = "WEB-INF/wsdl/isActiveUserServiceFromWSDL/isActiveWSDL.wsdl")
public class isActiveUserServiceFromWSDL {

    public boolean isActiveWSDLOperation(int idClient) {
        //TODO implement this method
        return true;
    }
    
}
