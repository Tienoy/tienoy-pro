package com.tal.inter.rpc;

import com.tal.base.core.ResultData;
import com.tal.inter.config.CommonClientConfig;
import com.tal.inter.fallback.JasperClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Tal
 * @Date: 2020/6/28 09:36
 */
@FeignClient(name = "experiment", path = "/jasper", configuration = CommonClientConfig.class, fallbackFactory = JasperClientFallbackFactory.class)
public interface JasperClient {

    /**
     * test
     *
     * @return
     */
    @GetMapping("/hello-world")
    ResultData<String> jasperTest();
}
