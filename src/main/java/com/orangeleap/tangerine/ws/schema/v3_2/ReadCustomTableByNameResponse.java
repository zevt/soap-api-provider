//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 06:01:58 PM CST 
//


package com.orangeleap.tangerine.ws.schema.v3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="customTable" type="{http://www.orangeleap.com/orangeleap/typesv3_2}customTable" minOccurs="0"/>
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
    "customTable"
})
@XmlRootElement(name = "ReadCustomTableByNameResponse")
public class ReadCustomTableByNameResponse {

    protected CustomTable customTable;

    /**
     * Gets the value of the customTable property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTable }
     *     
     */
    public CustomTable getCustomTable() {
        return customTable;
    }

    /**
     * Sets the value of the customTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTable }
     *     
     */
    public void setCustomTable(CustomTable value) {
        this.customTable = value;
    }

}
