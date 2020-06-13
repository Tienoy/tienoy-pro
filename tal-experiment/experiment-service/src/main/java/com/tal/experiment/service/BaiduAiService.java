package com.tal.experiment.service;

import com.baidu.aip.ocr.AipOcr;
import com.tal.base.ai.BaiduAiTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * baidu ai interface
 *
 * @Author: Tal
 * @Date: 2020/6/13 15:08
 */
@Service
public class BaiduAiService {

    @Resource
    private BaiduAiTemplate baiduAiTemplate;


    public AipOcr getAipOcr() {
        return baiduAiTemplate.getClient();
    }

}
