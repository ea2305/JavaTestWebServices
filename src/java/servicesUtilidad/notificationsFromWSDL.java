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
@WebService(serviceName = "notificationsWSDLService", portName = "notificationsWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.javatestwebservices2.java.notificationswsdl.NotificationsWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/JavaTestWebServices2/java/notificationsWSDL", wsdlLocation = "WEB-INF/wsdl/notificationsFromWSDL/notificationsWSDL.wsdl")
public class notificationsFromWSDL {

    public java.lang.String notificationsWSDLOperation(java.lang.String event) {        
        return "Usted tiene una notificacion: " + event; 
    }
    
}
