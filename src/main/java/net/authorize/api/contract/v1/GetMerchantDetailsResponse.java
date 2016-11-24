//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.22 at 06:00:08 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="isTestMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="processors" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfProcessorType"/>
 *         &lt;element name="merchantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gatewayId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString"/>
 *         &lt;element name="marketTypes" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfMarketType"/>
 *         &lt;element name="productCodes" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfProductCode"/>
 *         &lt;element name="paymentMethods" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfPaymentMethod"/>
 *         &lt;element name="currencies" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfCurrencyCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isTestMode",
    "processors",
    "merchantName",
    "gatewayId",
    "marketTypes",
    "productCodes",
    "paymentMethods",
    "currencies"
})
@XmlRootElement(name = "getMerchantDetailsResponse")
public class GetMerchantDetailsResponse
    extends ANetApiResponse
{

    protected Boolean isTestMode;
    @XmlElement(required = true)
    protected ArrayOfProcessorType processors;
    @XmlElement(required = true)
    protected String merchantName;
    @XmlElement(required = true)
    protected String gatewayId;
    @XmlElement(required = true)
    protected ArrayOfMarketType marketTypes;
    @XmlElement(required = true)
    protected ArrayOfProductCode productCodes;
    @XmlElement(required = true)
    protected ArrayOfPaymentMethod paymentMethods;
    @XmlElement(required = true)
    protected ArrayOfCurrencyCode currencies;

    /**
     * Gets the value of the isTestMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestMode() {
        return isTestMode;
    }

    /**
     * Sets the value of the isTestMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestMode(Boolean value) {
        this.isTestMode = value;
    }

    /**
     * Gets the value of the processors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessorType }
     *     
     */
    public ArrayOfProcessorType getProcessors() {
        return processors;
    }

    /**
     * Sets the value of the processors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessorType }
     *     
     */
    public void setProcessors(ArrayOfProcessorType value) {
        this.processors = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the gatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Sets the value of the gatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayId(String value) {
        this.gatewayId = value;
    }

    /**
     * Gets the value of the marketTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketType }
     *     
     */
    public ArrayOfMarketType getMarketTypes() {
        return marketTypes;
    }

    /**
     * Sets the value of the marketTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketType }
     *     
     */
    public void setMarketTypes(ArrayOfMarketType value) {
        this.marketTypes = value;
    }

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductCode }
     *     
     */
    public ArrayOfProductCode getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductCode }
     *     
     */
    public void setProductCodes(ArrayOfProductCode value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentMethod }
     *     
     */
    public ArrayOfPaymentMethod getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Sets the value of the paymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentMethod }
     *     
     */
    public void setPaymentMethods(ArrayOfPaymentMethod value) {
        this.paymentMethods = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyCode }
     *     
     */
    public ArrayOfCurrencyCode getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyCode }
     *     
     */
    public void setCurrencies(ArrayOfCurrencyCode value) {
        this.currencies = value;
    }

}