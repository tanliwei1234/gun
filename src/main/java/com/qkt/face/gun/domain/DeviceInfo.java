package com.qkt.face.gun.domain;

import lombok.Data;

/**
 * 枪机设备信息
 */
@Data
public class DeviceInfo {

    private String deviceSn;

    private String deviceId;

    private String sceneOrgId;

    private String schoolOrgId;

    private String deviceName;

    private String deviceHost;

    private String devicePort;

    private String deviceModel;

}
