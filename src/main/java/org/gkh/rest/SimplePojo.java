package org.gkh.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimplePojo {

	private long id;
	private String text;
	
	public SimplePojo() {	
	}
	
	public SimplePojo(long id, String text) {
		this.id = id;
		this.text = text;
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}
	
	@JsonProperty
	public String getText() {
		return text;
	}

}
