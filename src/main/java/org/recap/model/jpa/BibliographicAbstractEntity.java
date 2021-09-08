package org.recap.model.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sureshss on 02/20/20.
 */

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@MappedSuperclass
public class BibliographicAbstractEntity extends AbstractEntity<Integer> implements Serializable {
    
    @Column(name = "OWNING_INST_ID")
    @EqualsAndHashCode.Include
    private Integer owningInstitutionId;

    @Column(name = "OWNING_INST_BIB_ID")
    @EqualsAndHashCode.Include
    private String owningInstitutionBibId;

    @Lob
    @Column(name = "CONTENT")
    private byte[] content;

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

    @Column(name = "IS_DELETED")
    private boolean isDeleted;

    @Column(name = "CATALOGING_STATUS")
    private String catalogingStatus;

    @Column(name = "MATCHING_IDENTITY")
    private String matchingIdentity;

    @Column(name="MATCH_SCORE")
    private Integer matchScore;

    @Column(name="ANAMOLY_FLAG")
    private Boolean anamolyFlag;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MI_CREATED_DATE")
    private Date miCreatedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MI_UPDATED_DATE")
    private Date miUpdatedDate;

    @Column(name="MA_QUALIFIER")
    private Boolean maQualifier;

    public byte[] getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}

