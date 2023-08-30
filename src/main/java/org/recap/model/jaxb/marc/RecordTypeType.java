
package org.recap.model.jaxb.marc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for recordTypeType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recordTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Bibliographic"/>
 *     &lt;enumeration value="Authority"/>
 *     &lt;enumeration value="Holdings"/>
 *     &lt;enumeration value="Classification"/>
 *     &lt;enumeration value="Community"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "recordTypeType")
@XmlEnum
public enum RecordTypeType implements Serializable {

    @XmlEnumValue("Bibliographic")
    BIBLIOGRAPHIC("Bibliographic"),
    @XmlEnumValue("Authority")
    AUTHORITY("Authority"),
    @XmlEnumValue("Holdings")
    HOLDINGS("Holdings"),
    @XmlEnumValue("Classification")
    CLASSIFICATION("Classification"),
    @XmlEnumValue("Community")
    COMMUNITY("Community");
    private final String value;

    RecordTypeType(String v) {
        value = v;
    }

    /**
     * Gets the value.
     *
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * Gets record type from given value.
     *
     * @param v the v
     * @return the record type type
     */
    public static RecordTypeType fromValue(String v) {
        for (RecordTypeType c : RecordTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
