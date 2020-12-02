package org.recap.model.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import org.recap.model.BaseModel;

/**
 * Created by angelind on 26/10/16.
 */
@ApiModel(value="DataDumpSearchResult", description="Model for Displaying Search Result")
@Getter
@Setter
public class DataDumpSearchResult implements BaseModel {
    @ApiModelProperty(name= "bibId", value= "Bibliographic Id",position = 0)
    private Integer bibId;
    @ApiModelProperty(name= "itemIds", value= "Item Ids",position = 1)
    private List<Integer> itemIds = new ArrayList<>();
}
