package org.recap.model.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public class OwnerCodeAbstractEntity extends AbstractEntity<Integer> {

    @Column(name = "OWNER_CODE")
    private String ownerCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSTITUTION_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IMS_LOCATION_ID", insertable = false, updatable = false)
    private ImsLocationEntity imsLocationEntity;

}
