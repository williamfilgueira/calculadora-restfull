package org.serratec.backend.projeto01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class HelloWordController {
	
	@GetMapping("/somar")
	public int Somar(@RequestParam Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam Integer n1, Integer n2) {
		return n1 - n2;
	}
	
	@GetMapping("/dividir")
	public  double dividir(@RequestParam double n1, double n2) {
		return n1/n2;
	}
	
	@GetMapping("/multiplicar")
	public  double mutiplicar(@RequestParam double n1, double n2) {
		return n1*n2;
	}
	
	@GetMapping("/restoDivisao")
	public String restoDivisao(@RequestParam double n1, double n2) {
		
		if(n1%n2==0) {
			return "O número é par" ; 
		} else {
			return "O número é impar";
		}
		
	}
	
	
}
