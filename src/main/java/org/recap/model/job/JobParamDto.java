package org.recap.model.job;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeshbabuk on 24/May/2021
 */
@Data
public class JobParamDto {
    private Integer id;
    private String jobName;
    private List<JobParamDataDto> jobParamDataDtos = new ArrayList<>();
}
