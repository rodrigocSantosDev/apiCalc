package br.com.apiCalc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiCalc.modelo.Calculadora;
 

 
@RestController
public class CalculadoraController {
 
  private Calculadora calculadora;
 
  @RequestMapping(value = "/calculadora/{param01}/{tipo}/{param02}", method = RequestMethod.GET)
  public ResponseEntity<Calculadora> calcular(@PathVariable("param01") Double num01, @PathVariable("tipo") String tipo, @PathVariable("param02") Double num02) {
	  
	  tipo = tipo.toLowerCase();
	  
	  calculadora = new Calculadora(num01, num02, tipo);
	  
	  switch(tipo) {
	  case "adicao":
		  calculadora.setTotal(Double.sum(num01, num02));
	    break;
	  case "subtracao":
		  calculadora.setTotal(num01 - num02);
	    break;
	  case "multiplicacao":
		  calculadora.setTotal(num01 * num02);
		    break;	    
	  case "divisao":
		  calculadora.setTotal(0d);
		  calculadora.setTotal(num01 / num02);
		    break;		    
	  default:
		  return new ResponseEntity<Calculadora>(calculadora, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	  
   return new ResponseEntity<Calculadora>(calculadora, HttpStatus.OK);
   
  }
 
}
