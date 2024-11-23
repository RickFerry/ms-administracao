package com.microservices.condominio.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@AllArgsConstructor
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private final JwtTokenStore store;

    public static final String[] PUBLIC = {""};
    public static final String[] OPERATOR = {""};
    public static final String[] ADMIN = {""};

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.tokenStore(store);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(requests -> requests
//                        .antMatchers(PUBLIC).permitAll()
//                        .antMatchers(HttpMethod.GET, OPERATOR).hasAnyRole("OPERATOR", "ADMIN")
//                        .antMatchers(ADMIN).hasRole("ADMIN")
//                        .anyRequest().permitAll())
                        .anyRequest().authenticated())
                .sessionManagement(management -> management
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .csrf(AbstractHttpConfigurer::disable);
    }
}
