package org.recap.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by sudhishk on 15/12/16.
 */
@Getter
@Setter
public class ItemRefileRequest {
    private List<String> itemBarcodes;
    private List<Integer> requestIds;
}
