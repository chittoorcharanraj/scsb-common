package org.recap.model.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY_RESTRICT_TYPE_T", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DEL_RESTRICT_TYPE_ID"))
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
public class DeliveryRestrictTypeEntity extends AbstractEntity<Integer>{

    @Column(name = "DEL_RESTRICT_TYPE")
    private String deliveryRestrictType;

}
