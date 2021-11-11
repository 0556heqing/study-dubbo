package com.heqing.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.heqing.dubbo.api.DemoService;
import com.heqing.dubbo.model.ResponseInfo;
import org.springframework.stereotype.Component;

/**
 *
 * @author heqing
 * @date 2021/7/20 11:36
 *
 * @Service dubbo的service注解，不具备spring的@service注解的功能
 */
@Service(version = "1.0.0")
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public ResponseInfo<String> helloDubbo() {
        return ResponseInfo.buildSuccess("dubbo");
    }
}
