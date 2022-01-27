package org.recap.model.submitCollection;

import lombok.Data;

import java.util.Date;

@Data
public class SubmitCollectionResultsRow {
    private String itemBarcode;
    private String customerCode;
    private String owningInstitution;
    private String reportType;
    private String message;
    private Date createdDate;

}

