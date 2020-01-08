package com.qkt.face.gun.service.impl;

import com.qkt.face.gun.configuration.AppInfoConfiguration;
import com.qkt.face.gun.service.GunIdentifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 对接支付宝枪机应用，获取人脸识别记录
 */
@Service("gunIdentifyServiceImpl")
public class GunIdentifyServiceImpl implements GunIdentifyService {

    @Autowired
    AppInfoConfiguration.AppInfo appInfo;

}
