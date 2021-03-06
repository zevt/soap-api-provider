//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 06:01:58 PM CST 
//


package com.orangeleap.tangerine.ws.schema.v3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Retrieve the list of existing payment sources for a
 * 						given constituent id.
 * 
 * 						Requires a valid constituentid.
 * 
 * 						Returns the
 * 						list of existing payment sources.
 * 
 * 						The recommendation by the orange
 * 						leap team is that before you try and
 * 						add a payment source to a
 * 						gift, you
 * 						first do a lookup of existing payment sources to
 * 						determine it does not
 * 						currently exist. If it does currently
 * 						exist
 * 						you would use this payment source instead of creating a new one.
 * 
 * 						If you try and create a new payment source that already exists you
 * 						will receive a SoapFault.
 * 		  
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GetPaymentSourcesByConstituentIdRequest")
public class GetPaymentSourcesByConstituentIdRequest {

    @XmlAttribute(name = "offset", namespace = "http://www.orangeleap.com/orangeleap/services3.2/", required = true)
    protected int offset;
    @XmlAttribute(name = "limit", namespace = "http://www.orangeleap.com/orangeleap/services3.2/")
    protected Integer limit;
    @XmlAttribute(name = "constituentId", namespace = "http://www.orangeleap.com/orangeleap/services3.2/", required = true)
    protected long constituentId;
    @XmlAttribute(name = "includeDeletedRecords", namespace = "http://www.orangeleap.com/orangeleap/services3.2/")
    protected Boolean includeDeletedRecords;

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the constituentId property.
     * 
     */
    public long getConstituentId() {
        return constituentId;
    }

    /**
     * Sets the value of the constituentId property.
     * 
     */
    public void setConstituentId(long value) {
        this.constituentId = value;
    }

    /**
     * Gets the value of the includeDeletedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDeletedRecords() {
        return includeDeletedRecords;
    }

    /**
     * Sets the value of the includeDeletedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDeletedRecords(Boolean value) {
        this.includeDeletedRecords = value;
    }

}
