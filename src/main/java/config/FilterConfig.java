package config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import filter.JwtValidationFilter;

@Configuration
public class FilterConfig {
    @Bean
    FilterRegistrationBean<JwtValidationFilter> JwtFilter(JwtValidationFilter jwtValidatorFilter) {
        FilterRegistrationBean<JwtValidationFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(jwtValidationFilter);

        registrationBean.addUrlPatterns("/*");

        registrationBean.setOrder(1);

        return registrationBean;
    }
}
