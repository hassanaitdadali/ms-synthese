
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.emsi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.emsi.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.emsi.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws.emsi.org/BanqueService/getCompteRequest", output = "http://ws.emsi.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod(operationName = "ListCompte")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListCompte", targetNamespace = "http://ws.emsi.org/", className = "proxy.ListCompte")
    @ResponseWrapper(localName = "ListCompteResponse", targetNamespace = "http://ws.emsi.org/", className = "proxy.ListCompteResponse")
    @Action(input = "http://ws.emsi.org/BanqueService/ListCompteRequest", output = "http://ws.emsi.org/BanqueService/ListCompteResponse")
    public List<Compte> listCompte();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://ws.emsi.org/", className = "proxy.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://ws.emsi.org/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws.emsi.org/BanqueService/convertRequest", output = "http://ws.emsi.org/BanqueService/convertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}