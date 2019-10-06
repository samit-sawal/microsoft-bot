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
    return new MicrosoftAppCredentials("e1cbc61d-7f73-4267-9631-91f885eb97d9",
        "0vjuoeCUf4Mv/vj=qhNVngJ=XD0w0Tb.");
  }

  @Bean
  public List<ResourceResponse> getResponses(){
    return new ArrayList<ResourceResponse>();
  }
}