package org.recap.model.job;

import lombok.Data;
import java.util.Date;

/**
 * Created by rajeshbabuk on 23/May/2021
 */
@Data
public class JobDto {
    private Integer id;
    private String jobName;
    private String jobDescription;
    private Date lastExecutedTime;
    private Date nextRunTime;
    private String cronExpression;
    private String status;
    private Integer jobInstanceId;
}
