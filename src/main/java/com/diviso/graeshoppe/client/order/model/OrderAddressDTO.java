package com.diviso.graeshoppe.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderAddressDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-23T15:17:21.066+05:30[Asia/Kolkata]")

public class OrderAddressDTO   {
  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("alternatePhone")
  private Long alternatePhone = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("houseNoOrBuildingName")
  private String houseNoOrBuildingName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private Long phone = null;

  @JsonProperty("pincode")
  private Long pincode = null;

  @JsonProperty("roadNameAreaOrStreet")
  private String roadNameAreaOrStreet = null;

  @JsonProperty("state")
  private String state = null;

  public OrderAddressDTO addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public OrderAddressDTO alternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
    return this;
  }

  /**
   * Get alternatePhone
   * @return alternatePhone
  **/
  @ApiModelProperty(value = "")


  public Long getAlternatePhone() {
    return alternatePhone;
  }

  public void setAlternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  public OrderAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderAddressDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderAddressDTO houseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
    return this;
  }

  /**
   * Get houseNoOrBuildingName
   * @return houseNoOrBuildingName
  **/
  @ApiModelProperty(value = "")


  public String getHouseNoOrBuildingName() {
    return houseNoOrBuildingName;
  }

  public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
  }

  public OrderAddressDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderAddressDTO landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
  **/
  @ApiModelProperty(value = "")


  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public OrderAddressDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderAddressDTO phone(Long phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public OrderAddressDTO pincode(Long pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public Long getPincode() {
    return pincode;
  }

  public void setPincode(Long pincode) {
    this.pincode = pincode;
  }

  public OrderAddressDTO roadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
    return this;
  }

  /**
   * Get roadNameAreaOrStreet
   * @return roadNameAreaOrStreet
  **/
  @ApiModelProperty(value = "")


  public String getRoadNameAreaOrStreet() {
    return roadNameAreaOrStreet;
  }

  public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
  }

  public OrderAddressDTO state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddressDTO addressDTO = (OrderAddressDTO) o;
    return Objects.equals(this.addressType, addressDTO.addressType) &&
        Objects.equals(this.alternatePhone, addressDTO.alternatePhone) &&
        Objects.equals(this.city, addressDTO.city) &&
        Objects.equals(this.customerId, addressDTO.customerId) &&
        Objects.equals(this.houseNoOrBuildingName, addressDTO.houseNoOrBuildingName) &&
        Objects.equals(this.id, addressDTO.id) &&
        Objects.equals(this.landmark, addressDTO.landmark) &&
        Objects.equals(this.name, addressDTO.name) &&
        Objects.equals(this.phone, addressDTO.phone) &&
        Objects.equals(this.pincode, addressDTO.pincode) &&
        Objects.equals(this.roadNameAreaOrStreet, addressDTO.roadNameAreaOrStreet) &&
        Objects.equals(this.state, addressDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, alternatePhone, city, customerId, houseNoOrBuildingName, id, landmark, name, phone, pincode, roadNameAreaOrStreet, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddressDTO {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    houseNoOrBuildingName: ").append(toIndentedString(houseNoOrBuildingName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    roadNameAreaOrStreet: ").append(toIndentedString(roadNameAreaOrStreet)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
