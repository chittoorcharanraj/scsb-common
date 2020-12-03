package org.recap.model.search;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by akulak on 8/3/17.
 */
@Getter
@Setter
public class IncompleteReportResultsRow implements BaseModel {
    private String author;
    private String createdDate;
    private String title;
    private String owningInstitution;
    private String customerCode;
    private String barcode;
}
