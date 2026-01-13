package com.codesnippet.springbootdemoapplication.Config;

import com.codesnippet.ecomassistance.service.DepricatedService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.codesnippet.ecomassistance",
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
classes = {DepricatedService.class}))
public class EcommerceConfig {

}
