package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "collection_group_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "COLLECTION_GROUP_ID"))
@Getter
@Setter
public class CollectionGroupEntity extends AbstractEntity<Integer>{

    @Column(name = "COLLECTION_GROUP_CODE")
    private String collectionGroupCode;

    @Column(name = "COLLECTION_GROUP_DESC")
    private String collectionGroupDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

}
