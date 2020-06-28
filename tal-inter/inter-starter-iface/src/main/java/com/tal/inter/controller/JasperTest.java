package com.tal.inter.controller;

import com.tal.base.core.ResultData;
import com.tal.inter.rpc.JasperClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Tal
 * @Date: 2020/6/28 09:29
 */
@RestController
@RequestMapping("/jasper")
@RequiredArgsConstructor
public class JasperTest {

    private final JasperClient jasperClient;

    @GetMapping("/hello-jasper")
    public ResultData<String> test() {
        return jasperClient.jasperTest();
    }
}
