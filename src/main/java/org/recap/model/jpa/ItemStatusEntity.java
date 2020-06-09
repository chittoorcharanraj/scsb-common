package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "item_status_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "ITEM_STATUS_ID"))
@Getter
@Setter
public class ItemStatusEntity extends AbstractEntity<Integer>{

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "STATUS_DESC")
    private String statusDescription;

}
