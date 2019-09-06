package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserLeaves
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T06:17:29.965Z[GMT]")
public class UserLeaves   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("employeeId")
  private String employeeId = null;

  @JsonProperty("sickLeave")
  private Long sickLeave = null;

  @JsonProperty("casualLeave")
  private Long casualLeave = null;

  @JsonProperty("earnedLeave")
  private Long earnedLeave = null;

  @JsonProperty("maternityLeave")
  private Long maternityLeave = null;

  @JsonProperty("compOff")
  private Long compOff = null;

  @JsonProperty("lossOffPay")
  private Long lossOffPay = null;

  @JsonProperty("displayStatus")
  private Boolean displayStatus = true;

  public UserLeaves id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserLeaves employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  **/
  @ApiModelProperty(value = "")

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public UserLeaves sickLeave(Long sickLeave) {
    this.sickLeave = sickLeave;
    return this;
  }

  /**
   * Get sickLeave
   * @return sickLeave
  **/
  @ApiModelProperty(value = "")

  public Long getSickLeave() {
    return sickLeave;
  }

  public void setSickLeave(Long sickLeave) {
    this.sickLeave = sickLeave;
  }

  public UserLeaves casualLeave(Long casualLeave) {
    this.casualLeave = casualLeave;
    return this;
  }

  /**
   * Get casualLeave
   * @return casualLeave
  **/
  @ApiModelProperty(value = "")

  public Long getCasualLeave() {
    return casualLeave;
  }

  public void setCasualLeave(Long casualLeave) {
    this.casualLeave = casualLeave;
  }

  public UserLeaves earnedLeave(Long earnedLeave) {
    this.earnedLeave = earnedLeave;
    return this;
  }

  /**
   * Get earnedLeave
   * @return earnedLeave
  **/
  @ApiModelProperty(value = "")

  public Long getEarnedLeave() {
    return earnedLeave;
  }

  public void setEarnedLeave(Long earnedLeave) {
    this.earnedLeave = earnedLeave;
  }

  public UserLeaves maternityLeave(Long maternityLeave) {
    this.maternityLeave = maternityLeave;
    return this;
  }

  /**
   * Get maternityLeave
   * @return maternityLeave
  **/
  @ApiModelProperty(value = "")

  public Long getMaternityLeave() {
    return maternityLeave;
  }

  public void setMaternityLeave(Long maternityLeave) {
    this.maternityLeave = maternityLeave;
  }

  public UserLeaves compOff(Long compOff) {
    this.compOff = compOff;
    return this;
  }

  /**
   * Get compOff
   * @return compOff
  **/
  @ApiModelProperty(value = "")

  public Long getCompOff() {
    return compOff;
  }

  public void setCompOff(Long compOff) {
    this.compOff = compOff;
  }

  public UserLeaves lossOffPay(Long lossOffPay) {
    this.lossOffPay = lossOffPay;
    return this;
  }

  /**
   * Get lossOffPay
   * @return lossOffPay
  **/
  @ApiModelProperty(value = "")

  public Long getLossOffPay() {
    return lossOffPay;
  }

  public void setLossOffPay(Long lossOffPay) {
    this.lossOffPay = lossOffPay;
  }

  public UserLeaves displayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
    return this;
  }

  /**
   * Get displayStatus
   * @return displayStatus
  **/
  @ApiModelProperty(value = "")

  public Boolean isDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLeaves userLeaves = (UserLeaves) o;
    return Objects.equals(this.id, userLeaves.id) &&
        Objects.equals(this.employeeId, userLeaves.employeeId) &&
        Objects.equals(this.sickLeave, userLeaves.sickLeave) &&
        Objects.equals(this.casualLeave, userLeaves.casualLeave) &&
        Objects.equals(this.earnedLeave, userLeaves.earnedLeave) &&
        Objects.equals(this.maternityLeave, userLeaves.maternityLeave) &&
        Objects.equals(this.compOff, userLeaves.compOff) &&
        Objects.equals(this.lossOffPay, userLeaves.lossOffPay) &&
        Objects.equals(this.displayStatus, userLeaves.displayStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, sickLeave, casualLeave, earnedLeave, maternityLeave, compOff, lossOffPay, displayStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLeaves {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    sickLeave: ").append(toIndentedString(sickLeave)).append("\n");
    sb.append("    casualLeave: ").append(toIndentedString(casualLeave)).append("\n");
    sb.append("    earnedLeave: ").append(toIndentedString(earnedLeave)).append("\n");
    sb.append("    maternityLeave: ").append(toIndentedString(maternityLeave)).append("\n");
    sb.append("    compOff: ").append(toIndentedString(compOff)).append("\n");
    sb.append("    lossOffPay: ").append(toIndentedString(lossOffPay)).append("\n");
    sb.append("    displayStatus: ").append(toIndentedString(displayStatus)).append("\n");
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
