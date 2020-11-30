package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sureshss on 02/20/20.
 */

@Getter
@Setter
@MappedSuperclass
public class ItemAbstractEntity implements Serializable {
    @Column(name = "ITEM_ID", insertable = false, updatable = false)
    private Integer itemId;

    @Column(name = "BARCODE")
    private String barcode;

    @Column(name = "CUSTOMER_CODE")
    private String customerCode;

    @Column(name = "CALL_NUMBER")
    private String callNumber;

    @Column(name = "CALL_NUMBER_TYPE")
    private String callNumberType;

    @Column(name = "ITEM_AVAIL_STATUS_ID")
    private Integer itemAvailabilityStatusId;

    @Column(name = "COPY_NUMBER")
    private Integer copyNumber;

    @Id
    @Column(name = "OWNING_INST_ID")
    private Integer owningInstitutionId;

    @Column(name = "COLLECTION_GROUP_ID")
    private Integer collectionGroupId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "USE_RESTRICTIONS")
    private String useRestrictions;

    @Column(name = "VOLUME_PART_YEAR")
    private String volumePartYear;

    @Id
    @Column(name = "OWNING_INST_ITEM_ID")
    private String owningInstitutionItemId;

    @Column(name = "IS_DELETED")
    private boolean isDeleted;

    @Column(name = "CATALOGING_STATUS")
    private String catalogingStatus;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;
}
