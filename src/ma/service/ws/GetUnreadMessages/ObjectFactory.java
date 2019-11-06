
package ma.service.ws.GetUnreadMessages;

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

    private final static QName _GetUnreadMessages_QNAME = new QName("http://***************", "getUnreadMessages");
    private final static QName _GetUnreadMessagesResponse_QNAME = new QName("http://***************", "getUnreadMessagesResponse");
    private final static QName _Exception_QNAME = new QName("http://***************", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUnreadMessages }
     * 
     */
    public GetUnreadMessages createGetUnreadMessages() {
        return new GetUnreadMessages();
    }

    /**
     * Create an instance of {@link GetUnreadMessagesResponse }
     * 
     */
    public GetUnreadMessagesResponse createGetUnreadMessagesResponse() {
        return new GetUnreadMessagesResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreadMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getUnreadMessages")
    public JAXBElement<GetUnreadMessages> createGetUnreadMessages(GetUnreadMessages value) {
        return new JAXBElement<GetUnreadMessages>(_GetUnreadMessages_QNAME, GetUnreadMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreadMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "getUnreadMessagesResponse")
    public JAXBElement<GetUnreadMessagesResponse> createGetUnreadMessagesResponse(GetUnreadMessagesResponse value) {
        return new JAXBElement<GetUnreadMessagesResponse>(_GetUnreadMessagesResponse_QNAME, GetUnreadMessagesResponse.class, null, value);
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
