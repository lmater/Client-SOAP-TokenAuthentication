
package ma.service.ws.CheckMessageState;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;

import ma.service.exploit.SafeEchangeExploitWs;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "checkMessageWS", targetNamespace = "http://***************", wsdlLocation = "https://*********checkMessageState?WSDL")
public class CheckMessageWS
    extends Service
{

    private final static URL CHECKMESSAGEWS_WSDL_LOCATION;
    private final static WebServiceException CHECKMESSAGEWS_EXCEPTION;
    private final static QName CHECKMESSAGEWS_QNAME = new QName("http://***************", "checkMessageWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = SafeEchangeExploitWs.makeConnection("https://****************/checkMessageState?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHECKMESSAGEWS_WSDL_LOCATION = url;
        CHECKMESSAGEWS_EXCEPTION = e;
    }

    public CheckMessageWS() {
        super(__getWsdlLocation(), CHECKMESSAGEWS_QNAME);
    }

    public CheckMessageWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CheckMessageStateWS
     */
    @WebEndpoint(name = "CheckMessageStateWSImplPort")
    public CheckMessageStateWS getCheckMessageStateWSImplPort() {
        return super.getPort(new QName("http://**************", "CheckMessageStateWSImplPort"), CheckMessageStateWS.class);
    }

    private static URL __getWsdlLocation() {
        if (CHECKMESSAGEWS_EXCEPTION!= null) {
            throw CHECKMESSAGEWS_EXCEPTION;
        }
        return CHECKMESSAGEWS_WSDL_LOCATION;
    }

}