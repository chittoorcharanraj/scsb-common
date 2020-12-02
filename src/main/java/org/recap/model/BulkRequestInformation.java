package org.recap.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by rajeshbabuk on 11/10/17.
 */

@Getter
@Setter
public class BulkRequestInformation implements BaseModel{
    private String requestingInstitution;
    private String patronBarcode;
}
