/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.server.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.unitycatalog.server.model.ModelInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ListModelsResponse
 */
@JsonPropertyOrder({
  ListModelsResponse.JSON_PROPERTY_MODEL_VERSIONS,
  ListModelsResponse.JSON_PROPERTY_NEXT_PAGE_TOKEN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ListModelsResponse {
  public static final String JSON_PROPERTY_MODEL_VERSIONS = "model_versions";
  private List<ModelInfo> modelVersions = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public ListModelsResponse() {
  }

  public ListModelsResponse modelVersions(List<ModelInfo> modelVersions) {
    
    this.modelVersions = modelVersions;
    return this;
  }

  public ListModelsResponse addModelVersionsItem(ModelInfo modelVersionsItem) {
    if (this.modelVersions == null) {
      this.modelVersions = new ArrayList<>();
    }
    this.modelVersions.add(modelVersionsItem);
    return this;
  }

   /**
   * An array of model information objects.
   * @return modelVersions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModelInfo> getModelVersions() {
    return modelVersions;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelVersions(List<ModelInfo> modelVersions) {
    this.modelVersions = modelVersions;
  }


  public ListModelsResponse nextPageToken(String nextPageToken) {
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages. __page_token__ should be set to this value for the next request (for the next page of results). 
   * @return nextPageToken
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageToken() {
    return nextPageToken;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListModelsResponse listModelsResponse = (ListModelsResponse) o;
    return Objects.equals(this.modelVersions, listModelsResponse.modelVersions) &&
        Objects.equals(this.nextPageToken, listModelsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResponse {\n");
    sb.append("    modelVersions: ").append(toIndentedString(modelVersions)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

