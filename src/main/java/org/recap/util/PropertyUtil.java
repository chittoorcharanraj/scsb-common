package org.recap.util;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.recap.model.ILSConfigProperties;
import org.recap.model.IMSConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RefreshScope
@Service
@Slf4j
public class PropertyUtil {

    @Value("${institution:No data available}")
    private String ilsConfigProperties;

    @Value("${ims_location:No data available}")
    private String imsConfigProperties;


    /**
     * To get the list of all institution codes.
     * @return
     */
    public List<String> getAllInstitutions() {
        JSONObject json = new JSONObject(ilsConfigProperties);
        Map<String,Object> institutionMap= json.toMap();
        Set<String> institutionSet = new HashSet<>();
        for (String institution : institutionMap.keySet()) {
            if(!StringUtils.isEmpty(institution)){
                institutionSet.add(institution);
            }

        }
        return new ArrayList<>(institutionSet);
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
     * Gets property value for the key and the institution
     * @param imsLocation
     * @param propertyKey
     * @return String
     */
    public String getPropertyByImsLocationAndKey(String imsLocation, String propertyKey) {
        JSONObject jsonObject = getPropertyByImsLocation(imsLocation);
        return jsonObject.get(propertyKey).toString();
    }

    /**
     * Gets property value for the key and the institution and the ims location
     * @param institution
     * @param imsLocation
     * @param propertyKey
     * @return String
     */
    public String getPropertyByInstitutionAndLocationAndKey(String institution, String imsLocation, String propertyKey) {
        JSONObject jsonObject = getPropertyByInstitution(institution);
        JSONObject jsonLocationObject = jsonObject.getJSONObject(imsLocation);
        return jsonLocationObject.get(propertyKey).toString();
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
     * Gets Json object with all properties for the institution
     * @param imsLocation
     * @return JSONObject
     */
    public JSONObject getPropertyByImsLocation(String imsLocation) {
        JSONObject json = new JSONObject(imsConfigProperties);
        JSONObject result = json.getJSONObject(imsLocation);
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

    /**
     * Gets a DTO with all properties for the ims location
     * @param imsLocation
     * @return ILSConfigProperties
     */
    public IMSConfigProperties getIMSConfigProperties(String imsLocation) {
        IMSConfigProperties imsConfigProperties = null;
        Gson gson = new Gson();
        try {
            JSONObject imsLocationSpecificJson = getPropertyByImsLocation(imsLocation);
            imsConfigProperties = gson.fromJson(imsLocationSpecificJson.toString(), IMSConfigProperties.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return imsConfigProperties;
    }
}
