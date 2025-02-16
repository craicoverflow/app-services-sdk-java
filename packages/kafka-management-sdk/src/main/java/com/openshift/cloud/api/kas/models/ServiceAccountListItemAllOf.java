/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ServiceAccountListItemAllOf
 */
@JsonPropertyOrder({
  ServiceAccountListItemAllOf.JSON_PROPERTY_ID,
  ServiceAccountListItemAllOf.JSON_PROPERTY_CLIENT_ID,
  ServiceAccountListItemAllOf.JSON_PROPERTY_NAME,
  ServiceAccountListItemAllOf.JSON_PROPERTY_OWNER,
  ServiceAccountListItemAllOf.JSON_PROPERTY_CREATED_AT,
  ServiceAccountListItemAllOf.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ServiceAccountListItem_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceAccountListItemAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;


  public ServiceAccountListItemAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * server generated unique id of the service account
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "server generated unique id of the service account")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ServiceAccountListItemAllOf clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * client id of the service account
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client id of the service account")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ServiceAccountListItemAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the service account
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the service account")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ServiceAccountListItemAllOf owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * owner of the service account
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "owner of the service account")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ServiceAccountListItemAllOf createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * service account creation timestamp
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "service account creation timestamp")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ServiceAccountListItemAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description of the service account
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description of the service account")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountListItemAllOf serviceAccountListItemAllOf = (ServiceAccountListItemAllOf) o;
    return Objects.equals(this.id, serviceAccountListItemAllOf.id) &&
        Objects.equals(this.clientId, serviceAccountListItemAllOf.clientId) &&
        Objects.equals(this.name, serviceAccountListItemAllOf.name) &&
        Objects.equals(this.owner, serviceAccountListItemAllOf.owner) &&
        Objects.equals(this.createdAt, serviceAccountListItemAllOf.createdAt) &&
        Objects.equals(this.description, serviceAccountListItemAllOf.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, owner, createdAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountListItemAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

