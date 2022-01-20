package com.homebrew.formula.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Formula {
	public String name;
	public String desc;
	public Versions versions;
	public ArrayList<Object> dependencies;
	public String generated_date;
	
}
