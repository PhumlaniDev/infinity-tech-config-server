package com.phumlanidev.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Comment: this is the placeholder for documentation.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

  /**
   * Comment: this is the placeholder for documentation.
   */
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }

}
