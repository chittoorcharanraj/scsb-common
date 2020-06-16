package org.recap.model.jpa;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;


/**
 * Created by akulak on 20/10/17.
 */
@Entity
@Table(name = "bulk_customer_code_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "BULK_CUSTOMER_CODE_ID"))
public class BulkCustomerCodeEntity extends AbstractEntity<Integer> {

    @Column(name = "CUSTOMER_CODE")
    private String customerCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNING_INST_ID")
    private Integer owningInstitutionId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OWNING_INST_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

}
