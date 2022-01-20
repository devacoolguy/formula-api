package com.homebrew.formula.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.homebrew.formula.model.Formula;

@Service
public class FormulaService {
	
	private Logger log = LoggerFactory.getLogger(FormulaService.class);

	@Autowired
	RestTemplate restTemplate;

	@Value("${formula.api}")
	String formulaApi;

	public Formula getFormula(String name) {
		log.debug("Calling formula api");
		return restTemplate.getForObject(formulaApi, Formula.class, name);
	}

	public String getFormulaApi() {
		return formulaApi;
	}

	public void setFormulaApi(String formulaApi) {
		this.formulaApi = formulaApi;
	}
}
