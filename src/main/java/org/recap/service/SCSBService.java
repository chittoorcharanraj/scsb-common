package org.recap.service;

import org.recap.RecapCommonConstants;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dinakar on 01/05/21
 */
@Service
public class SCSBService {
    public boolean validateUserRoles(List<String> userRoles, String userCode, String itemCode) {
        for (String userRole : userRoles){
            if(userRole.equalsIgnoreCase(RecapCommonConstants.ROLE_RECAP) || userRole.equalsIgnoreCase(RecapCommonConstants.ROLE_SUPER_ADMIN)
                    || userCode.equalsIgnoreCase(itemCode))
                return RecapCommonConstants.BOOLEAN_TRUE;
        }
        return RecapCommonConstants.BOOLEAN_FALSE;
    }
}
