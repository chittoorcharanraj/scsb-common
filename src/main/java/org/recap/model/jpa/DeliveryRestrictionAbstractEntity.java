package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * Created by harikrishnanv on 3/4/17.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public class DeliveryRestrictionAbstractEntity extends AbstractEntity<Integer> {

    @Column(name="DELIVERY_RESTRICTIONS")
    private String deliveryRestriction;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSTITUTION_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;
}
