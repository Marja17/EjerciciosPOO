package com.gatitos;

public class pruebaGato {
public static void main (String [] args) {
	Gato g = new Gato();
	//g.nombre = "Taco";
	//g.patas = 3;
	
	g.setNombre("Taco");
	g.setPatas(3);
	g.setAdoptado(false);
	
	System.out.println(g);
	System.out.println ("Mi gato se llama  " + g.getNombre ());

	
	/*//exepciones
	int num1 = 5, num2 = 0;
	int resultado = num1/num2; //error de tiempo de ejecucion 
	System.out.println(resultado);*/
	
	
}


}
