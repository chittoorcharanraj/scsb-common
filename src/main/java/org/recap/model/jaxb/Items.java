package org.recap.model.jaxb;

import org.recap.model.jaxb.marc.ContentType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by pvsubrah on 6/21/16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Items implements Serializable {

    @XmlElement(name = "content",required = true, nillable = true)
    protected ContentType content;

    /**
     * Gets content.
     *
     * @return the content
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(ContentType content) {
        this.content = content;
    }
}
