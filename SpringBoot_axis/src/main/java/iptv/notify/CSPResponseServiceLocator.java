/**
 * CSPResponseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iptv.notify;

public class CSPResponseServiceLocator extends org.apache.axis.client.Service implements CSPResponseService {

    public CSPResponseServiceLocator() {
    }


    public CSPResponseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CSPResponseServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CSPResponse
    private String CSPResponse_address = "http://112.13.67.107:8081/mams/services/CSPResponse";

    public String getCSPResponseAddress() {
        return CSPResponse_address;
    }

    // The WSDD service name defaults to the port name.
    private String CSPResponseWSDDServiceName = "CSPResponse";

    public String getCSPResponseWSDDServiceName() {
        return CSPResponseWSDDServiceName;
    }

    public void setCSPResponseWSDDServiceName(String name) {
        CSPResponseWSDDServiceName = name;
    }

    public CSPResponse getCSPResponse() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CSPResponse_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCSPResponse(endpoint);
    }

    public CSPResponse getCSPResponse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iptv.notify.CSPResponseSoapBindingStub _stub = new iptv.notify.CSPResponseSoapBindingStub(portAddress, this);
            _stub.setPortName(getCSPResponseWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCSPResponseEndpointAddress(String address) {
        CSPResponse_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CSPResponse.class.isAssignableFrom(serviceEndpointInterface)) {
                iptv.notify.CSPResponseSoapBindingStub _stub = new iptv.notify.CSPResponseSoapBindingStub(new java.net.URL(CSPResponse_address), this);
                _stub.setPortName(getCSPResponseWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("CSPResponse".equals(inputPortName)) {
            return getCSPResponse();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://112.13.67.107:8081/mams/services/CSPResponse", "CSPResponseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://112.13.67.107:8081/mams/services/CSPResponse", "CSPResponse"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("CSPResponse".equals(portName)) {
            setCSPResponseEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
