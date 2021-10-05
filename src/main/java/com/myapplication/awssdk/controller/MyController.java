package com.myapplication.awssdk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;

/**
 * // TODO Comment
 */
@RestController
public class MyController {

  @Autowired
  S3Client s3Client;

  @Value("${s3.bucket}")
  String bucket;

  @GetMapping("/api/data/{filename}")
  public String getData(@PathVariable String filename) {
    GetObjectRequest getObjectRequest = GetObjectRequest.builder()
        .bucket(bucket)
        .key(filename)
        .build();
    ResponseBytes<GetObjectResponse> objectAsBytes = s3Client.getObjectAsBytes(getObjectRequest);
    return objectAsBytes.asUtf8String();
  }
}
