package dev.abidino.redis_demo.domain;

public class CacheServiceImpl implements CacheService {

    private final CachePort cachePort;

    public CacheServiceImpl(CachePort cachePort) {
        this.cachePort = cachePort;
    }

    public void saveToCache(String key, String value, Long ttlSeconds) {
        cachePort.set(key, value, ttlSeconds);
    }

    public String getFromCache(String key) {
        return cachePort.get(key);
    }

    public void deleteFromCache(String key) {
        cachePort.delete(key);
    }

    public boolean updateInCache(String key, String value, long ttlSeconds) {
        return cachePort.update(key, value, ttlSeconds);
    }
}
