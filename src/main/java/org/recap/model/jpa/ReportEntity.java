package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peris on 8/10/16.
 */
@Entity
@Table(name = "REPORT_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "RECORD_NUM"))
@Getter
@Setter
public class ReportEntity extends AbstractEntity<Integer> {

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "TYPE")
    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORD_NUM")
    private List<ReportDataEntity> reportDataEntities = new ArrayList<>();


    /**
     * Add all.
     *
     * @param reportDataEntities the report data entities
     */
    public void addAll(List<ReportDataEntity> reportDataEntities) {
        if(null == getReportDataEntities()){
            reportDataEntities = new ArrayList<>();
        }
        this.reportDataEntities.addAll(reportDataEntities);
    }
}
