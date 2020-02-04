package com.diviso.graeshoppe.customerappgateway.client.administration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubTermDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:39:15.905+05:30[Asia/Kolkata]")

public class SubTerm   {

  private Long id;

  private String termDescription;

  private Long termId;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTermDescription() {
	return termDescription;
}

public void setTermDescription(String termDescription) {
	this.termDescription = termDescription;
}

public Long getTermId() {
	return termId;
}

public void setTermId(Long termId) {
	this.termId = termId;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((termDescription == null) ? 0 : termDescription.hashCode());
	result = prime * result + ((termId == null) ? 0 : termId.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SubTerm other = (SubTerm) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (termDescription == null) {
		if (other.termDescription != null)
			return false;
	} else if (!termDescription.equals(other.termDescription))
		return false;
	if (termId == null) {
		if (other.termId != null)
			return false;
	} else if (!termId.equals(other.termId))
		return false;
	return true;
}

@Override
public String toString() {
	return "SubTerm [id=" + id + ", termDescription=" + termDescription + ", termId=" + termId + "]";
}

 
  
}