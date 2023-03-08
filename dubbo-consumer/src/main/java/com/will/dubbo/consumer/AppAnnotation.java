package com.will.dubbo.consumer;

import com.will.dubbo.consumer.annotation.Annotation.ConsumerAnnotationService;
import com.will.dubbo.consumer.annotation.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * 配置方式启动
 *
 */
public class AppAnnotation
{
    public static void main( String[] args ) throws IOException {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String hello = consumerAnnotationService.sayHello("annotation"); // 调用方法
        System.out.println("result: " + hello); // 输出结果
    }
}
