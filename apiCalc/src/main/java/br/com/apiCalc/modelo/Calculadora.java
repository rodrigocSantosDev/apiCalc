package br.com.apiCalc.modelo;

public class Calculadora {
	 
	  private Double numero01;
	  private Double numero02;
	  private String tipo;
	  private Double total;
	  private String tipos;
	  
	  public Calculadora(Double numero01, Double numero02, String tipo) {
	    this.numero01 = numero01;
	    this.numero02 = numero02;
	    this.tipo = tipo;
	    tipos= "adicao,multiplicacao,subitracao,divisao";
	  }

	  
	  
	public Double getNumero01() {
		return numero01;
	}

	public void setNumero01(Double numero01) {
		this.numero01 = numero01;
	}

	public Double getNumero02() {
		return numero02;
	}

	public void setNumero02(Double numero02) {
		this.numero02 = numero02;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}



	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

}	  
