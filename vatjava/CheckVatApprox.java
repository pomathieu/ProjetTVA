
package vatjava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/>
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterVatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryCode",
    "vatNumber",
    "traderName",
    "traderCompanyType",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "requesterCountryCode",
    "requesterVatNumber"
})
@XmlRootElement(name = "checkVatApprox")
public class CheckVatApprox {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    protected String traderName;
    protected String traderCompanyType;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String requesterCountryCode;
    protected String requesterVatNumber;

    /**
     * Obtient la valeur de la propriété countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Définit la valeur de la propriété countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtient la valeur de la propriété vatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Définit la valeur de la propriété vatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Obtient la valeur de la propriété traderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderName() {
        return traderName;
    }

    /**
     * Définit la valeur de la propriété traderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderName(String value) {
        this.traderName = value;
    }

    /**
     * Obtient la valeur de la propriété traderCompanyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Définit la valeur de la propriété traderCompanyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyType(String value) {
        this.traderCompanyType = value;
    }

    /**
     * Obtient la valeur de la propriété traderStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreet() {
        return traderStreet;
    }

    /**
     * Définit la valeur de la propriété traderStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreet(String value) {
        this.traderStreet = value;
    }

    /**
     * Obtient la valeur de la propriété traderPostcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcode() {
        return traderPostcode;
    }

    /**
     * Définit la valeur de la propriété traderPostcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcode(String value) {
        this.traderPostcode = value;
    }

    /**
     * Obtient la valeur de la propriété traderCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCity() {
        return traderCity;
    }

    /**
     * Définit la valeur de la propriété traderCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCity(String value) {
        this.traderCity = value;
    }

    /**
     * Obtient la valeur de la propriété requesterCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterCountryCode() {
        return requesterCountryCode;
    }

    /**
     * Définit la valeur de la propriété requesterCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterCountryCode(String value) {
        this.requesterCountryCode = value;
    }

    /**
     * Obtient la valeur de la propriété requesterVatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterVatNumber() {
        return requesterVatNumber;
    }

    /**
     * Définit la valeur de la propriété requesterVatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterVatNumber(String value) {
        this.requesterVatNumber = value;
    }

}
