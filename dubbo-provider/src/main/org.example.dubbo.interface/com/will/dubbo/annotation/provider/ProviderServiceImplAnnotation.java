package com.will.dubbo.annotation.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 5000)
public class ProviderServiceImplAnnotation implements ProviderServiceAnnotation{
    public String sayHelloAnnotation(String word){
        return word;
    }
}
