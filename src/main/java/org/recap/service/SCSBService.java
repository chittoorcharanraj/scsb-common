package org.recap.service;

import org.recap.ScsbCommonConstants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
