package com.admin.system;

import com.admin.common.security.annotation.EnableCustomConfig;
import com.admin.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
//@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
//@MapperScan(basePackages = "com.admin.system.mapper")
public class AdminSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AdminSystemApplication.class, args);
    }
}
