package com.demo.redis.cache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@CacheConfig
public class RedisConfig
{
	@Bean public JedisConnectionFactory jedisConnectionFactory() {

		JedisConnectionFactory jedisConnectionFactory = new
				JedisConnectionFactory();
		jedisConnectionFactory.setHostName("127.0.0.1");
		jedisConnectionFactory.setPort(6379);
		jedisConnectionFactory.setUsePool(true); return jedisConnectionFactory; }


	@Bean
	public RedisTemplate<String,Object> redisTemplate(){
		RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(this.jedisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new
				JdkSerializationRedisSerializer()); redisTemplate.setValueSerializer(new
						JdkSerializationRedisSerializer());
				redisTemplate.setEnableTransactionSupport(true);
				redisTemplate.afterPropertiesSet(); return redisTemplate; }


	/*
	 * @Bean public Object redisTemplate() { return new Object(); }
	 */


	/*
	 * @Bean RedisCacheManager cacheManager() { RedisCacheManager
	 * redisCacheManager = new RedisCacheManager(this.redisTemplate());
	 * redisCacheManager.setDefaultExpiration(30); return redisCacheManager; }
	 */
}

