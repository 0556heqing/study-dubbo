package com.heqing.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.heqing.dubbo.api.DemoService;
import com.heqing.dubbo.model.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/study")
public class DemoController {

    private  final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Reference(version = "1.0.0", check = false, timeout=1000)
    DemoService demoService;

    @GetMapping("/dubbo")
    public String dubbo(){
        ResponseInfo<String> resp = demoService.helloDubbo();
        log.info("--> {}", resp);
        String dubbo = resp.isSuccessful() ? resp.getData() : "error";
        return "hello " + dubbo;
    }

}
