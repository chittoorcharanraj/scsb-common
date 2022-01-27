package org.recap.model.reports;

import lombok.Data;

import org.recap.model.search.DeaccessionItemResultsRow;
import org.recap.model.search.IncompleteReportResultsRow;

import java.util.ArrayList;
import java.util.List;


@Data
public class ReportsBase {

    private List<ReportsInstitutionForm> reportsInstitutionFormList = new ArrayList<>();

    private String totalRecordsCount = "0";
    private Integer totalPageCount = 0;
    private List<DeaccessionItemResultsRow> deaccessionItemResultsRows = new ArrayList<>();

    private String incompleteTotalRecordsCount = "0";
    private Integer incompleteTotalPageCount = 0;
    private List<IncompleteReportResultsRow> incompleteReportResultsRows = new ArrayList<>();

}
