package dev.abidino.redis_demo.domain;

public interface CacheService {
    void saveToCache(String key, String value, Long ttlSeconds);

    String getFromCache(String key);

    void deleteFromCache(String key);

    boolean updateInCache(String key, String value, long ttlSeconds);
}