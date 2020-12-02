package org.recap.model.transfer;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by sheiks on 13/07/17.
 */
@Getter
@Setter
public class ItemTransferRequest implements BaseModel {
    private ItemSource source;
    private ItemDestination destination;
}
