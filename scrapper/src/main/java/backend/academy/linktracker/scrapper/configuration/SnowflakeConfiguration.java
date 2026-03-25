package backend.academy.linktracker.scrapper.configuration;

import backend.academy.linktracker.scrapper.properties.SnowflakeProperties;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowflakeConfiguration {
    @Bean
    public Snowflake snowFlake(SnowflakeProperties properties) {
        return IdUtil.getSnowflake(properties.getWorkerID(), properties.getDatacenterID());
    }
}
