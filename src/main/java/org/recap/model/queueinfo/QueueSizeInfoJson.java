package org.recap.model.queueinfo;

import org.recap.model.BaseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by akulak on 20/10/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class QueueSizeInfoJson implements BaseModel {
    private String value;
}
