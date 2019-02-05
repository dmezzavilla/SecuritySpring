package com.spring.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author Daniel Mezzavilla
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }
}