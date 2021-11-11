package com.heqing.dubbo.api;

import com.heqing.dubbo.model.ResponseInfo;

/**
 * @author heqing
 * @date 2021/7/19 20:00
 */
public interface DemoService {

    /**
     * 测试dubbo接口
     * @return
     */
    ResponseInfo<String> helloDubbo();
}
