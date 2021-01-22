package org.recap.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by rajeshbabuk on 18/Jan/2021
 */

@Data
@Component
public class IMSConfigProperties {

    @SerializedName("las.use.queue")
    @Expose
    public String lasUseQueue;

    @SerializedName("las.server.status.endpoint")
    @Expose
    public String lasServerStatusEndpoint;

    @SerializedName("las.item.status.endpoint")
    @Expose
    public String lasItemStatusEndpoint;

    @SerializedName("las.item.permanent.withdrawal.direct.endpoint")
    @Expose
    public String lasPermanentWithdrawalDirectEndpoint;

    @SerializedName("las.item.permanent.withdrawal.indirect.endpoint")
    @Expose
    public String lasPermanentWithdrawalIndirectEndpoint;

    @SerializedName("las.item.retrieval.order.endpoint")
    @Expose
    public String lasItemRetrievalOrderEndpoint;

    @SerializedName("las.item.edd.order.endpoint")
    @Expose
    public String lasItemEddOrderEndpoint;

    @SerializedName("las.server.response.timeout.milliseconds")
    @Expose
    public String lasServerResponseTimeoutMillis;

    @SerializedName("las.polling.time.interval")
    @Expose
    public String lasPollingTimeInterval;

    @SerializedName("las.email.request.cancel.to")
    @Expose
    public String lasEmailRequestCancelTo;

    @SerializedName("las.email.request.refile.to")
    @Expose
    public String lasEmailRequestRefileTo;

    @SerializedName("las.email.request.recall.cc")
    @Expose
    public String lasEmailRequestRecallCc;

    @SerializedName("las.email.assist.to")
    @Expose
    public String lasEmailAssistTo;

    @SerializedName("las.email.daily.reconciliation.to")
    @Expose
    public String lasEmailDailyReconciliationTo;

    @SerializedName("las.email.status.reconciliation.to")
    @Expose
    public String lasEmailStatusReconciliationTo;

    @SerializedName("las.email.status.reconciliation.cc")
    @Expose
    public String lasEmailStatusReconciliationCc;
}
