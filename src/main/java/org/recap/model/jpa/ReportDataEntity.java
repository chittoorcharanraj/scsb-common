package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by SheikS on 8/8/2016.
 */
@Entity
@Table(name = "REPORT_DATA_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "REPORT_DATA_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class ReportDataEntity extends AbstractEntity<Integer> {

    @Column(name = "HEADER_NAME")
    private String headerName;

    @Column(name = "HEADER_VALUE")
    private String headerValue;

    @Column(name = "RECORD_NUM")
    private String recordNum;

}
