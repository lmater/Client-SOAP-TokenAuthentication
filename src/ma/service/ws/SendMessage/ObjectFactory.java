
package ma.service.ws.SendMessage;

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

    private final static QName _SendMessageActResponse_QNAME = new QName("http://***************", "sendMessageActResponse");
    private final static QName _SendMessageCode_QNAME = new QName("http://***************", "sendMessageCode");
    private final static QName _SendMessageCodeResponse_QNAME = new QName("http://***************", "sendMessageCodeResponse");
    private final static QName _SendMessageAct_QNAME = new QName("http://***************", "sendMessageAct");
    private final static QName _Exception_QNAME = new QName("http://***************", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMessageAct }
     * 
     */
    public SendMessageAct createSendMessageAct() {
        return new SendMessageAct();
    }

    /**
     * Create an instance of {@link SendMessageAct.Arg7 }
     * 
     */
    public SendMessageAct.Arg7 createSendMessageActArg7() {
        return new SendMessageAct.Arg7();
    }

    /**
     * Create an instance of {@link SendMessageCode }
     * 
     */
    public SendMessageCode createSendMessageCode() {
        return new SendMessageCode();
    }

    /**
     * Create an instance of {@link SendMessageCode.Arg7 }
     * 
     */
    public SendMessageCode.Arg7 createSendMessageCodeArg7() {
        return new SendMessageCode.Arg7();
    }

    /**
     * Create an instance of {@link SendMessageActResponse }
     * 
     */
    public SendMessageActResponse createSendMessageActResponse() {
        return new SendMessageActResponse();
    }

    /**
     * Create an instance of {@link SendMessageCodeResponse }
     * 
     */
    public SendMessageCodeResponse createSendMessageCodeResponse() {
        return new SendMessageCodeResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link SendMessageAct.Arg7 .Entry }
     * 
     */
    public SendMessageAct.Arg7 .Entry createSendMessageActArg7Entry() {
        return new SendMessageAct.Arg7 .Entry();
    }

    /**
     * Create an instance of {@link SendMessageCode.Arg7 .Entry }
     * 
     */
    public SendMessageCode.Arg7 .Entry createSendMessageCodeArg7Entry() {
        return new SendMessageCode.Arg7 .Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageActResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "sendMessageActResponse")
    public JAXBElement<SendMessageActResponse> createSendMessageActResponse(SendMessageActResponse value) {
        return new JAXBElement<SendMessageActResponse>(_SendMessageActResponse_QNAME, SendMessageActResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "sendMessageCode")
    public JAXBElement<SendMessageCode> createSendMessageCode(SendMessageCode value) {
        return new JAXBElement<SendMessageCode>(_SendMessageCode_QNAME, SendMessageCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "sendMessageCodeResponse")
    public JAXBElement<SendMessageCodeResponse> createSendMessageCodeResponse(SendMessageCodeResponse value) {
        return new JAXBElement<SendMessageCodeResponse>(_SendMessageCodeResponse_QNAME, SendMessageCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://***************", name = "sendMessageAct")
    public JAXBElement<SendMessageAct> createSendMessageAct(SendMessageAct value) {
        return new JAXBElement<SendMessageAct>(_SendMessageAct_QNAME, SendMessageAct.class, null, value);
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
