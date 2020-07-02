package org.recap.model.search;

import lombok.Data;


/**
 * Created by rajeshbabuk on 2/1/17.
 */
@Data
public class SearchRecordsCommonResponse {
    private Integer totalPageCount = 0;
    private String totalBibRecordsCount = "0";
    private String totalItemRecordsCount = "0";
    private String totalRecordsCount = "0";
    private boolean showTotalCount;
    private String errorMessage;
}
