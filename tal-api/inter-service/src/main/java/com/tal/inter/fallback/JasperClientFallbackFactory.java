package com.tal.inter.fallback;

import com.tal.base.core.BaseFallbackFactory;
import com.tal.base.core.ResultData;
import com.tal.inter.rpc.JasperClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: Tal
 * @Date: 2020/6/28 09:41
 */
@Slf4j
@Component
public class JasperClientFallbackFactory extends BaseFallbackFactory implements FallbackFactory<JasperClient> {
    @Override
    public JasperClient create(Throwable throwable) {
        return new JasperClient() {
            @Override
            public ResultData<String> jasperTest() {
                log.error("jasperTest ", throwable);
                return getExceptionResultData(throwable);
            }
        };
    }
}
