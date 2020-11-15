package com.ruoyi.common.swagger.annotation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@Import({ SwaggerAutoConfiguration.class })
public @interface EnableCustomSwagger2
{

}
