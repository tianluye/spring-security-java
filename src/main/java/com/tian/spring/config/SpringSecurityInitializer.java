package com.tian.spring.config;

/**
 * @author tian.lue
 */
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
    会自动地加载 springSecurityFilterChain
    <filter>
        <filter-name>springSecurityFilterChain</filter-name>
        <filter-class>org.springframework.web.filter.DelegatingFilterProxy
        </filter-class>
    </filter>
    <filter-mapping>
        <filter-name>springSecurityFilterChain</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
 */
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    //do nothing
}
