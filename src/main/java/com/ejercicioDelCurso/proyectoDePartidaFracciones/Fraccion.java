package main.java.com.ejercicioDelCurso.proyectoDePartidaFracciones;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
/*
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 */

	public static Fraccion simplifica(Fraccion entrada) {
		int num2= entrada.getDenominador();
		int num1= entrada.getNumerador();

		int temp1=num1;
		int temp2=num2;

		while (num1!=num2){
			if (num1> num2){
				num1=num1-num2;
			}else {
				num2=num2-num1;
			}
		}
		int num3= temp1/num1;
		int num4= temp2/num2;

		return new Fraccion(num3,num4);
	}

	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		int denmComun= sumando1.getDenominador()* sumando2.getDenominador();

		int numerdor1= sumando1.getNumerador()* sumando2.getDenominador();
		int numerador2= sumando2.getNumerador()* sumando1.getDenominador();
		Fraccion suma= new Fraccion(numerdor1+numerador2,denmComun);
		return simplifica(suma);
	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
		return simplifica(new Fraccion(sumando1.getNumerador()*sumando2.getDenominador(),sumando2.getNumerador()* sumando1.getDenominador()));
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
		return simplifica(new Fraccion(sumando1.getNumerador()*sumando2.getNumerador(),sumando2.getDenominador()* sumando1.getDenominador()));
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return numerador + " / " + denominador;
	}

}
