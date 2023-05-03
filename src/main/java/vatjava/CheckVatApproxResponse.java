
package src.main.java.vatjava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/>
 *         &lt;element name="traderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderNameMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCompanyTypeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderStreetMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderPostcodeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCityMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="requestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "requestDate",
    "valid",
    "traderName",
    "traderCompanyType",
    "traderAddress",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "traderNameMatch",
    "traderCompanyTypeMatch",
    "traderStreetMatch",
    "traderPostcodeMatch",
    "traderCityMatch",
    "requestIdentifier"
})
@XmlRootElement(name = "checkVatApproxResponse")
public class CheckVatApproxResponse {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    protected boolean valid;
    @XmlElementRef(name = "traderName", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderName;
    @XmlElementRef(name = "traderCompanyType", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderCompanyType;
    protected String traderAddress;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String traderNameMatch;
    protected String traderCompanyTypeMatch;
    protected String traderStreetMatch;
    protected String traderPostcodeMatch;
    protected String traderCityMatch;
    @XmlElement(required = true)
    protected String requestIdentifier;

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
     * Obtient la valeur de la propriété requestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Définit la valeur de la propriété requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Obtient la valeur de la propriété valid.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Définit la valeur de la propriété valid.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Obtient la valeur de la propriété traderName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderName() {
        return traderName;
    }

    /**
     * Définit la valeur de la propriété traderName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderName(JAXBElement<String> value) {
        this.traderName = value;
    }

    /**
     * Obtient la valeur de la propriété traderCompanyType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Définit la valeur de la propriété traderCompanyType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderCompanyType(JAXBElement<String> value) {
        this.traderCompanyType = value;
    }

    /**
     * Obtient la valeur de la propriété traderAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderAddress() {
        return traderAddress;
    }

    /**
     * Définit la valeur de la propriété traderAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderAddress(String value) {
        this.traderAddress = value;
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
     * Obtient la valeur de la propriété traderNameMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderNameMatch() {
        return traderNameMatch;
    }

    /**
     * Définit la valeur de la propriété traderNameMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderNameMatch(String value) {
        this.traderNameMatch = value;
    }

    /**
     * Obtient la valeur de la propriété traderCompanyTypeMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyTypeMatch() {
        return traderCompanyTypeMatch;
    }

    /**
     * Définit la valeur de la propriété traderCompanyTypeMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyTypeMatch(String value) {
        this.traderCompanyTypeMatch = value;
    }

    /**
     * Obtient la valeur de la propriété traderStreetMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreetMatch() {
        return traderStreetMatch;
    }

    /**
     * Définit la valeur de la propriété traderStreetMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreetMatch(String value) {
        this.traderStreetMatch = value;
    }

    /**
     * Obtient la valeur de la propriété traderPostcodeMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcodeMatch() {
        return traderPostcodeMatch;
    }

    /**
     * Définit la valeur de la propriété traderPostcodeMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcodeMatch(String value) {
        this.traderPostcodeMatch = value;
    }

    /**
     * Obtient la valeur de la propriété traderCityMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCityMatch() {
        return traderCityMatch;
    }

    /**
     * Définit la valeur de la propriété traderCityMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCityMatch(String value) {
        this.traderCityMatch = value;
    }

    /**
     * Obtient la valeur de la propriété requestIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Définit la valeur de la propriété requestIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

}
