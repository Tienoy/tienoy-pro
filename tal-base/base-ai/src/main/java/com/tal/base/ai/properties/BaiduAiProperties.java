package com.tal.base.ai.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * baidu Ai
 *
 * @Author: Tal
 * @Date: 2020/6/13 11:10
 */
@Data
@ConfigurationProperties("baidu.ai")
public class BaiduAiProperties {

    private String appId;

    private String apiKey;

    private String secretKey;

}
