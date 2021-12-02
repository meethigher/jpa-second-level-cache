package top.meethigher.jpasecondlevelcache.config;

import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {
    @Bean
    public HazelcastInstance hazelcastInstance() {
        Config config = new ClasspathXmlConfig("hazelcast.xml");
        return Hazelcast.newHazelcastInstance(config);
    }
}