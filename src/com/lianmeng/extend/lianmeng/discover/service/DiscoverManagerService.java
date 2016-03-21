/**************************************************************************************** 
 Copyright © 2015-2020  LianMeng Corporation. All rights reserved. Reproduction or <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.lianmeng.extend.lianmeng.discover.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.lianmeng.core.framework.bo.server.DynamicDict;
import com.lianmeng.core.framework.bo.server.IAction;
import com.lianmeng.core.framework.exceptions.AppException;
import com.lianmeng.core.framework.rest.app.util.ServiceObjectToJsonUtil;
import com.lianmeng.extend.lianmeng.discover.domain.DiscoverManager;

/** 
 * Description: <br> 
 *  
 * @author XXX<br>
 * @version 8.0<br>
 * @taskId <br>
 * @CreateDate 2015-12-21 <br>
 * @since V8<br>
 * @see com.lianmeng.extend.lianmeng.home.service <br>
 */

public class DiscoverManagerService implements IAction {

    /**
     * DiscoverManager <br>
     */
    private DiscoverManager discoverManager;

    public void setDiscoverManager(DiscoverManager discoverManager) {
        this.discoverManager = discoverManager;
    }
    
    /**
     * Description: <br> 
     *  
     * @author XXX<br>
     * @taskId <br>
     * @param aDict DynamicDict
     * @return 0 
     * @throws AppException <br>
     */
    @Override
    public int perform(DynamicDict aDict) throws AppException {
        String action = (String) aDict.getValueByName("ACTION");
        this.discoverManager.clear();
        if (StringUtils.equals(action, "QRYDISCOVERHOME")) {
            aDict.set("DATA_INFO", this.discoverManager.queryDisCoverHomeList());
            String data = "";
            
            HashMap map1 = new HashMap();

            map1.put("photo_id", 9614662); 
            map1.put("unm", "雁亦亦亦亦"); 
            map1.put("uid", 1053025);
            map1.put("cmts", new ArrayList());
            map1.put("good", false); 
            map1.put("common", false); 
            map1.put("price", 0);
            map1.put("rid", 88270700); 
            map1.put("buylnk", "");
            map1.put("zanc", 0);
            map1.put("sta", 0);
            map1.put("ava", "http://cdn.duitang.com/uploads/people/201409/30/20140930221524_QV2v4.thumb.24_24_c.jpeg"); 
            map1.put("coupon_price", 0);
            map1.put("albnm", "插画");
            map1.put("iwd", 800);
            map1.put("iht", 1147);
            map1.put("albid", 1733789); 
            map1.put("favc", 451);
            map1.put("tid", null);
            map1.put("ruid", 209821); 
            map1.put("id", 130972573);
            map1.put("repc", 0);
            map1.put("isrc", "http://img4.duitang.com/uploads/item/201307/29/20130729153409_YCfU2.thumb.224_0.jpeg"); 
            map1.put("msg", "╯з ︶ღ 麽麽");
            
            
            HashMap map2 = new HashMap();

            map2.put("photo_id", 9614663); 
            map2.put("unm", "雁亦亦亦亦"); 
            map2.put("uid", 1053023);
            map2.put("cmts", new ArrayList());
            map2.put("good", false); 
            map2.put("common", false); 
            map2.put("price", 0);
            map2.put("rid", 88270701); 
            map2.put("buylnk", "");
            map2.put("zanc", 0);
            map2.put("sta", 0);
            map2.put("ava", "http://cdn.duitang.com/uploads/people/201409/30/20140930221524_QV2v4.thumb.24_24_c.jpeg"); 
            map2.put("coupon_price", 0);
            map2.put("albnm", "插画");
            map2.put("iwd", 800);
            map2.put("iht", 1147);
            map2.put("albid", 1733789); 
            map2.put("favc", 451);
            map2.put("tid", null);
            map2.put("ruid", 209821); 
            map2.put("id", 130972573);
            map2.put("repc", 0);
            map2.put("isrc", "http://img4.duitang.com/uploads/item/201307/29/20130729153409_YCfU2.thumb.224_0.jpeg"); 
            map2.put("msg", "hey_boy");
            
            ArrayList mapList = new ArrayList();
            mapList.add(map1);
            mapList.add(map2);

            HashMap mapAll = new HashMap();
            mapAll.put("picsize", "");
            mapAll.put("hasrp", true);
            mapAll.put("has_next", true);
            mapAll.put("pgsource", "ad_");
            mapAll.put("first_blog", map1);
            mapAll.put("coupon", false);
            mapAll.put("nopth", true);
            mapAll.put("blogs", mapList);

            aDict.set("data", mapAll);
            aDict.set("success", true);
            aDict.set(ServiceObjectToJsonUtil.RESPONSE_CODE, "discoverHome");
        }
        
        else {
            aDict.set(ServiceObjectToJsonUtil.RESPONSE_CODE, "discover");
        }
        
        
        
        
        return 0;
    }

    
    
    
}
