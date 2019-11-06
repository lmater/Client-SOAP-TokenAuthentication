
package ma.service.ws.ReadMessage;

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

    private final static QName _ReadMessageResponse_QNAME = new QName("http://***************", "readMessageResponse");
    private final static QName _ReadMessage_QNAME = new QName("http://***************", "readMessage");
    private final static QName _Exception_QNAME = new QName("http://***************", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadMessageResponse }
     * 
     */
    public ReadMessageResponse createReadMessageResponse() {
        return new ReadMessageResponse();
    }

    /**
     * Create an instance of {@link ReadMessage }
     * 
     */
    public ReadMessage createReadMessage() {
        return new ReadMessage();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "readMessageResponse")
    public JAXBElement<ReadMessageResponse> createReadMessageResponse(ReadMessageResponse value) {
        return new JAXBElement<ReadMessageResponse>(_ReadMessageResponse_QNAME, ReadMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "readMessage")
    public JAXBElement<ReadMessage> createReadMessage(ReadMessage value) {
        return new JAXBElement<ReadMessage>(_ReadMessage_QNAME, ReadMessage.class, null, value);
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
