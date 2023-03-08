package com.will.dubbo.consumer.annotation.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableDubbo(scanBasePackages = "com.will.dubbo.consumer")
@ComponentScan(value = {"com.will.dubbo.consumer"})
public class ConsumerConfiguration {
    @Bean // 应用配置
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-consumer");
        Map<String, String> stringStringMap = new HashMap<String, String>();
        stringStringMap.put("qos.enable","true");
        stringStringMap.put("qos.accept.foreign.ip","false");
        stringStringMap.put("qos.port","33333");
        applicationConfig.setParameters(stringStringMap);
        return applicationConfig;
    }

    @Bean // 服务消费者配置
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

    @Bean // 配置注册中心
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setCheck(false);
        registryConfig.setPort(2181);
        return registryConfig;
    }

//    @Bean // #4 使用协议配置，这里使用 dubbo
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//    }
}
