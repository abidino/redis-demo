package dev.abidino.redis_demo.domain;

public interface CachePort {
    void set(String key, String value, Long ttlSeconds);

    String get(String key);

    void delete(String key);

    boolean update(String key, String value, long ttlSeconds);
}