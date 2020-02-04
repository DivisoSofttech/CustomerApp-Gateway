package com.diviso.graeshoppe.customerappgateway.client.administration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.*;

public class About   {
    
	private Long id;


    private String description;


    private String supportMail;

    private Long supportPhone;


    private String addOn1;


    private String addOn2;


    private String addOn3;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getSupportMail() {
		return supportMail;
	}


	public void setSupportMail(String supportMail) {
		this.supportMail = supportMail;
	}


	public Long getSupportPhone() {
		return supportPhone;
	}


	public void setSupportPhone(Long supportPhone) {
		this.supportPhone = supportPhone;
	}


	public String getAddOn1() {
		return addOn1;
	}


	public void setAddOn1(String addOn1) {
		this.addOn1 = addOn1;
	}


	public String getAddOn2() {
		return addOn2;
	}


	public void setAddOn2(String addOn2) {
		this.addOn2 = addOn2;
	}


	public String getAddOn3() {
		return addOn3;
	}


	public void setAddOn3(String addOn3) {
		this.addOn3 = addOn3;
	}


	@Override
	public String toString() {
		return "About [id=" + id + ", description=" + description + ", supportMail=" + supportMail + ", supportPhone="
				+ supportPhone + ", addOn1=" + addOn1 + ", addOn2=" + addOn2 + ", addOn3=" + addOn3 + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addOn1 == null) ? 0 : addOn1.hashCode());
		result = prime * result + ((addOn2 == null) ? 0 : addOn2.hashCode());
		result = prime * result + ((addOn3 == null) ? 0 : addOn3.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((supportMail == null) ? 0 : supportMail.hashCode());
		result = prime * result + ((supportPhone == null) ? 0 : supportPhone.hashCode());
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
		About other = (About) obj;
		if (addOn1 == null) {
			if (other.addOn1 != null)
				return false;
		} else if (!addOn1.equals(other.addOn1))
			return false;
		if (addOn2 == null) {
			if (other.addOn2 != null)
				return false;
		} else if (!addOn2.equals(other.addOn2))
			return false;
		if (addOn3 == null) {
			if (other.addOn3 != null)
				return false;
		} else if (!addOn3.equals(other.addOn3))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (supportMail == null) {
			if (other.supportMail != null)
				return false;
		} else if (!supportMail.equals(other.supportMail))
			return false;
		if (supportPhone == null) {
			if (other.supportPhone != null)
				return false;
		} else if (!supportPhone.equals(other.supportPhone))
			return false;
		return true;
	}
    
    

}