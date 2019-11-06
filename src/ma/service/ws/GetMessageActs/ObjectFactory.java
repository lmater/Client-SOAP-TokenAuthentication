
package ma.service.ws.GetMessageActs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.service.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReadingActsResponse_QNAME = new QName("http://***************", "getReadingActsResponse");
    private final static QName _GetSendingAct_QNAME = new QName("http://***************", "getSendingAct");
    private final static QName _GetSendingActResponse_QNAME = new QName("http://***************", "getSendingActResponse");
    private final static QName _GetReadingActs_QNAME = new QName("http://***************", "getReadingActs");
    private final static QName _Exception_QNAME = new QName("http://***************", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: 
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReadingActsResponse }
     * 
     */
    public GetReadingActsResponse createGetReadingActsResponse() {
        return new GetReadingActsResponse();
    }

    /**
     * Create an instance of {@link GetSendingAct }
     * 
     */
    public GetSendingAct createGetSendingAct() {
        return new GetSendingAct();
    }

    /**
     * Create an instance of {@link GetSendingActResponse }
     * 
     */
    public GetSendingActResponse createGetSendingActResponse() {
        return new GetSendingActResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetReadingActs }
     * 
     */
    public GetReadingActs createGetReadingActs() {
        return new GetReadingActs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadingActsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getReadingActsResponse")
    public JAXBElement<GetReadingActsResponse> createGetReadingActsResponse(GetReadingActsResponse value) {
        return new JAXBElement<GetReadingActsResponse>(_GetReadingActsResponse_QNAME, GetReadingActsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSendingAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getSendingAct")
    public JAXBElement<GetSendingAct> createGetSendingAct(GetSendingAct value) {
        return new JAXBElement<GetSendingAct>(_GetSendingAct_QNAME, GetSendingAct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSendingActResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getSendingActResponse")
    public JAXBElement<GetSendingActResponse> createGetSendingActResponse(GetSendingActResponse value) {
        return new JAXBElement<GetSendingActResponse>(_GetSendingActResponse_QNAME, GetSendingActResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadingActs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getReadingActs")
    public JAXBElement<GetReadingActs> createGetReadingActs(GetReadingActs value) {
        return new JAXBElement<GetReadingActs>(_GetReadingActs_QNAME, GetReadingActs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
