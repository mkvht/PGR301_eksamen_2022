package no.shoppifly;

import io.micrometer.cloudwatch2.CloudWatchConfig;
import io.micrometer.cloudwatch2.CloudWatchMeterRegistry;
import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.aop.TimedAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cloudwatch.CloudWatchAsyncClient;

import java.time.Duration;
import java.util.Map;

@Configuration
public class MetricsConfig {
    private CloudWatchConfig cloudWatchConfigSetup(){
        return new CloudWatchConfig() {
            private Map<String, String> config = Map.of(
                "cloudwatch.namespace", "1004",
                "cloudwatch.step", Duration.ofSeconds(5).toString()
            );

            @Override
            public String get(String key) {
                return config.get(key);
            }
        };
    }
    @Bean
    public TimedAspect timedAspect(MeterRegistry meterRegistry) {
        return new TimedAspect(meterRegistry);
    }

    @Bean
    public MeterRegistry meterRegistry() {
        CloudWatchConfig cloudWatchConfig = cloudWatchConfigSetup();
        return new CloudWatchMeterRegistry(cloudWatchConfig, Clock.SYSTEM, cloudWatchAsyncClient());
    }

    @Bean
    public CloudWatchAsyncClient cloudWatchAsyncClient(){
        return CloudWatchAsyncClient.builder().region(Region.EU_WEST_1).build();
    }
}
