package top.devhub.website.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.devhub.website.filter.RequestFilter;

import javax.servlet.Filter;

/**
 * Created by Adam.Zhang on 2017/7/10.
 */
@Configuration
public class Filters {
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(requestFilter());
        registration.addUrlPatterns("*");
        registration.setName("requestFilter");
        registration.setOrder(1);
        return registration;
    }

    public Filter requestFilter() {
        return new RequestFilter();
    }
}
