package org.recap.model.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by rajeshbabuk on 11/7/16.
 */
@Getter
@Setter
public class AbstractSearchResultRow {
    @ApiModelProperty(name= "bibId", value= "Bibliographic Id",position = 0)
    private Integer bibId;
    @ApiModelProperty(name= "title", value= "Book Title",position = 1)
    private String title;
    @ApiModelProperty(name= "author", value= "Author",position = 2)
    private String author;
    @ApiModelProperty(name= "publisher", value= "Publisher",position = 3)
    private String publisher;
    @ApiModelProperty(name= "publisherDate", value= "Publisher Date",position = 4)
    private String publisherDate;
    @ApiModelProperty(name= "owningInstitution", value= "Owning Institution",position = 5)
    private String owningInstitution;
    @ApiModelProperty(name= "customerCode", value= "Customer Code",position = 6)
    private String customerCode;
    @ApiModelProperty(name= "collectionGroupDesignation", value= "Collection Group Designation",position = 7)
    private String collectionGroupDesignation;
    @ApiModelProperty(name= "useRestriction", value= "use Restriction",position = 8)
    private String useRestriction;
    @ApiModelProperty(name= "barcode", value= "barcode",position = 9)
    private String barcode;
    @ApiModelProperty(name= "summary Holdings", value= "summary Holdings",position = 10)
    private String summaryHoldings;
    @ApiModelProperty(name= "availability", value= "availability",position = 11)
    private String availability;
    @ApiModelProperty(name= "leaderMaterialType", value= "Leader Material Type",position = 12)
    private String leaderMaterialType;
    @ApiModelProperty(name= "selected", value= "selected",position = 13)
    private boolean selected = false;
    @ApiModelProperty(name= "showItems", value= "Show Items",position = 14)
    private boolean showItems = false;
    @ApiModelProperty(name= "selectAllItems", value= "Select All Items",position = 15)
    private boolean selectAllItems = false;
    @ApiModelProperty(name= "itemId", value= "Item Id",position = 17)
    private Integer itemId;
    @ApiModelProperty(name= "imsLocation", value= "Ims Location",position = 18)
    private String imsLocation;
}
