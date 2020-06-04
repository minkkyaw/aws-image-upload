package com.min.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("mincode-image-upload-123");

    public final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
