package com.vst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    // Allow local frontends running on various localhost ports during development
    // Use allowedOriginPatterns to allow localhost with varying ports.
    registry.addMapping("/**")
        .allowedOriginPatterns("http://localhost:*")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
        .allowedHeaders("*")
        .allowCredentials(true);
    }
}
