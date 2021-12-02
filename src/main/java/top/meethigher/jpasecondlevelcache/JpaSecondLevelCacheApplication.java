package top.meethigher.jpasecondlevelcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;

@SpringBootApplication
public class JpaSecondLevelCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSecondLevelCacheApplication.class, args);
    }

}
