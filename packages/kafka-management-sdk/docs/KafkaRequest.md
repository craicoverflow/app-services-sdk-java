

# KafkaRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**kind** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**status** | **String** | Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting]  |  [optional]
**cloudProvider** | **String** | Name of Cloud used to deploy. For example AWS |  [optional]
**multiAz** | **Boolean** |  |  [optional]
**region** | **String** | Values will be regions of specific cloud provider. For example: us-east-1 for AWS |  [optional]
**owner** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**bootstrapServerHost** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]
**failedReason** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**instanceType** | **String** |  |  [optional]



