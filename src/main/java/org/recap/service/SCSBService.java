package org.recap.service;

import org.recap.ScsbCommonConstants;
import org.recap.model.jpa.CollectionGroupEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dinakar on 01/05/21
 */
@Service
public class SCSBService {
    public boolean validateUserRoles(List<String> userRoles, String userCode, String itemCode) {
        for (String userRole : userRoles){
            if(userRole.equalsIgnoreCase(ScsbCommonConstants.ROLE_RECAP) || userRole.equalsIgnoreCase(ScsbCommonConstants.ROLE_SUPER_ADMIN)
                    || userCode.equalsIgnoreCase(itemCode))
                return ScsbCommonConstants.BOOLEAN_TRUE;
        }
        return ScsbCommonConstants.BOOLEAN_FALSE;
    }
    public List<Integer> getKeysByValues(List<String> values, Map<Integer, String> map) {
        List<Integer> listKeys = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(values.stream().anyMatch(entry.getValue()::equalsIgnoreCase))
                listKeys.add(entry.getKey());
        }
        return listKeys;
    }
    public List<String> pullCGDCodesList(List<CollectionGroupEntity> collectionGroupEntities){
        List<String> cgdCodesList = new ArrayList<>();
        for (CollectionGroupEntity collectionGroupEntity : collectionGroupEntities){
            if(!collectionGroupEntity.getCollectionGroupCode().equalsIgnoreCase(ScsbCommonConstants.NA))
                cgdCodesList.add(collectionGroupEntity.getCollectionGroupCode());
        }
        return cgdCodesList;
    }
    public Map<String, Date> dateFormatter(String fromDate, String toDate) throws Exception{
        Map<String,Date> dateMap = new HashMap<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ScsbCommonConstants.SIMPLE_DATE_FORMAT_REPORTS);
        Date requestFromDate = simpleDateFormat.parse(fromDate);
        Date requestToDate = simpleDateFormat.parse(toDate);
        Date fromDateAfter = getFromDate(requestFromDate);
        Date toDateAfter = getToDate(requestToDate);
        dateMap.put("fromDate",fromDateAfter);
        dateMap.put("toDate",toDateAfter);
        return  dateMap;
    }
    /**
     * For the given date this method will add the start time of the day.
     *
     * @param createdDate the created date
     * @return the from date
     */
    public Date getFromDate(Date createdDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(createdDate);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    /**
     * For the given date this method will add the end time of the day.
     *
     * @param createdDate the created date
     * @return the to date
     */
    public Date getToDate(Date createdDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(createdDate);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }
}
