package com.will.dubbo.provider.impl;

import com.will.dubbo.provider.iface.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    public String SayHello(String word) {
        return word;
    }
}