//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 06:01:58 PM CST 
//


package com.orangeleap.tangerine.ws.schema.v3_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commitmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commitmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECURRING_GIFT"/>
 *     &lt;enumeration value="PLEDGE"/>
 *     &lt;enumeration value="MEMBERSHIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commitmentType", namespace = "http://www.orangeleap.com/orangeleap/typesv3_2")
@XmlEnum
public enum CommitmentType {

    RECURRING_GIFT,
    PLEDGE,
    MEMBERSHIP;

    public String value() {
        return name();
    }

    public static CommitmentType fromValue(String v) {
        return valueOf(v);
    }

}
