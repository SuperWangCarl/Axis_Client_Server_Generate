/**
 * CSPResponseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iptv.notify;

public interface CSPResponseService extends javax.xml.rpc.Service {
    public java.lang.String getCSPResponseAddress();

    public iptv.notify.CSPResponse getCSPResponse() throws javax.xml.rpc.ServiceException;

    public iptv.notify.CSPResponse getCSPResponse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
