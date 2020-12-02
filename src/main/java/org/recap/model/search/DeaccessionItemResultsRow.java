package org.recap.model.search;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by akulak on 23/12/16.
 */
@Setter
@Getter
public class DeaccessionItemResultsRow implements BaseModel {

    private Integer itemId;
    private String deaccessionDate;
    private String title;
    private String deaccessionOwnInst;
    private String itemBarcode;
    private String cgd;
    private String deaccessionNotes;
    private String deaccessionCreatedBy;

}
