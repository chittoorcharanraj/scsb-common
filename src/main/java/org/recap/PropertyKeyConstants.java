package org.recap;

/**
 * Created by rajeshbabuk on 15/May/2021
 */
public class PropertyKeyConstants {

    private PropertyKeyConstants() {
    }

    /* General Property Keys */
    public static final String VERSION_NUMBER = "version.number";

    /* ILS Property Keys */
    public static class ILS {
        private ILS() {
        }

        public static final String ILS_PROTOCOL = "ils.protocol";
        public static final String ILS_SERVER = "ils.server";
        public static final String ILS_SERVER_PORT = "ils.server.port";
        public static final String ILS_SERVER_OPERATOR_USER_ID = "ils.server.operator.user.id";
        public static final String ILS_SERVER_OPERATOR_PASSWORD = "ils.server.operator.password";
        public static final String ILS_SERVER_OPERATOR_LOCATION = "ils.server.operator.location";
        /* ILS OAuth Keys */
        public static final String ILS_OAUTH2_CLIENT_CLIENT_ID = "oauth2.client.clientid";
        public static final String ILS_OAUTH2_CLIENT_CLIENT_SECRET = "oauth2.client.clientSecret";
        public static final String ILS_OAUTH2_CLIENT_REGISTERED_REDIRECT_URI = "oauth2.client.registered-redirect-uri";
        public static final String ILS_OAUTH2_RESOURCE_JWT_KEY_VALUE = "oauth2.resource.jwt.key-value";
        public static final String ILS_OAUTH2_CLIENT_SCOPE = "oauth2.client.scope";
        public static final String ILS_OAUTH2_CLIENT_PRE_ESTABLISHED_REDIRECT_URI = "oauth2.client.pre-established-redirect-uri";
        public static final String ILS_OAUTH_RESOURCE_JWT_KEY_VALUE = "oauth.resource.jwt.key-value";
        public static final String ILS_OAUTH_TOKEN_API_URL = "oauth.token.api.url";
        /* ILS Email Keys */
        public static final String ILS_EMAIL_ACCESSION_REPORTS_TO = "email.accession.reports.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_TO = "email.accession.reconciliation.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_CC = "email.accession.reconciliation.cc";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_TO = "email.submit.collection.to";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_CC = "email.submit.collection.cc";
        public static final String ILS_EMAIL_MATCHING_REPORTS_TO = "email.matching.reports.to";
        public static final String ILS_EMAIL_DATA_DUMP_TO = "email.data.dump.to";
        public static final String ILS_EMAIL_DATA_DUMP_CC = "email.data.dump.cc";
        public static final String ILS_EMAIL_RECALL_REQUEST_TO = "email.recall.request.to";
        public static final String ILS_EMAIL_REQUEST_RECALL_CC = "email.request.recall.cc";
        public static final String ILS_EMAIL_REQUEST_INITIAL_LOAD_TO = "email.request.initial.load.to";
        public static final String ILS_EMAIL_REQUEST_REFILE_TO = "email.request.refile.to";
        public static final String ILS_EMAIL_ADMIN_ROLE_TO = "email.admin.role.to";
        public static final String ILS_EMAIL_TECHNICAL_SUPPORT_TO = "email.technical.support.to";
        /* Other ILS Keys */
        public static final String ILS_DATA_DUMP_MARC = "datadump.marc";
        public static final String ILS_REST_DATA_API = "ils.rest.data.api";
        public static final String ILS_REST_POLLING_MAX_TIMEOUT = "ils.rest.polling.max.timeout";
        public static final String ILS_BIB_DATA_API_PARAMETER = "ils.bibdata.api.parameter";
        public static final String ILS_BIB_DATA_API_ENDPOINT = "ils.bibdata.api.endpoint";
        public static final String ILS_BIB_DATA_API_AUTH = "ils.bibdata.api.auth";
        public static final String ILS_BIB_DATA_FORMAT = "bibdata.format";
        public static final String ILS_REFILE_ENDPOINT_PROTOCOL = "ils.refile.endpoint.protocol";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_FTP_DIR = "submitCollection.protected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_LOCAL_DIR = "submitCollection.protected.localDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_FTP_DIR = "submitCollection.notProtected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_LOCAL_DIR = "submitCollection.notProtected.localDir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_DIR = "ftp.accession.reconciliation.dir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_PROCESSED_DIR = "ftp.accession.reconciliation.processed.dir";
        public static final String ILS_ACCESSION_RECONCILIATION_FILE_PATH = "accession.reconciliation.filePath";
        public static final String ILS_ACCESSION_RECONCILIATION_WORK_DIR = "accession.reconciliation.workdir";
        public static final String ILS_ACCESSION_RECONCILIATION_FTP_ROUTE_ID = "accession.reconciliation.ftp.routeId";
        public static final String ILS_ACCESSION_RECONCILIATION_DIRECT_ROUTE_ID = "accession.reconciliation.direct.routeId";
        public static final String ILS_ETL_INCREMENTAL_DUMP = "etl.incremental.dump";
        public static final String ILS_ETL_DELETED_DUMP = "etl.deleted.dump";
        public static final String ILS_ETL_INITIAL_DATA_LOADED_DATE = "etl.initial.data.loaded.date";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_DIR = "ftp.request.initial.accession.dir";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_ERROR_FILE = "ftp.request.initial.accession.error.file";
        public static final String ILS_REQUEST_INITIAL_LOAD_WORK_DIR = "request.initial.load.workdir";
        public static final String ILS_REQUEST_INITIAL_LOAD_FILE_PATH = "request.initial.load.filepath";
        public static final String ILS_AGENCY_ID = "ils.agency.id";
        public static final String ILS_SCHEME = "ils.scheme";
        public static final String ILS_API_KEY = "ils.api.key";
        public static final String ILS_ENABLE_CIRCULATION_FREEZE = "ils.enable.circulation.freeze";
        public static final String ILS_CIRCULATION_FREEZE_MESSAGE = "ils.circulation.freeze.message";
    }

    /* IMS Property Keys */
    public static class IMS {
        private IMS() {
        }

        /* IMS End Point URL Keys */
        public static final String IMS_SERVER_STATUS_ENDPOINT = "ims.server.status.endpoint";
        public static final String IMS_ITEM_STATUS_ENDPOINT = "ims.item.status.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_DIRECT_ENDPOINT = "ims.item.permanent.withdrawal.direct.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_INDIRECT_ENDPOINT = "ims.item.permanent.withdrawal.indirect.endpoint";
        public static final String IMS_ITEM_RETRIEVAL_ORDER_ENDPOINT = "ims.item.retrieval.order.endpoint";
        public static final String IMS_ITEM_EDD_ORDER_ENDPOINT = "ims.item.edd.order.endpoint";
        /* IMS Email Keys */
        public static final String IMS_EMAIL_REQUEST_CANCEL_TO = "ims.email.request.cancel.to";
        public static final String IMS_EMAIL_REQUEST_REFILE_TO = "ims.email.request.refile.to";
        public static final String IMS_EMAIL_REQUEST_RECALL_CC = "ims.email.request.recall.cc";
        public static final String IMS_EMAIL_ASSIST_TO = "ims.email.assist.to";
        public static final String IMS_EMAIL_DAILY_RECONCILIATION_TO = "ims.email.daily.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_TO = "ims.email.status.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_CC = "ims.email.status.reconciliation.cc";
        /* Other IMS Keys */
        public static final String IMS_USE_QUEUE = "ims.use.queue";
        public static final String IMS_SERVER_RESPONSE_TIMEOUT_MILLISECONDS = "ims.server.response.timeout.milliseconds";
        public static final String IMS_POLLING_TIME_INTERVAL = "ims.polling.time.interval";
        public static final String IMS_AVAILABLE_ITEM_STATUS_CODES = "ims.available.item.status.codes";
        public static final String IMS_NOT_AVAILABLE_ITEM_STATUS_CODES = "ims.not.available.item.status.codes";
    }
}
