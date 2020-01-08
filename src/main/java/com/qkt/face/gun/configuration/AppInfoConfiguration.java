package com.qkt.face.gun.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppInfoConfiguration
{

    /**
     * 本地应用配置类
     */
    @Component
    @ConfigurationProperties(prefix = "app.info")
    @Setter
    @Getter
    public static class AppInfo{

        private String a;
        // 列举本地应用参数

    }
}
