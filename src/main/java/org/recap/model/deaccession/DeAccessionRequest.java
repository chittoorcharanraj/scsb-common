package org.recap.model.deaccession;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import org.recap.model.BaseModel;

/**
 * Created by chenchulakshmig on 11/10/16.
 */
@Getter
@Setter
public class DeAccessionRequest implements BaseModel {

    private List<DeAccessionItem> deAccessionItems = new ArrayList<>();
    private String username;
    private String notes;

}
