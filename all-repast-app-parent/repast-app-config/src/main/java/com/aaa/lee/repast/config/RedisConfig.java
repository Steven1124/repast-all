package com.aaa.lee.repast.config;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/3/9 20:47
 * @Description  redis通过redisProperties获取jedisCluster操作redis数据库
 **/
// @Configuration
public class RedisConfig {

    /*@Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisCluster getJedisCluster() {
        String nodes = redisProperties.getNodes();
        String[] split = nodes.split(",");
        Set<HostAndPort> hostAndPortSet = new HashSet<HostAndPort>();
        for(String hostPort : split) {
            String[] split1 = hostPort.split(":");
            HostAndPort hostAndPort = new HostAndPort(split1[0], Integer.parseInt(split1[1]));
            hostAndPortSet.add(hostAndPort);
        }
        JedisCluster jedisCluster = new JedisCluster(hostAndPortSet, redisProperties.getCommandTimeout(), redisProperties.getMaxAttempts());
        return jedisCluster;
    }*/

}
