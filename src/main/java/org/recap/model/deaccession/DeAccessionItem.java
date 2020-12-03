package org.recap.model.deaccession;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by rajeshbabuk on 21/2/17.
 */
@Getter
@Setter
public class DeAccessionItem implements BaseModel {

    private String itemBarcode;
    private String deliveryLocation;

}
