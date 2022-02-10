package com.generation;

public class Tacos {
	
	private String tipoDeTortilla; 
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeLaTortilla;
	private float precio = 0.0f;
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}
	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if (numeroDeTortilla >= 1 && numeroDeTortilla <3) {
			this.numeroDeTortilla = numeroDeTortilla;
		} else {
			throw new IllegalArgumentException("Es mucha tortilla para un taco");
		}
		
	}
	public String getTamanioDeLaTortilla() {
		return tamanioDeLaTortilla;
	}
	public void setTamanioDeLaTortilla(String tamanioDeLaTortilla) {
		this.tamanioDeLaTortilla = tamanioDeLaTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	/*public Tacos () {
		
	}
	
	public Tacos (String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	//El contructos nos ayuda a crear objetos, a inicializar objetos 
	public Tacos (String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla,
			String tamanioDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeLaTortilla = tamanioDeTortilla;
		this.precio = precio;
		
		
	}
	
	
	
	
	void preparar () {
		System.out.println ("Preparar tu rico taco");
	}
	
	void vender () {
		System.out.println ("Taco vendido");
	}
	
	void ponerSalsa () {
		System.out.println ("Agragar salsa de la que no pica");
	}
	
	void SubirPrecio (float aumento) {
		precio = precio + aumento;
	}
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeLaTortilla=" + tamanioDeLaTortilla + ", precio=" + precio + "]";
	}*/
	
	
}
