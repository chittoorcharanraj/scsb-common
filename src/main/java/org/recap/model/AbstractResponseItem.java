package org.recap.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sudhishk on 15/12/16.
 */
@Getter
@Setter
public abstract class AbstractResponseItem implements BaseModel {

    private String itemBarcode;
    private String itemOwningInstitution=""; // PUL, CUL, NYPL
    private String screenMessage;
    private boolean success;
    private String esipDataIn;
    private String esipDataOut;

}
