package com.homebrew.formula.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Versions {
	public String stable;
	public Object head;
	public boolean bottle;
	
}