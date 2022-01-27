package org.recap.model.reports;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by rajeshbabuk on 13/1/17.
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ReportsResponse extends ReportsBase {
    private String message;
    private Integer incompletePageNumber = 0;
    private Integer incompletePageSize = 10;
}
