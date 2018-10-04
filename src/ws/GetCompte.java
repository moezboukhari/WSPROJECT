
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCompte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCompte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompte", propOrder = {
    "codeCompte"
})
public class GetCompte {

    protected Long codeCompte;

    /**
     * Obtient la valeur de la propri�t� codeCompte.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeCompte() {
        return codeCompte;
    }

    /**
     * D�finit la valeur de la propri�t� codeCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeCompte(Long value) {
        this.codeCompte = value;
    }

}
