package com.homebrew.formula;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.homebrew.formula.model.Formula;
import com.homebrew.formula.service.FormulaService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class HomebrewFormulaApplicationTests {
	
	@Autowired
	FormulaService formulaService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void getFormula() {
		Formula formula = formulaService.getFormula("wget");
		Assert.assertEquals("Internet file retriever", formula.desc);
	}

}
