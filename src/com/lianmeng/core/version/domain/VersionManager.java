/**************************************************************************************** 
 Copyright © 2015-2020  LianMeng Corporation. All rights reserved. Reproduction or <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.lianmeng.core.version.domain;

import java.util.HashMap;

import com.lianmeng.core.framework.exceptions.AppException;
import com.lianmeng.core.version.dao.VersionManagerDAO;

/** 
 * Description: <br> 
 *  
 * @author XXX<br>
 * @version 8.0<br>
 * @taskId <br>
 * @CreateDate 2015-12-21 <br>
 * @since V8<br>
 * @see com.lianmeng.core.version.domain <br>
 */

public class VersionManager extends AbstractVersionManager {

    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = -4714789140885089002L;
    
    /**
     * versionManagerDAO <br>
     */
    private VersionManagerDAO versionManagerDAO;

    public void setVersionManagerDAO(VersionManagerDAO versionManagerDAO) {
        this.versionManagerDAO = versionManagerDAO;
    }
    
    @Override
    public HashMap<String, String> qryVersionDataById() throws AppException {
        return this.versionManagerDAO.selectById("");
    }

}
