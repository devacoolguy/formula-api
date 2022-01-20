package com.homebrew.formula.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homebrew.formula.exception.FormulaNotFoundResponse;
import com.homebrew.formula.model.Formula;
import com.homebrew.formula.service.FormulaService;

@RestController
public class FormulaController {

	@Autowired
	FormulaService formulaService;

	private Logger log = LoggerFactory.getLogger(FormulaController.class);

	@GetMapping("/formula")
	public Formula getFormula(@RequestParam String name){
		log.info("Formula name: " + name);
		return formulaService.getFormula(name);
	}

	@ExceptionHandler(value = { RuntimeException.class })
	public ResponseEntity<Object> getError() {
		FormulaNotFoundResponse response = new FormulaNotFoundResponse();
		response.setMessage("Formula not found");
		response.setCode(404);
		response.setDateTime(LocalDateTime.now());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

	}

}
