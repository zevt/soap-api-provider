//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 06:01:58 PM CST 
//


package com.orangeleap.tangerine.ws.schema.v3_2;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pledge" type="{http://www.orangeleap.com/orangeleap/typesv3_2}pledge"/>
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
    "pledge"
})
@XmlRootElement(name = "SaveOrUpdatePledgeResponse")
public class SaveOrUpdatePledgeResponse {

    @XmlElement(required = true)
    protected Pledge pledge;

    /**
     * Gets the value of the pledge property.
     * 
     * @return
     *     possible object is
     *     {@link Pledge }
     *     
     */
    public Pledge getPledge() {
        return pledge;
    }

    /**
     * Sets the value of the pledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pledge }
     *     
     */
    public void setPledge(Pledge value) {
        this.pledge = value;
    }

}