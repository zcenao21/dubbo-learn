package com.will.dubbo.consumer.annotation.Annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.will.dubbo.annotation.provider.ProviderServiceAnnotation;
import org.springframework.stereotype.Component;

@Component("annotatedConsumer")
public class ConsumerAnnotationService {
    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String sayHello(String word){
        return providerServiceAnnotation.sayHelloAnnotation(word);
    }
}