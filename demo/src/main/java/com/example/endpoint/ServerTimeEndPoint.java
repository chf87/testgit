package com.example.endpoint;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zf-42 on 2017/4/9.
 */
@ConfigurationProperties(prefix = "endpoints.servertimes")
public class ServerTimeEndPoint extends AbstractEndpoint<String> {

    public ServerTimeEndPoint() {
        super("servertimes",true);
    }

    @Override
    public String invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
