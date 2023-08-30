package org.recap.model.jaxb.marc;

import jakarta.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by SheikS on 6/22/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content", propOrder = {
        "collection"
})

@XmlRootElement(name = "content")
public class ContentType implements Serializable {
    @XmlElement(name="collection",required = true, nillable = true)
    protected CollectionType collection;

    /**
     * Gets collection.
     *
     * @return the collection
     */
    public CollectionType getCollection() {
        return collection;
    }

    /**
     * Sets collection.
     *
     * @param collection the collection
     */
    public void setCollection(CollectionType collection) {
        this.collection = collection;
    }
}
