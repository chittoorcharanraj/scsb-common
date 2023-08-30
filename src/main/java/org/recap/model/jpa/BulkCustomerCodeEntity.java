package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;


/**
 * Created by akulak on 20/10/17.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "bulk_customer_code_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "BULK_CUSTOMER_CODE_ID"))
public class BulkCustomerCodeEntity extends AbstractEntity<Integer> {

    @Column(name = "CUSTOMER_CODE")
    private String customerCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNING_INST_ID")
    private Integer owningInstitutionId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IMS_LOCATION_ID", insertable = false, updatable = false)
    private ImsLocationEntity imsLocationEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OWNING_INST_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

}
