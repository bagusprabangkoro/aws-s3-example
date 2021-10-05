package com.myapplication.awssdk.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * // TODO Comment
 */
@Configuration
public class AwsConfiguration {

  @Bean
  public S3Client s3Client() {
    Region region = Region.AP_SOUTHEAST_1;
    return S3Client.builder()
        .region(region)
        .build();
  }
}
