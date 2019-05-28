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
 * Link
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T13:22:30.978+05:30[Asia/Kolkata]")

public class Link   {

	private LinkRel self;
	private LinkRel next;
	/**
	 * @return the self
	 */
	public LinkRel getSelf() {
		return self;
	}
	/**
	 * @param self the self to set
	 */
	public void setSelf(LinkRel self) {
		this.self = self;
	}
	/**
	 * @return the next
	 */
	public LinkRel getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(LinkRel next) {
		this.next = next;
	}
}

