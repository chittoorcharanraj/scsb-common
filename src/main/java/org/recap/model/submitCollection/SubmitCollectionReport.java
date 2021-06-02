package org.recap.model.submitCollection;

import lombok.Getter;
import lombok.Setter;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SubmitCollectionReport {
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalRecordsCount;
    private Integer totalPageCount ;
    List<SubmitCollectionResultsRow> submitCollectionResultsRows = new ArrayList<>();
    private String institutionName;
    private String errorMessage;
    private Date from;
    private Date to;
    private boolean exportEnabled;
}
