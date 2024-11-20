package dev.abidino.redis_demo.application;

import dev.abidino.redis_demo.domain.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
@RequiredArgsConstructor
public class CacheController {

    private final CacheService cacheService;

    @PostMapping
    public void save(@RequestParam String key, @RequestParam String value, @RequestParam(required = false) Long ttlSeconds) {
        cacheService.saveToCache(key, value, ttlSeconds);
    }

    @GetMapping
    public String get(@RequestParam String key) {
        return cacheService.getFromCache(key);
    }

    @DeleteMapping
    public void delete(@RequestParam String key) {
        cacheService.deleteFromCache(key);
    }

    @PutMapping
    public boolean update(@RequestParam String key, @RequestParam String value, @RequestParam long ttlSeconds) {
        return cacheService.updateInCache(key, value, ttlSeconds);
    }
}