package org.recap.service;

import org.recap.ScsbCommonConstants;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
