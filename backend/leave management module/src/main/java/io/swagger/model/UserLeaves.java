package io.swagger.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserLeaves
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T06:17:29.965Z[GMT]")
@Document(collection="LEAVE_DATA")
public class UserLeaves   
{
  @Id
  @JsonProperty("employeeId")
  private String employeeId = null;

  @JsonProperty("sickLeave")
  private int sickLeave = 0;

  @JsonProperty("casualLeave")
  private int casualLeave = 0;

  @JsonProperty("earnedLeave")
  private int earnedLeave = 0;

  @JsonProperty("maternityLeave")
  private int maternityLeave = 0;

  @JsonProperty("compOff")
  private int compOff = 0;

  @JsonProperty("lossOffPay")
  private int lossOffPay = 0;

  @JsonProperty("displayStatus")
  private Boolean displayStatus = true;



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

  public UserLeaves sickLeave(int sickLeave) {
    this.sickLeave = sickLeave;
    return this;
  }

  /**
   * Get sickLeave
   * @return sickLeave
  **/
  @ApiModelProperty(value = "")

  public int getSickLeave() {
    return sickLeave;
  }

  public void setSickLeave(int sickLeave) {
    this.sickLeave = sickLeave;
  }

  public UserLeaves casualLeave(int casualLeave) {
    this.casualLeave = casualLeave;
    return this;
  }

  /**
   * Get casualLeave
   * @return casualLeave
  **/
  @ApiModelProperty(value = "")

  public int getCasualLeave() {
    return casualLeave;
  }

  public void setCasualLeave(int casualLeave) {
    this.casualLeave = casualLeave;
  }

  public UserLeaves earnedLeave(int earnedLeave) {
    this.earnedLeave = earnedLeave;
    return this;
  }

  /**
   * Get earnedLeave
   * @return earnedLeave
  **/
  @ApiModelProperty(value = "")

  public int getEarnedLeave() {
    return earnedLeave;
  }

  public void setEarnedLeave(int earnedLeave) {
    this.earnedLeave = earnedLeave;
  }

  public UserLeaves maternityLeave(int maternityLeave) {
    this.maternityLeave = maternityLeave;
    return this;
  }

  /**
   * Get maternityLeave
   * @return maternityLeave
  **/
  @ApiModelProperty(value = "")

  public int getMaternityLeave() {
    return maternityLeave;
  }

  public void setMaternityLeave(int maternityLeave) {
    this.maternityLeave = maternityLeave;
  }

  public UserLeaves compOff(int compOff) {
    this.compOff = compOff;
    return this;
  }

  /**
   * Get compOff
   * @return compOff
  **/
  @ApiModelProperty(value = "")

  public int getCompOff() {
    return compOff;
  }

  public void setCompOff(int compOff) {
    this.compOff = compOff;
  }

  public UserLeaves lossOffPay(int lossOffPay) {
    this.lossOffPay = lossOffPay;
    return this;
  }

  /**
   * Get lossOffPay
   * @return lossOffPay
  **/
  @ApiModelProperty(value = "")

  public int getLossOffPay() {
    return lossOffPay;
  }

  public void setLossOffPay(int lossOffPay) {
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
    return  Objects.equals(this.employeeId, userLeaves.employeeId) &&
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
    return Objects.hash(employeeId, sickLeave, casualLeave, earnedLeave, maternityLeave, compOff, lossOffPay, displayStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLeaves {\n");
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
