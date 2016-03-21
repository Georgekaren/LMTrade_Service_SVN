/**************************************************************************************** 
 Copyright © 2015-2020  LianMeng Corporation. All rights reserved. Reproduction or <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.lianmeng.extend.lianmeng.discover.domain;

import java.util.ArrayList;
import java.util.HashMap;

import com.lianmeng.core.framework.exceptions.AppException;
import com.lianmeng.extend.lianmeng.discover.dao.DiscoverManagerDAO;

/** 
 * Description: <br> 
 *  
 * @author XXX<br>
 * @version 8.0<br>
 * @taskId <br>
 * @CreateDate 2015-12-21 <br>
 * @since V8<br>
 * @see com.lianmeng.extend.lianmeng.home.domain <br>
 */

public class DiscoverManager extends AbstractDiscoverManager {

    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = -37984139298003341L;

    /**
     * homenManagerDAO <br>
     */
    private DiscoverManagerDAO discoverManagerDAO;

    public void setDiscoverManagerDAO(DiscoverManagerDAO discoverManagerDAO) {
        this.discoverManagerDAO = discoverManagerDAO;
    }
    
    @Override
    public ArrayList<HashMap<String, String>> queryDisCoverHomeList() throws AppException {
        return this.discoverManagerDAO.queryDisCoverHomeList();
    }
    
   
}
