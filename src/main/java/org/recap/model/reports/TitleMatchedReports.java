package org.recap.model.reports;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dinakar on 08/07/21
 */
@Setter
@Getter
public class TitleMatchedReports {
    private String bibId;
    private Integer scsbId;
    private List<ItemDetails> itemDetails = new ArrayList<>();
    private String lccn;
    private String isbn;
    private String oclc;
    private String issn;
    private String title;
    private String duplicateCode;
    private String anamolyFlag;
    private String matchScore;
    private String matchScoreTranslated;
    private Boolean expanded = false;
    private String itemBarcode;
    private String cgd;
    private String publisher;
    private String publicationDate;
    private String owningInstitution;
    private Integer id;
}
