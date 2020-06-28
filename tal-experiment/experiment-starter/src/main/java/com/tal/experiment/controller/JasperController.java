package com.tal.experiment.controller;

import com.tal.base.core.ResultData;
import com.tal.experiment.service.JasperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Tal
 * @Date: 2020/6/18 14:37
 */
@RestController
@RequestMapping("/jasper")
@RequiredArgsConstructor
public class JasperController {

    private final JasperService jasperService;


    @GetMapping("/hello-world")
    public ResultData<String> jasperTest() {
        return ResultData.buildSuccessResult(jasperService.test());
    }


}
