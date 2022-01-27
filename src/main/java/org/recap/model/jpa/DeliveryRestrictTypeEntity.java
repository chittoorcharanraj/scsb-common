package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY_RESTRICT_TYPE_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DEL_RESTRICT_TYPE_ID"))
@EqualsAndHashCode(callSuper = false)
@Data
public class DeliveryRestrictTypeEntity extends AbstractEntity<Integer>{

    @Column(name = "DEL_RESTRICT_TYPE")
    private String deliveryRestrictType;

}
