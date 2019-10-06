package com.example.config;

import com.microsoft.bot.connector.customizations.MicrosoftAppCredentials;
import com.microsoft.bot.schema.models.ResourceResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class BotConfig {

  @Autowired
  private Environment environment;

  @Bean(name = "credentials")
  public MicrosoftAppCredentials getCredentials() {
    /*return new MicrosoftAppCredentials(environment.getProperty("bot.appId"),
        environment.getProperty("bot.appPassword"));*/
    return new MicrosoftAppCredentials("3ba0a225-5467-4bf5-bfa1-691d3d4a2bc3",
        "8J?X?GuQ@CWE1CPty[KEyxqtHZWGio91");
  }

  @Bean
  public List<ResourceResponse> getResponses(){
    return new ArrayList<ResourceResponse>();
  }
}