package backend.academy.linktracker.scrapper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.JacksonJsonHttpMessageConverter;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.json.JsonMapper;

@Configuration
public class RestClientConfig {
    @Bean
    public RestClient restClient(RestClient.Builder builder, JsonMapper jsonMapper) {
        HttpMessageConverter<?> converter = new JacksonJsonHttpMessageConverter(jsonMapper);

        return builder.configureMessageConverters(clientBuilder -> clientBuilder.withJsonConverter(converter))
                .build();
    }

    @Bean("githubRestClient")
    public RestClient githubRestClient(RestClient.Builder builder, JsonMapper jsonMapper) {
        HttpMessageConverter<?> converter = new JacksonJsonHttpMessageConverter(jsonMapper);
        var additionalMapper = JsonMapper.builder().addModule(JacksonConfig.customGithubAPIEventModule());
        HttpMessageConverter<?> additionalConverter = new JacksonJsonHttpMessageConverter(additionalMapper);

        return builder.configureMessageConverters(clientBuilder ->
                        clientBuilder.withJsonConverter(converter).withJsonConverter(additionalConverter))
                .build();
    }
}
