package com.zhiyou100.dumplings.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Classname RedisConfig
 * @Description TODO
 * @Author Knight
 * @Date 2019/7/11 14:07
 * @Version 2.0
 **/
@Configuration
@PropertySource(value = "classpath:redis.properties")
public class JedisConfig {
    private Logger logger = LoggerFactory.getLogger(JedisConfig.class);
    //注入redis相关配置信息
    @Value("${redis.hostName}")
    private String hostName;
    @Value("${redis.port}")
    private Integer port;
    @Value("${redis.timeout}")
    private Integer timeout;
    @Value("${redis.maxIdle}")
    private Integer maxIdle;
    @Value("${redis.maxWaitMillis}")
    private Long maxWaitMillis;
    @Value("${redis.maxTotal}")
    private Integer maxTotal;
    //创建JedisPool
    @Bean
    public JedisPool jedisPool(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxWaitMillis(maxWaitMillis);
        JedisPool jedisPool = new JedisPool(poolConfig, hostName, port, timeout);
        //打印日志
        logger.info("注册JedisPool成功"+jedisPool);
        logger.info("redis的地址是："+hostName+"端口是："+port);
        return jedisPool;
    }
}
