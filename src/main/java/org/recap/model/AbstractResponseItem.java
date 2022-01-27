package org.recap.model;

import lombok.Data;

/**
 * Created by sudhishk on 15/12/16.
 */
@Data
public abstract class AbstractResponseItem {

    private String itemBarcode;
    private String itemOwningInstitution=""; // PUL, CUL, NYPL
    private String screenMessage;
    private boolean success;
    private String esipDataIn;
    private String esipDataOut;

}
