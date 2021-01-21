package org.recap.util;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.recap.model.ILSConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@RefreshScope
@Service
@Slf4j
public class PropertyUtil {

    @Value("${institution:No data available}")
    private String ilsConfigProperties;

    public Set<String> getAllInstitutions() {
        JSONObject json = new JSONObject(ilsConfigProperties);
        Map<String,Object> institutionMap= json.toMap();
        Set<String> institutions = institutionMap.keySet();
        return institutions;
    }

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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ilsConfigProperties;
    }
}
