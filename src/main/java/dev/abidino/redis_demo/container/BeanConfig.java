package dev.abidino.redis_demo.container;

import dev.abidino.redis_demo.domain.CachePort;
import dev.abidino.redis_demo.domain.CacheService;
import dev.abidino.redis_demo.domain.CacheServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CacheService cacheService(CachePort cachePort){
        return new CacheServiceImpl(cachePort);
    }
}
