package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rajeshbabuk on 26/10/16.
 */
@Entity
@Table(name = "request_type_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "REQUEST_TYPE_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class RequestTypeEntity extends AbstractEntity<Integer> {

    @Column(name = "REQUEST_TYPE_CODE")
    private String requestTypeCode;

    @Column(name = "REQUEST_TYPE_DESC")
    private String requestTypeDesc;

}
