package com.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tacos taco1 = new Tacos ();
		
		taco1.setTipoDeTortilla("azul");
		taco1.setTipoDeGuisado("barbacoa");
		taco1.setNumeroDeTortilla(2);
		taco1.setTamanioDeLaTortilla("grande");
		
		System.out.println(taco1);
		System.out.println ("Mi taco es de  " + taco1.getTipoDeGuisado());

		
		
			//("Masa Azul", "Suadero", 2, "Mediana", 30);
		
		
		/*taco1.tipoDeTortilla = "Masa Azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla= 2;
		taco1.tamanioDeLaTortilla= "Mediana";
		taco1.precio = 30;*/
		/*taco1.SubirPrecio(5.5f);
		System.out.println(taco1.toString()); //se llama el método to string por defecfto 
		
		Tacos taco2 = new Tacos ();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeLaTortilla = "Grande";
		taco2.precio = 42.6f;
		taco2.tipoDeTortilla = "Trigo";
		
		System.out.println(taco2.toString());

		
		Tacos taco3 = new Tacos ("Maíz");
		System.out.println(taco3.toString());
				}*/

	}
	}
