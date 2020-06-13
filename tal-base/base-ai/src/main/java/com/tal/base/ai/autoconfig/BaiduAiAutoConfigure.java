package com.tal.base.ai.autoconfig;

import com.tal.base.ai.BaiduAiTemplate;
import com.tal.base.ai.properties.BaiduAiProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * baidu Ai
 *
 * @Author: Tal
 * @Date: 2020/6/13 11:13
 */
@Configuration
@EnableConfigurationProperties(BaiduAiProperties.class)
public class BaiduAiAutoConfigure {

    @Resource
    private BaiduAiProperties baiduAiProperties;


    @Bean(initMethod = "init")
    public BaiduAiTemplate baiduAiTemplate() {
        return new BaiduAiTemplate(baiduAiProperties);
    }

}
