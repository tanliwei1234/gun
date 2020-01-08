package com.qkt.face.gun.service.impl;

import com.qkt.face.gun.configuration.AppInfoConfiguration;
import com.qkt.face.gun.service.GunIdentifyService;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 对接支付宝枪机应用，获取人脸识别记录
 */
@Service
public class GunIdentifyServiceImpl implements GunIdentifyService {

    @Autowired
    AppInfoConfiguration.AppInfo appInfo;

    public void abc(){
        appInfo.getA();

    }
}
