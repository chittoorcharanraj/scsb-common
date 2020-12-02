package org.recap.model.search;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by rajeshbabuk on 2/1/17.
 */
@Getter
@Setter
public class SearchRecordsCommonResponse implements BaseModel {
    private Integer totalPageCount = 0;
    private String totalBibRecordsCount = "0";
    private String totalItemRecordsCount = "0";
    private String totalRecordsCount = "0";
    private boolean showTotalCount;
    private String errorMessage;
}
