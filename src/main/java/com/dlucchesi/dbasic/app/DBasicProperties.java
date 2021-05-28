package com.dlucchesi.dbasic.app;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

public class DBasicProperties {

    @Value("${dbasic.loadDeleted}")
    private static String pLoadDeleted;

    public static Boolean getLoadDeleted(){
        Boolean ret = Boolean.FALSE;
        if (pLoadDeleted != null && (!StringUtils.isEmpty(pLoadDeleted) && !StringUtils.isBlank(pLoadDeleted))){
            if ("TRUE".equalsIgnoreCase(pLoadDeleted)){
                ret = Boolean.TRUE;
            }
        }
        return ret;
    }
}
