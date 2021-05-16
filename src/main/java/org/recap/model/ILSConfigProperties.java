
package org.recap.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.recap.PropertyKeyConstants;
import org.springframework.stereotype.Component;

@Data
@Component
public class ILSConfigProperties {
    /* ILS Connection Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_SERVER)
    @Expose
    public String host;
    @SerializedName(PropertyKeyConstants.ILS.ILS_SERVER_PORT)
    @Expose
    public int port;
    @SerializedName(PropertyKeyConstants.ILS.ILS_SERVER_OPERATOR_USER_ID)
    @Expose
    public String operatorUserId;
    @SerializedName(PropertyKeyConstants.ILS.ILS_SERVER_OPERATOR_PASSWORD)
    @Expose
    public String operatorPassword;
    @SerializedName(PropertyKeyConstants.ILS.ILS_SERVER_OPERATOR_LOCATION)
    @Expose
    public String operatorLocation;
    @SerializedName(PropertyKeyConstants.ILS.ILS_PROTOCOL)
    @Expose
    public String protocol;

    /* ILS General Properties */

    /* Matching Algo Reports Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_MATCHING_REPORTS_TO)
    @Expose
    public String emailMatchingReportsTo;

    /* Accession Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_ACCESSION_RECONCILIATION_CC)
    @Expose
    public String emailAccessionReconciliationCc;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_ACCESSION_REPORTS_TO)
    @Expose
    public String emailAccessionReportsTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_ACCESSION_RECONCILIATION_TO)
    @Expose
    public String emailAccessionReconciliationTo;

    /* Submit Collection Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_SUBMIT_COLLECTION_TO)
    @Expose
    public String emailSubmitCollectionTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_SUBMIT_COLLECTION_CC)
    @Expose
    public String emailSubmitCollectionCc;

    /* Data Dump Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_DATA_DUMP_TO)
    @Expose
    public String emailDataDumpTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_DATA_DUMP_CC)
    @Expose
    public String emailDataDumpCc;

    @SerializedName(PropertyKeyConstants.ILS.ILS_DATA_DUMP_MARC)
    @Expose
    public String datadumpMarc;

    /* Email Request Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_RECALL_REQUEST_TO)
    @Expose
    public String emailRecallRequestTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_REQUEST_RECALL_CC)
    @Expose
    public String emailRequestRecallCc;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_REQUEST_INITIAL_LOAD_TO)
    @Expose
    public String emailRequestInitialLoadTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_REQUEST_REFILE_TO)
    @Expose
    public String emailRequestRefileTo;

    /* Other Email Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_ADMIN_ROLE_TO)
    @Expose
    public String emailAdminRoleTo;
    @SerializedName(PropertyKeyConstants.ILS.ILS_EMAIL_TECHNICAL_SUPPORT_TO)
    @Expose
    public String emailTechnicalSupportTo;

    /* ILS OAuth Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_CLIENT_CLIENT_ID)
    @Expose
    public String oauth2ClientClientid;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_CLIENT_CLIENT_SECRET)
    @Expose
    public String oauth2ClientClientSecret;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_CLIENT_REGISTERED_REDIRECT_URI)
    @Expose
    public String oauth2ClientRegisteredRedirectUri;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_RESOURCE_JWT_KEY_VALUE)
    @Expose
    public String oauth2ResourceJwtKeyValue;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_CLIENT_SCOPE)
    @Expose
    public String oauth2ClientScope;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH2_CLIENT_PRE_ESTABLISHED_REDIRECT_URI)
    @Expose
    public String oauth2ClientPreEstablishedRedirectUri;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH_RESOURCE_JWT_KEY_VALUE)
    @Expose
    public String oauthResourceJwtKeyValue;
    @SerializedName(PropertyKeyConstants.ILS.ILS_OAUTH_TOKEN_API_URL)
    @Expose
    public String oauthTokenApiUrl;

    /* ILS Rest Properties */
    @SerializedName(PropertyKeyConstants.ILS.ILS_REST_DATA_API)
    @Expose
    public String ilsRestDataApi;
    @SerializedName(PropertyKeyConstants.ILS.ILS_REST_POLLING_MAX_TIMEOUT)
    @Expose
    public String ilsRestPollingMaxTimeout;
    @SerializedName(PropertyKeyConstants.ILS.ILS_BIB_DATA_API_PARAMETER)
    @Expose
    public String ilsBibdataApiParameter;
    @SerializedName(PropertyKeyConstants.ILS.ILS_BIB_DATA_API_ENDPOINT)
    @Expose
    public String ilsBibdataApiEndpoint;
    @SerializedName(PropertyKeyConstants.ILS.ILS_BIB_DATA_API_AUTH)
    @Expose
    public String ilsBibdataApiAuth;
    @SerializedName(PropertyKeyConstants.ILS.ILS_BIB_DATA_FORMAT)
    @Expose
    public String bibDataFormat;
    @SerializedName(PropertyKeyConstants.ILS.ILS_REFILE_ENDPOINT_PROTOCOL)
    @Expose
    public String ilsRefileEndpointProtocol;

    @SerializedName(PropertyKeyConstants.ILS.ILS_SUBMIT_COLLECTION_PROTECTED_FTP_DIR)
    @Expose
    public String submitCollectionProtectedFtpDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_SUBMIT_COLLECTION_PROTECTED_LOCAL_DIR)
    @Expose
    public String submitCollectionProtectedLocalDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_SUBMIT_COLLECTION_NOT_PROTECTED_FTP_DIR)
    @Expose
    public String submitCollectionNotProtectedFtpDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_SUBMIT_COLLECTION_NOT_PROTECTED_LOCAL_DIR)
    @Expose
    public String submitCollectionNotProtectedLocalDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_FTP_ACCESSION_RECONCILIATION_DIR)
    @Expose
    public String ftpAccessionReconciliationDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_FTP_ACCESSION_RECONCILIATION_PROCESSED_DIR)
    @Expose
    public String ftpAccessionReconciliationProcessedDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ACCESSION_RECONCILIATION_FILE_PATH)
    @Expose
    public String accessionReconciliationFilepath;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ACCESSION_RECONCILIATION_WORK_DIR)
    @Expose
    public String accessionReconciliationWorkdir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ACCESSION_RECONCILIATION_FTP_ROUTE_ID)
    @Expose
    public String accessionReconciliationFtpRouteId;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ACCESSION_RECONCILIATION_DIRECT_ROUTE_ID)
    @Expose
    public String accessionReconciliationDirectRouteId;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ETL_INCREMENTAL_DUMP)
    @Expose
    public String etlIncrementalDump;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ETL_DELETED_DUMP)
    @Expose
    public String etlDeletedDump;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ETL_INITIAL_DATA_LOADED_DATE)
    @Expose
    public String etlInitialDataLoadedDate;

    @SerializedName(PropertyKeyConstants.ILS.ILS_FTP_REQUEST_INITIAL_ACCESSION_DIR)
    @Expose
    public String ftpRequestInitialAccessionDir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_FTP_REQUEST_INITIAL_ACCESSION_ERROR_FILE)
    @Expose
    public String ftpRequestInitialAccessionErrorFile;

    @SerializedName(PropertyKeyConstants.ILS.ILS_REQUEST_INITIAL_LOAD_WORK_DIR)
    @Expose
    public String requestInitialLoadWorkdir;

    @SerializedName(PropertyKeyConstants.ILS.ILS_REQUEST_INITIAL_LOAD_FILE_PATH)
    @Expose
    public String requestInitialLoadFilepath;

    @SerializedName(PropertyKeyConstants.ILS.ILS_AGENCY_ID)
    @Expose
    public String ncipAgencyId;

    @SerializedName(PropertyKeyConstants.ILS.ILS_SCHEME)
    @Expose
    public String ncipScheme;

    @SerializedName(PropertyKeyConstants.ILS.ILS_API_KEY)
    @Expose
    public String ilsApiKey;

    @SerializedName(PropertyKeyConstants.ILS.ILS_ENABLE_CIRCULATION_FREEZE)
    @Expose
    public String ilsEnableCirculationFreeze;

    @SerializedName(PropertyKeyConstants.ILS.ILS_CIRCULATION_FREEZE_MESSAGE)
    @Expose
    public String ilsCirculationFreezeMessage;

}
