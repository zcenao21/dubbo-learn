package com.will.dubbo.consumer;

import com.will.dubbo.provider.iface.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml方式启动
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        String str = providerService.SayHello("hello will");
        System.out.println(str);
        System.in.read();
    }
}
