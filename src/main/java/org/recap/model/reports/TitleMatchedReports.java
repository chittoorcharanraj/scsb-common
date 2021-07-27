package org.recap.model.reports;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author dinakar on 08/07/21
 */
@Setter
@Getter
public class TitleMatchedReports {
    private String bibId;
    private Integer scsbId;
    private String itemBarcode;
    private List<String> itemBarcodes;
    private String lccn;
    private String duplicateCode;
    private Date createdDate;
}
