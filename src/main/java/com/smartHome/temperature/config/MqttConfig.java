package com.smartHome.temperature.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@IntegrationComponentScan
@ConfigurationProperties(prefix = "iot.mqtt")
public class MqttConfig {

    private String servers;

    private String clientId;

    private String serverClientId;

    private String defaultTopic;

}
