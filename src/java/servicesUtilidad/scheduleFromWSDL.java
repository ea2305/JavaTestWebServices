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
@WebService(serviceName = "scheduleWSDLService", portName = "scheduleWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.javatestwebservices.wsdlutilidad.schedulewsdl.ScheduleWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/JavaTestWebServices/WSDLUtilidad/scheduleWSDL", wsdlLocation = "WEB-INF/wsdl/scheduleFromWSDL/scheduleWSDL.wsdl")
public class scheduleFromWSDL {

    public javax.xml.datatype.XMLGregorianCalendar scheduleWSDLOperation(java.lang.String part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
