package com.heqing.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heqing
 * @date 2021/7/14 10:40
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplication(DubboProviderApplication.class).run(args);
    }

}
