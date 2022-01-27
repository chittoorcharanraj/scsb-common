package org.recap.model.transfer;

import java.util.List;

import lombok.Data;

/**
 * Created by sheiks on 12/07/17.
 */
@Data
public class TransferRequest {
    private String institution;
    private List<HoldingsTransferRequest> holdingTransfers;
    private List<ItemTransferRequest> itemTransfers;
}
