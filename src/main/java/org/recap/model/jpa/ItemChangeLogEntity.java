package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by rajeshbabuk on 18/10/16.
 */
@Entity
@Table(name = "ITEM_CHANGE_LOG_T", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "ITEM_CHANGE_LOG_ID"))
@Getter
@Setter
public class ItemChangeLogEntity extends AbstractEntity<Integer> {

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Column(name = "OPERATION_TYPE")
    private String operationType;

    @Column(name = "RECORD_ID")
    private Integer recordId;

    @Column(name = "NOTES")
    private String notes;

 }
