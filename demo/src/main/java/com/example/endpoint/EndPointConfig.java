package com.example.endpoint;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zf-42 on 2017/4/9.
 */
@Configuration
public class EndPointConfig {
    @Bean
    public static Endpoint<String> servertimes() {
        return new ServerTimeEndPoint();
    }

}
