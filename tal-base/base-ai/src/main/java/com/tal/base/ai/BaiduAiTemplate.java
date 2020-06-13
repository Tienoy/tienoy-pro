package com.tal.base.ai;

import com.baidu.aip.ocr.AipOcr;
import com.tal.base.ai.properties.BaiduAiProperties;
import org.springframework.util.ObjectUtils;

/**
 * baidu Template
 *
 * @Author: Tal
 * @Date: 2020/6/13 11:18
 */
public class BaiduAiTemplate {

    private BaiduAiProperties baiduAiProperties;

    private AipOcr client;

    public BaiduAiTemplate(BaiduAiProperties baiduAiProperties) {
        this.baiduAiProperties = baiduAiProperties;
    }

    void init() {
        if (baiduAiProperties == null || ObjectUtils.isEmpty(baiduAiProperties)) {
            throw new RuntimeException("baidu ai properties is Empty");
        }
        String appId = baiduAiProperties.getAppId();
        String apiKey = baiduAiProperties.getApiKey();
        String secretKey = baiduAiProperties.getSecretKey();
        client = new AipOcr(appId, apiKey, secretKey);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
    }

    public AipOcr getClient() {
        return client;
    }

}
