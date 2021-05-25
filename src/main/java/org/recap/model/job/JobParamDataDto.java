package org.recap.model.job;

import lombok.Data;
/**
 * Created by rajeshbabuk on 24/May/2021
 */
@Data
public class JobParamDataDto {
    private Integer id;
    private String paramName;
    private String paramValue;
    private String recordNum;
}
