package com.tal.inter.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

/**
 * rpc client config
 *
 * @author tal
 */
public class CommonClientConfig {

    @Bean
    public Request.Options feignRequestOptions() {
        int connectTimeoutMillis = 30 * 1000;
        int readTimeoutMillis = 30 * 1000;
        return new Request.Options(connectTimeoutMillis, readTimeoutMillis);
    }

    @Bean
    public Retryer feignRetry() {
        return Retryer.NEVER_RETRY;
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}