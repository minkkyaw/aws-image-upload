package com.min.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "AKIAJGFUPTQF4KQPP5KQ",
                "ZXJpL3CbeSi2NMxqbSCD0E6R4Tv6tIGZHyRV2qcl"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("US East (Ohio)")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
