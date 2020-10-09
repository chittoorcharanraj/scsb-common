package org.recap.util;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.recap.RecapCommonConstants;

import org.recap.model.ILSConfigProperties;
import org.recap.model.ILSOAuthConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
@Slf4j
public class PropertyUtil {

    @Value("${institution:No data available}")
    private String ilsConfigProperties;

    /**
     * Gets property value for the key and the institution
     * @param institution
     * @param propertyKey
     * @return String
     */
    public String getPropertyByInstitutionAndKey(String institution, String propertyKey) {
        JSONObject jsonObject = getPropertyByInstitution(institution);
        return jsonObject.get(propertyKey).toString();
    }

    /**
     * Gets Json object with all properties for the institution
     * @param institution
     * @return JSONObject
     */
    public JSONObject getPropertyByInstitution(String institution) {
        JSONObject json = new JSONObject(ilsConfigProperties);
        JSONObject result = json.getJSONObject(institution);
        return result;
    }

    /**
     * Gets a DTO with all properties for the institution
     * @param institution
     * @return ILSConfigProperties
     */
    public ILSConfigProperties getILSConfigProperties(String institution) {
        ILSConfigProperties ilsConfigProperties = null;
        Gson gson = new Gson();
        try {
            JSONObject institutionSpecificJson = getPropertyByInstitution(institution);
            ilsConfigProperties = gson.fromJson(institutionSpecificJson.toString(), ILSConfigProperties.class);
            /*String protocol = institutionSpecificJson.get(RecapCommonConstants.PROTOCOL).toString();
            log.info("Protocol: {}", protocol);
            if (RecapCommonConstants.REST_PROTOCOL.equalsIgnoreCase(protocol)) {
                ilsConfigProperties = gson.fromJson(institutionSpecificJson.toString(), ILSOAuthConfigProperties.class);
            } else {
                ilsConfigProperties = gson.fromJson(institutionSpecificJson.toString(), ILSConfigProperties.class);
            }*/
            log.info(ilsConfigProperties.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ilsConfigProperties;
    }
}
