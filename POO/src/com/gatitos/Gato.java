package com.gatitos;
//atributos
public class Gato {
private String nombre;
private int patas;
private boolean adoptado;

//getters y setters deben ser publico por convencion 


public String getNombre() {
	return this.nombre;
}

public Gato(String nombre, int patas, boolean adoptado) {
	super();
	this.nombre = nombre;
	this.patas = patas;
	this.adoptado = adoptado;
}

public Gato() {
	// TODO Auto-generated constructor stub
}

public  void setNombre (String nombre) {
	this.nombre = nombre;
}

public int getPatas() {
	return this.patas;
}

public void setPatas(int patas) {
	if (patas >= 0 && patas <5) { //o-4
		
		this.patas = patas;
		
	} else {
		throw new IllegalArgumentException("El número de patas no es valido");
	}
	//this.patas = patas;
}

public boolean isAdopatado () {
	return this.adoptado;
}

public void setAdoptado (boolean adoptado) {//is porque se hace una pregunta
	this.adoptado = adoptado;
}

@Override
public String toString() {
	return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
}




}

