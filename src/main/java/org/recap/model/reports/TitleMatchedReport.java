package org.recap.model.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dinakar on 08/07/21
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TitleMatchedReport {
    private long totalRecordsCount = 0;
    private Integer pageNumber = 0;
    private Integer pageSize = 100;
    private Integer totalPageCount = 0;
    private String message;
    private List<String> owningInst;
    private List<String> cgd;
    private List<String> titleMatch;
    private Date fromDate;
    private Date toDate;
    private List<TitleMatchedReports> titleMatchedReports = new ArrayList<>();
    private List<TitleMatchCount> titleMatchCounts = new ArrayList<>();
}
