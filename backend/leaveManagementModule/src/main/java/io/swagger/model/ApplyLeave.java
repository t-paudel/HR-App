package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplyLeave
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-16T09:45:04.176Z[GMT]")
public class ApplyLeave   {
  @JsonProperty("employeeId")
  private String employeeId = null;

  @JsonProperty("leaveType")
  private String leaveType = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  public ApplyLeave employeeId(String employeeId) {
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

  public ApplyLeave leaveType(String leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * Get leaveType
   * @return leaveType
  **/
  @ApiModelProperty(value = "")

  public String getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(String leaveType) {
    this.leaveType = leaveType;
  }

  public ApplyLeave reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ApplyLeave startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ApplyLeave endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyLeave applyLeave = (ApplyLeave) o;
    return Objects.equals(this.employeeId, applyLeave.employeeId) &&
        Objects.equals(this.leaveType, applyLeave.leaveType) &&
        Objects.equals(this.reason, applyLeave.reason) &&
        Objects.equals(this.startDate, applyLeave.startDate) &&
        Objects.equals(this.endDate, applyLeave.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, leaveType, reason, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyLeave {\n");
    
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
