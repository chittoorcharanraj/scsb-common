package org.recap.model.submitCollection;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SubmitCollectionResultsRow {
    private String itemBarcode;
    private String customerCode;
    private String owningInstitution;
    private String reportType;
    private String message;
    private Date createdDate;

}

