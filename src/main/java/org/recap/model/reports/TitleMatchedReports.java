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
    private List<ItemDetails> itemDetails;
    private String lccn;
    private String isbn;
    private String oclc;
    private String issn;
    private String title;
    private String duplicateCode;
    private String anomalyFlag;
    private String mScore;
    private String mScoreTranslated;
    private Boolean expanded = false;
    private String itemBarcode;
    private String cgd;
}
