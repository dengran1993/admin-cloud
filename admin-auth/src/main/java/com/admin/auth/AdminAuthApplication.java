package com.admin.auth;

import com.admin.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 认证授权中心
 * 
 * @author dengran
 */
@EnableRyFeignClients
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AdminAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AdminAuthApplication.class, args);
    }
}
