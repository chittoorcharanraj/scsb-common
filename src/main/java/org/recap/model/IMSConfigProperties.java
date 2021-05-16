package org.recap.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.recap.PropertyKeyConstants;
import org.springframework.stereotype.Component;

/**
 * Created by rajeshbabuk on 18/Jan/2021
 */

@Data
@Component
public class IMSConfigProperties {

    @SerializedName(PropertyKeyConstants.IMS.IMS_USE_QUEUE)
    @Expose
    public String imsUseQueue;

    @SerializedName(PropertyKeyConstants.IMS.IMS_SERVER_STATUS_ENDPOINT)
    @Expose
    public String imsServerStatusEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_ITEM_STATUS_ENDPOINT)
    @Expose
    public String imsItemStatusEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_ITEM_PERMANENT_WITHDRAWAL_DIRECT_ENDPOINT)
    @Expose
    public String imsPermanentWithdrawalDirectEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_ITEM_PERMANENT_WITHDRAWAL_INDIRECT_ENDPOINT)
    @Expose
    public String imsPermanentWithdrawalIndirectEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_ITEM_RETRIEVAL_ORDER_ENDPOINT)
    @Expose
    public String imsItemRetrievalOrderEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_ITEM_EDD_ORDER_ENDPOINT)
    @Expose
    public String imsItemEddOrderEndpoint;

    @SerializedName(PropertyKeyConstants.IMS.IMS_SERVER_RESPONSE_TIMEOUT_MILLISECONDS)
    @Expose
    public String imsServerResponseTimeoutMillis;

    @SerializedName(PropertyKeyConstants.IMS.IMS_POLLING_TIME_INTERVAL)
    @Expose
    public String imsPollingTimeInterval;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_REQUEST_CANCEL_TO)
    @Expose
    public String imsEmailRequestCancelTo;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_REQUEST_REFILE_TO)
    @Expose
    public String imsEmailRequestRefileTo;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_REQUEST_RECALL_CC)
    @Expose
    public String imsEmailRequestRecallCc;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_ASSIST_TO)
    @Expose
    public String imsEmailAssistTo;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_DAILY_RECONCILIATION_TO)
    @Expose
    public String imsEmailDailyReconciliationTo;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_STATUS_RECONCILIATION_TO)
    @Expose
    public String imsEmailStatusReconciliationTo;

    @SerializedName(PropertyKeyConstants.IMS.IMS_EMAIL_STATUS_RECONCILIATION_CC)
    @Expose
    public String imsEmailStatusReconciliationCc;

    @SerializedName(PropertyKeyConstants.IMS.IMS_AVAILABLE_ITEM_STATUS_CODES)
    @Expose
    public String imsAvailableItemStatusCodes;

    @SerializedName(PropertyKeyConstants.IMS.IMS_NOT_AVAILABLE_ITEM_STATUS_CODES)
    @Expose
    public String imsNotAvailableItemStatusCodes;
}
