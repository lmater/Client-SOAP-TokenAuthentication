
package ma.service.ws.CheckMessageState;

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

    private final static QName _GetMessageState_QNAME = new QName("http://*******************", "getMessageState");
    private final static QName _GetMessageStateResponse_QNAME = new QName("http://*******************", "getMessageStateResponse");
    private final static QName _Exception_QNAME = new QName("http://*******************", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessageState }
     * 
     */
    public GetMessageState createGetMessageState() {
        return new GetMessageState();
    }

    /**
     * Create an instance of {@link GetMessageStateResponse }
     * 
     */
    public GetMessageStateResponse createGetMessageStateResponse() {
        return new GetMessageStateResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://*******************", name = "getMessageState")
    public JAXBElement<GetMessageState> createGetMessageState(GetMessageState value) {
        return new JAXBElement<GetMessageState>(_GetMessageState_QNAME, GetMessageState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://*******************", name = "getMessageStateResponse")
    public JAXBElement<GetMessageStateResponse> createGetMessageStateResponse(GetMessageStateResponse value) {
        return new JAXBElement<GetMessageStateResponse>(_GetMessageStateResponse_QNAME, GetMessageStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://*******************/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
