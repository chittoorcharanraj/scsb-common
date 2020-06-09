package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "request_item_status_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "REQUEST_STATUS_ID"))
@Getter
@Setter
public class RequestStatusEntity extends AbstractEntity<Integer>{

    @Column(name = "REQUEST_STATUS_CODE")
    private String requestStatusCode;

    @Column(name = "REQUEST_STATUS_DESC")
    private String requestStatusDescription;

}
