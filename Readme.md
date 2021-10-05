## Simple Project with S3 SDK

This is a simple project to demonstrate how to access S3 data from java application.

### Setup
1. enable public access on S3
2. add policy on S3. example: `s3/policy.json`
3. define S3 bucket name on `application.yml`
4. add env variables for credential:
   1. `AWS_ACCESS_KEY_ID`
   2. `AWS_SECRET_ACCESS_KEY`